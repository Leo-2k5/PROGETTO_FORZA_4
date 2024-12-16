public class Campo {
    //non so ancora bene che fare ma sento che serve questa classe
    //faccio io la classe baby .E

    private static char RIGA = '-';
    private static char COLONNA = '|';

    char[][] campo;

    Campo(){
        this.campo = new char[7][15];

        //La prima riga è riservata per mettere l'indice della colonna
        int counter = 0;
        for (int i = 0; i < campo[0].length-1; i++) {
            if(i%2==1){
                campo[0][i] = (char)(49+counter++);
            } else{
                campo[0][i] = ' ';
            }
        }

        //parte da uno per lasciare spazio alla prima riga che è riservata vedi linea 15
        for (int i = 1; i < campo.length; i++) {

        //Il codice in grigio serve per stampare per ogni riga dispari il separatore ma sto pensando che in relta lo possiamo 
        //aggiungere i separatori durante lo stampa schermo che rende la logica molto piu facile da gestire siccome
        //non dobbiamo sempre ricordarci che c'è il campo

           /*  if (i%2!=0) {
                for (int j = 0; j < campo[i].length; j++) {
                    campo[i][j] = RIGA;
                }
            }*/

            for (int j = 0; j < campo[i].length; j++) {
                //tutti i indici dispari
                if(j%2==1){
                    campo[i][j] = ' ';
                } else{
                    campo[i][j] = COLONNA;
                }

            }
        }



    }

    void stampaCampo(){

        System.out.println("_______________________________________________\n");

        for (int i = 0; i < campo.length; i++) {
            for (int j = 0; j < campo[i].length; j++) {
                //Questa eccezzione esiste per avere la stampa piu pulita siccome l'uno è al bordo del terminale
                 if (j==0) {
                    System.out.print("  "+this.campo[i][j]);
                } else{
                    System.out.print(" " + this.campo[i][j]);
                }
                

            }
            System.out.println();
            System.out.println("  "+"-----------------------------");
        }

        System.out.println("_______________________________________________");
    }

    


    
}
