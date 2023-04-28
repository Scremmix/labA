/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class datiStato 
{
    private String nomeStato="";
    private ArrayList<String[]> elencoDati;
    
    public datiStato(String nomeStato)
    {
        this.nomeStato=nomeStato;
        elencoDati= new ArrayList<String[]>();
    }
    
    public void inserireDati(String[] dato) throws datiStatoException
    {
        if(dato.length==6)
            elencoDati.add(dato);
        else
            throw new datiStatoException("Formato dati incorretto");
    }
    
    public ArrayList<String[]> cerca(String nomeAscii)
    {
        ArrayList<String[]> risultato= new ArrayList<String[]>();
        int primoEl= ricercaPrecisa(nomeAscii, 0, elencoDati.size()-1);
        if(primoEl==-1)
            return null;
        int tolleranza=0;
        try{
            while(elencoDati.get(primoEl-tolleranza)[2].
                       substring(0, nomeAscii.length()).
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
                       substring(0, nomeAscii.length()).
                       compareToIgnoreCase(nomeAscii)
                  ==0)
            {
                risultato.add(elencoDati.get(primoEl-tolleranza));
                tolleranza++;
            }
        }catch(IndexOutOfBoundsException e){} 
        return risultato;
    }
    
    private int ricercaPrecisa(String nome,int min, int max)
    {
        int media=(max+min)/2;
        
        String nomeInPos =elencoDati.get(media)[2];
        int risCompare=nomeInPos.substring(0, nome.length()).compareToIgnoreCase(nome);
        
        if(risCompare<0)
        {
            if(media==min)
                return -1;
            else
                return ricercaPrecisa(nome, media+1, max);
        }
        else if(risCompare>0)
        {
            if(media==max)
                return -1;
            else
                return ricercaPrecisa(nome, min, media-1);
        }
        else return media;
        
        //inserire per elemento non trovato
    }
}
