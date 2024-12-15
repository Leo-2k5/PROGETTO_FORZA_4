public class Giocatore {
    //pensavo costruire ogni giocatore con nome e simbolo ovvio,in piu stavo pensando aggiungere 
    //int numero giocatore perche il testo dice che poi dovrei scegliere a caso chi dei due inizia
    //quindi pensavo estrarre random un numero tra 1 e 2 che indicherà poi quale giocatore inizia,
    //se il giocatore 1 o 2,appena instanziamo i giocatore in automatico passiamo 1 o 2

    
    String nome;
    char simbolo;

    Giocatore(String name)
    {
        this.nome=name;
    }
    Giocatore(String name,char symbol)
    {
        this(name);
        this.simbolo=symbol;
    }

    
}
