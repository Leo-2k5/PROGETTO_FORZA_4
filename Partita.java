public class Partita {
    
    Match[] partita;

    Partita(int numero_match)
    {
        this.partita=new Match[numero_match];
    }

    public void Inizia_Partita()
    {
        System.out.println("inizializza numeri di match");
    }
}
