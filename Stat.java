import java.text.DecimalFormat;

public class Stat {
    String nazevStatu;
    int pocetObyvatel;
    int pocetNakazenych;
    int pocetUmrti;

    DecimalFormat df = new DecimalFormat("#.###");
    
    public Stat(String nazevStatu, int pocetObyvatel, int pocetNakazenych, int pocetUmrti) {
        this.nazevStatu = nazevStatu;
        this.pocetObyvatel = pocetObyvatel;
        this.pocetNakazenych = pocetNakazenych;
        this.pocetUmrti = pocetUmrti;
      
    }
    
    public String vratNazevStatu() {
        
        return nazevStatu;
    }
    
    public int vratPocetObyvatel() {
        
        return this.pocetObyvatel;
    }
    
    public String vratProcentoNakazenych() {
        double procentoNakzenych = (double)this.pocetNakazenych / this.pocetObyvatel * 100;

        return df.format(procentoNakzenych);
    }
    
    public String vratProcentoSmrtiNakazenych() {
        
        double procentoSmrtiNakazenych = (double)this.pocetUmrti / this.pocetNakazenych * 100;

        return df.format(procentoSmrtiNakazenych);

    }
}
