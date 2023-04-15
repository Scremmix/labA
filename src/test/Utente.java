/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.regex.Pattern;

/**
 *
 * @author Lenovo
 */
public class Utente {
    
    private static String nomeUtente, password;
    private static String[][] m={
        {"aiefn45","Microfono62"},
        {"piero","carlo45"},
        {"carloconti","astolfo66"},
        {"dottorscotti","riso29"}
    };
    public Utente()
    {
        nomeUtente= null;
        password= null;
    }
    
    public static boolean login(String nomeUtente, String password)
    {
        if(!loggato())
        {
            for(String[] riga:m)
            {
                if(nomeUtente.equals(riga[0])&&password.equals(riga[1]))
                {
                    Utente.nomeUtente=nomeUtente;
                    Utente.password=password;
                    return true;
                }
            }
            return false;
        }else return true;
            
    }
    
    public static String getUsername()
    {return Utente.nomeUtente;}
    
    public static boolean loggato()
    {
        return !(nomeUtente==null)&&!(password==null);
    }
    
    public static void register(String nome, String cognome, String password1, String password2, String email, String codiceFiscale, int idCentro) 
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
        //salvataggio su file da inserire
        
    }
}