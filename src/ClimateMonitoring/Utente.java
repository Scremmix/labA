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
 *
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
    
    public static String getUsername()
    {return Utente.nome+" "+Utente.cognome;}
    
    public static String getCentro()
    {return Utente.idCentro;}
    
    public static boolean loggato()
    {
        return !(nomeUtente==null)&&!(password==null);
    }
    
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
        
        if(Utente.cerca(nome, nome)!=null)
            throw new utenteException("Utente con lo stesso ID già esistente.");
        //salvataggio su file da inserire
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
    
    private static String[] cerca(String nomeUtente, String pw)throws utenteException{
        try {
            FileReader read = new FileReader("datafiles/OperatoriRegistrati.csv");        //legge il file, riga per riga, prende ogni volta una riga in esame
            Scanner input = new Scanner(read);                                                //separa con "#" controlla con la stringa generata solo le 2 posizioni,
            while(input.hasNextLine()) {                                                            //che ci interessano "nome utente e psw".
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