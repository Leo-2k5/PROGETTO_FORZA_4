import java.util.Scanner;

public class GestioneInput {
    
    Scanner input;

    GestioneInput()
    {
        this.input=new Scanner(System.in);
    }

    public void RilasciaInput()
    {
        this.input.close();
    }

    public String ControllaString()
    {
        String stringa;
        while(!((stringa=input.nextLine())!=null)) { 
            System.out.println("non valido");
            input.nextLine();
        }
        
        return stringa;
    }

    public char  ControllaSimbolo()
    {
        String stringa;
        while(!((stringa=input.nextLine())!=null) || stringa.length()>1) { 
            System.out.println("non valido o troppo lungo");
            input.nextLine();
        }
        

        //non so come fare il controllo del simbolo,perchè scanner non ha un metodo per controllare
        //l'immissione di un carattere ma allo stesso tempo non posso passare una stringa
        //allora semplicemente richiedo una stringa con un solo carattere
        //carattere che riprendo con stringa.charAt(0)
        return stringa.charAt(0);
    }

    public int ControllaInt(int max)
    {
        int colonna;
        while (!(input.hasNextInt()) || !((colonna=input.nextInt())>0 && colonna<=max)) { 
            System.out.println("riprova");
            input.nextLine();
        }

        return colonna;
    }
    
}
