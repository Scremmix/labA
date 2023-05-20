/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClimateMonitoring;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Riguarda i processi di login e registrazione degli operatori
 * @author Lenovo
 */
public class Utente {
    
    private static String nomeUtente, password, nome, cognome,idCentro;
    public Utente()
    {
        nomeUtente= null;
        password= null;
        nome= null;
        cognome= null;
        idCentro=null;
    }
    
    /**
     * Il metodo richiede all'utente i dati utili al login 
     * @param nomeUtente
     * @param password
     * @return true in caso di successo, false altrimenti
     * @throws utenteException
     */
    public static boolean login(String nomeUtente, String password) throws utenteException
    {
        if(!loggato())
        {
            String[] rigaUtente=Utente.cerca(nomeUtente, password);
            if(rigaUtente!=null){
                    Utente.nomeUtente=nomeUtente;
                    Utente.password=password;
                    Utente.nome=rigaUtente[0];
                    Utente.cognome=rigaUtente[1];
                    Utente.idCentro=rigaUtente[6];
                    return true;
            }
            return false;
        }else return true;
    // nomeUtente qui è lo userID ndicato nei commenti sottostanti
    // per esempio, Francesco Totti effettua il login con 7930
    }
    
    /**
     * Metodo utile a ottenere i dati anagrafici dell'operatore attuale
     * @return nome e cognome
     */
    public static String getUsername()
    {return Utente.nome+" "+Utente.cognome;}
    
    /**
     * Utile a richiamare il centro di monitoraggio cui è abbinato l'operatore attuale
     * @return id del centro in questione
     */
    public static String getCentro()
    {return Utente.idCentro;}
    
    /**
     * Metodo utile a controllare se un operatore è attualmente connesso o meno
     * @return valore booleano corrispondente
     */
    public static boolean loggato()
    {
        return !(nomeUtente==null)&&!(password==null);
    }
    
    /**
     * Metodo utile alla registrazione di nuovi utenti
     * @param nome del nuovo utente
     * @param cognome del nuovo utente
     * @param password1 : primo inserimento di una password
     * @param password2 : secondo inserimento della password di cui verrà
     * controllata la corrispondenza con la prima
     * @param email del nuovo utente
     * @param userID del nuovo utente 
     * @param codiceFiscale del nuovo utente
     * @param idCentro di interesse, utile a sviluppare rilevazioni mirate
     * @return valore booleano che definisce il successo o il fallimento della 
     * registrazione
     * @throws utenteException eventuali errori in fase di registrazione
     */
    public static boolean register(String nome, String cognome, String password1, String password2, String email, String userID, String codiceFiscale, String idCentro) 
            throws utenteException
    {
        if(!password1.equals(password2))
            throw new utenteException("Le password non corrispondono.");
        
        if(!Pattern.compile(
                "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"+"[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$"
        ).matcher(email).matches())
            throw new utenteException("La mail inserita non è valida.");
        
        if(codiceFiscale.length()!=16)
            throw new utenteException("Il codice fiscale non è valido.");
        
        if(Utente.cerca(nome, password1)!=null)
            throw new utenteException("Utente con lo stesso ID già esistente.");
        //inserire i file nel formato:
        //nome#cognome#codiceFiscale#email#userID#password#centroID
        try (FileWriter writer = new FileWriter("datafiles/OperatoriRegistrati.csv",true)) {
            writer.write(
                    nome+"#"+cognome+"#"+codiceFiscale+"#"+email+"#"+userID+"#"+password1+"#"+idCentro+"\n"
                );
            writer.close();
            return true;
        }
        catch(IOException e){
            throw new utenteException("Impossibile trovare il file contenente gli utenti.");
        }
    }
    
    /**
     * metodo utile alla ricerca di un utente registrato su file
     * @param nomeUtente da ricercare
     * @param pw da ricercare
     * @return stabilisce il successo o il fallimento della ricerca
     * @throws utenteException errore nella ricerca del file contenente gli 
     * utenti
     */
    private static String[] cerca(String nomeUtente, String pw)throws utenteException{
        try {
            FileReader read = new FileReader("datafiles/OperatoriRegistrati.csv");
            Scanner input = new Scanner(read);
            while(input.hasNextLine()) {
                String line = input.nextLine();
                String[] parts = line.split("#");
                    if (parts[4].contains(nomeUtente) && parts[5].contains(pw))
                        return parts;
                }
        }catch(FileNotFoundException ex){
            throw new utenteException("Impossibile trovare il file contenente gli utenti.");
        }
        return null;
    }
}