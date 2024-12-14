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

    public String ControllaInpuString()
    {
        String stringa;
        while(!((stringa=input.nextLine())!=null)) { 
            System.out.println("non valido");
            input.nextLine();
        }

        return stringa;
    }

    //fai il controllo degli altri tipi di dato
}
