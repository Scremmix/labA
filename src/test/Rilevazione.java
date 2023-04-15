package test;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Rilevazione {
    private String centro; //esempio: Insubria
    private long area; //esempio: 3178229 (ID per l'area di Como, IT)
    private int tipoDato, valore; //esempio: 3=Temperatura, 4 valore
    private String nota;
    private String data, ora;
    
    public Rilevazione(String centro, long area, int tipoDato, int valore, String nota)
    {
        this.centro=centro;
        this.area=area;
        this.tipoDato=tipoDato;
        this.valore=valore;
        this.nota=nota;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        this.data=dtf.format(now);
        dtf = DateTimeFormatter.ofPattern("HH:mm");  
        this.ora=dtf.format(now);
    }
    
    public Rilevazione()
    {
        centro="";
        area=0;
        tipoDato=-1;
        valore=0;
        nota="";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        this.data=dtf.format(now);
        dtf = DateTimeFormatter.ofPattern("HH:mm");  
        this.ora=dtf.format(now);
    }
    
    public void SalvaRilevazione(){
        try (FileWriter writer = new FileWriter("../datafiles/ParametriClimatici.csv",true)) {
            writer.write(
                    centro+"#"+area+"#"+data+"#"+ora+"#"+tipoDato+"#"+valore+"#"+nota+"\n"
                );
            writer.close();
        }
        catch(IOException e){
                            System.out.println("Errore durante il salvataggio dei dati climatici.");
        }
    }
}