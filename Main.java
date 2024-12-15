public class Main
{
    public static void main(String[] args)
    {
        //instanzio gestore input per ogni volta chiamarlo
        GestioneInput input=new GestioneInput();

        
        //1. All’inizio, i due giocatori dovranno inserire il loro nome ed il simbolo con il quale
        //verranno identificati i propri gettoni.
        //2. Dovrà essere richiesto il numero totale di match che si intendono giocare, fino
        //ad un massimo di 15. Per evitare condizioni di parità, in numero di match dovrà
        //essere dispari.
        System.out.println("quante match vuoi fare?");
        Partita partita=new Partita(input.ControllaInt(15));
        partita.ConfiguraGiocatori(input);

        //3. Ad ogni match, dovrà essere sorteggiato casualmente il giocatore che inizia per
        //primo.

        
        
        //4. A turno, ogni giocatore dovrà scegliere una colonna in cui inserire il suo gettone
        //(da 1 a 7).

        //5. Se la colonna selezionata risulterà già essere piena, ne dovrà essere selezionata
        //immediatamente un’altra.

        //6. Ad ogni mossa compiuta, il tabellone dovrà essere controllato per vedere se il
        //giocatore ha generato una serie continua di 4 gettoni in orizzontale, verticale o
        //in diagonale. In caso affermativo, il giocatore si aggiudicherà il match.

        //7. Nel caso il tabellone si dovesse riempire senza alcun vincitore, il match terminerà
        //senza vincitore e dovrà essere ripetuto.


        
        input.RilasciaInput();
    }
}