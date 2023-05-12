package ClimateMonitoring;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Rilevazione {
    private String centro; //esempio: Insubria
    private Long area=Long.valueOf(0); //esempio: 3178229 (ID per l'area di Como, IT)
    private int tipoDato, valore; //esempio: 3=Temperatura, 4 valore
    private String nota;
    private String data, ora;
    
    public Rilevazione(String centro, Long area, int tipoDato, int valore, String nota) throws rilevazioneException
    {
        this.centro=centro;
        this.area=area;
        if(this.area==null||this.area<0)
            throw new rilevazioneException("Nessuna area selezionata.");
        this.tipoDato=tipoDato;
        if(tipoDato==-1)
            throw new rilevazioneException("Nessuna tipologia selezionata.");
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
        area=Long.valueOf(0);
        tipoDato=-1;
        valore=0;
        nota="";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        this.data=dtf.format(now);
        dtf = DateTimeFormatter.ofPattern("HH:mm");  
        this.ora=dtf.format(now);
    }
    
    public void salvaRilevazione() throws rilevazioneException{
        try (FileWriter writer = new FileWriter("datafiles/ParametriClimatici.csv",true)) {
            writer.write(
                    centro+"#"+area.toString()+"#"+data+"#"+ora+"#"+tipoDato+"#"+valore+"#"+nota+"\n"
                );
            writer.close();
        }
        catch(IOException e){
             throw new rilevazioneException("Errore durante il salvataggio dei dati climatici.");
        }
    }
}