public class Giocatore {
    int numero_giocatore;
    String nome;
    char simbolo;

    Giocatore(int number)
    {
        this.numero_giocatore=number;
    }
    Giocatore(int number,String name)
    {
        this(number);
        this.nome=name;
    }
    Giocatore(int number,String name,char symbol)
    {
        this(number,name);
        this.simbolo=symbol;
    }

    
}
