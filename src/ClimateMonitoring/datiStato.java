/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClimateMonitoring;

import static java.lang.Math.min;
import java.util.ArrayList;

/**
 * Metodo riguardanti i dati dello stato in cui deve essere eseguita la 
 * rilevazione
 * @author Lenovo
 */
public class datiStato 
{
    private String nomeStato="";
    private ArrayList<String[]> elencoDati;
    
    /**
     * metodo utile alla definizione del nome dello stato di ineresse
     * @param nomeStato : nome dello stato in questione
     */
    public datiStato(String nomeStato)
    {
        this.nomeStato=nomeStato;
        elencoDati= new ArrayList<String[]>();
    }
    
    /**
     * Metodo utile all'inserimento della località di interesse
     * @param dato relativo alla località di interesse
     * @throws datiStatoException eccezione che stabilisce che i dati inseriti
     * non sono corretti
     */
    public void inserireLocalita(String[] dato) throws datiStatoException
    {
        if(dato.length==6)
            elencoDati.add(dato);
        else
            throw new datiStatoException("Formato dati incorretto.");
    }
    
    /**
     * Metodo utile ad ottenere il nome dello stato in analisi
     * @return nome dello stato
     */
    public String daiNomeStato()
    {return this.nomeStato;}
    
    /**
     * Metodo utile alla ricerca di uno stato per nome ascii
     * @param nomeAscii : nome ascii dello stato
     * @return : risultato della ricerca
     */
    public ArrayList<String[]> cerca(String nomeAscii)
    {
        ArrayList<String[]> risultato= new ArrayList<String[]>();
        int primoEl= ricercaPrecisa(nomeAscii, 0, elencoDati.size()-1);
        if(primoEl==-1)
            return null;
        int tolleranza=0;
        try{
            while(elencoDati.get(primoEl-tolleranza)[2].
                       substring(0, 
                               min(nomeAscii.length(),elencoDati.get(primoEl-tolleranza)[2].length())
                       ).
                       compareToIgnoreCase(nomeAscii)
                  ==0)
            {
                risultato.add(0, elencoDati.get(primoEl-tolleranza));
                tolleranza++;
            }
        }catch(IndexOutOfBoundsException e){} 
        tolleranza=1;
        try{
            while(elencoDati.get(primoEl+tolleranza)[2].
                       substring(0, 
                               min(nomeAscii.length(),elencoDati.get(primoEl-tolleranza)[2].length())
                       ).
                       compareToIgnoreCase(nomeAscii)
                  ==0)
            {
                risultato.add(elencoDati.get(primoEl+tolleranza));
                tolleranza++;
            }
        }catch(IndexOutOfBoundsException e){} 
        return risultato;
    }
    
    /**
     * Ricerca il nome ascii della località passata come parametro tra riga
     * "min" e riga "max"
     * @param nome ascii della località
     * @param min : riga "min"
     * @param max : riga "max"
     * @return risultato della ricerca
     */
    private int ricercaPrecisa(String nome,int min, int max)
    {
        int media=(max+min)/2;
        
        String nomeInPos =elencoDati.get(media)[2];
        int risCompare=nomeInPos.substring(0, min(nomeInPos.length(),nome.length())).compareToIgnoreCase(nome);
        
        if(risCompare<0)
        {
            if(media==min)
                return -1;
            else
                return ricercaPrecisa(nome, media, max);
        }
        else if(risCompare>0)
        {
            if(media==max)
                return -1;
            else
                return ricercaPrecisa(nome, min, media);
        }
        else return media;
        
        //inserire per elemento non trovato
    }
}
