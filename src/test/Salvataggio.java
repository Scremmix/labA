package test;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Salvataggio {
    private int vento;
    private int umidita;
    private int pressione;
    private int temperatura;
    private int altitudineGhiacciai;
    private int massaGhiacci;
    
    private String stazione;
    private String via;
    private String numeroCivico; 
    private String cap;
    private String comune; 
    private String provincia;               
    private String area;
    
    public void setVento(int vento) {
        this.vento = vento;
    }
    public void setUmidita(int umidita) {
        this.umidita = umidita;
    }
    public void setPressione(int pressione) {
        this.pressione = pressione;
    }
    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
    public void setAltitudineGhiacciai(int altitudineGhiacciai) {
        this.altitudineGhiacciai = altitudineGhiacciai;
    }
    public void setMassaGhiacci(int massaGhiacci) {
        this.massaGhiacci = massaGhiacci;
    }
   
    public void setStazione(String stazione) {
        String toLowerCase = this.stazione.toLowerCase(); 
    }
    public void setVia(String via) {
        this.via = via;
    }
    public void setNumeroCivico(String numeroCivico) {
        this.numeroCivico = numeroCivico;
    }
    public void setCap(String cap) {
        this.cap = cap;
    }
    public void setComune(String comune) {
        this.comune = comune;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public void setArea(String area) {
        this.area = area;
    }
    
    public void SalvaDati(){
        try{
            File file = new File("CentriMonitoraggio.csv");
            try (Scanner scanner = new Scanner(file)) {
                scanner.useDelimiter("[\\r,]");
                while(scanner.hasNext())                                                                //controlla fino a che ci sono righe.
                {
                    String Stazione = scanner.next();
                    if(Stazione.equals(stazione))                                                       //Se il nome della stazione corrisponde con il nome
                    {                                                                                   //di una stazione salvata nel file appostio.
                        try{
                            try (FileWriter writer = new FileWriter("ParametriClimatici.csv",true)) {
                                writer.write("Stazione: "+ stazione + ", "+
                                        "Vento- " + vento +
                                        "; Umidita- " + umidita +
                                        "; Pressione- " + pressione +
                                        "; Temperatura- " + temperatura +
                                        "; AltitudineGhiacciai- " + altitudineGhiacciai +
                                        "; MassaGhiacci- " + massaGhiacci
                                        + ".\n");
                                writer.close();
                            }
                        }catch(IOException e){
                            System.out.println("Errore durante il salvataggio dei dati climatici");
                        }
                    }
                    else
                    {
                        try (FileWriter writer_ = new FileWriter("CentroMonitoraggio.csv",true)) {      //Se il nome della stazione non corrisponde con il nome
                            writer_.write(stazione + ", " +                                             //di NESSUNA stazione.
                                    "Indirizzo- " + via +
                                    "; Numero Civico- " + numeroCivico +
                                    "; Cap- " + cap +
                                    "; Comune- " + comune +
                                    "; Provincia- " + provincia +
                                    "; Area Interesse- " + area
                                    + ".\n");
                            writer_.close();
                        }catch(IOException e){
                            System.out.println("Errore durante il salvataggio dei dati del centro di monitoraggio");
                        }
                        try{
                            try (FileWriter writer = new FileWriter("ParametriClimatici.csv",true)) {       
                                writer.write("Stazione: "+ stazione + ", "+
                                        "Vento- " + vento +
                                        "; Umidita- " + umidita +
                                        "; Pressione- " + pressione +
                                        "; Temperatura- " + temperatura +
                                        "; AltitudineGhiacciai- " + altitudineGhiacciai +
                                        "; MassaGhiacci- " + massaGhiacci
                                        + ".\n");
                                writer.close();
                            }
                        }catch(IOException e){
                            System.out.println("Errore durante il salvataggio dei dati climatici");
                        }
                    }
                }
            }
        }catch(IOException e){
            System.out.println("Errore nel salvataggio dei dati");
        } 
    }
}
