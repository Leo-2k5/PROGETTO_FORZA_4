public class Partita {
    //la partita è composta da piu match e penso in futuro gli aggiungero 
    //l'attributo vincitore 
    //dove un metodo di partita controlla che ogni partita giocata abbia un vincitore!= null
    // se è cosi vuol dire che ogni partita è stata giocata e quindi inizio a vedere chi ha vino piu volte
    //lui sara il vincitore della partita


    Match[] partita;
    //Giocatore vincitore;
    Giocatore[] giocatori;

    //il testo dice che noi decidiamo quante partite fare (max 15) quindi nel costruttore
    //passo solo l'int che avro controllato nel main sia giusto

    Partita(int n_match)
    {
        this.partita=new Match[n_match];
        this.giocatori=new Giocatore[2];
    }

    public void ConfiguraGiocatori(GestioneInput g)
    {

        //vedo se l'ultimo giocatore tra i partecipanti è stato inizializzato
        //se cosi fosse allora faccio return
        
        if(this.giocatori[giocatori.length-1]!=null)
        {
            System.out.println("giocatori inizializzati");
            return;
        }
        
        for (int i = 0; i < this.giocatori.length; i++) {
            this.giocatori[i]=new Giocatore(g.ControllaString(),g.ControllaSimbolo());
        }
    }

   
}
