import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        int quanti=0;
        Scanner in=new Scanner(System.in);
        int selezione;
        String parola;
        String[] nomi=new String[100];
        do{
            System.out.println("1 - Aggiunta di un nome;\n2 - Cancellazione del singolo nome;\n3 - Ricerca sequenziale di un nome;\n4 - Visualizza nomi ripetuti con numero ripetizioni;\n5 - Modifica di un nome;\n6 - Visualizzazione di tutti i nomi presenti;\n7 - Ricerca del nome più lungo e più corto;\n8 - Cancellazione di tutte le occorrenze di un nome;\n0 - Uscita ");
            selezione=in.nextInt();

            switch (selezione){

                case 1:
                    System.out.println("inserisci una parola");
                    parola=in.next();
                    aggiunta(parola, quanti, nomi);
                    quanti++;
                    break;

                case 2:
                    rimuovi(quanti, nomi);
                    quanti--;
                    break;

                case 3:
                    System.out.println("quale parola vuoi cercare");
                    parola=in.next();
                    presente(parola, nomi, quanti);
                    break;

                case 6:
                    visualizza(nomi, quanti);
                    System.out.println("");
                    break;

                case 8:
                    reset(quanti, nomi);
                    quanti=0;
                    break;

                default:
                    break;
            }


        }while(selezione!=0);
    }
    private static void aggiunta(String parola, int posizione, String[] x){
        x[posizione]=parola;
    }

    private static void rimuovi(int posizone, String[] x){
        x[posizone]=null;
    }

    private static void presente(String parola, String[] x, int posizione){
        boolean presente=false;
        for (int i=0;i<posizione;i++){
            if (parola.equals(x[i]))
                presente=true;
        }
        if (presente)
            System.out.println("la parola è presente");
        else
            System.out.println("la parola non è presente");
    }

    private static void visualizza(String[] x, int contatore){
        for (int i=0;i<contatore;i++){
            System.out.print(x[i]+"; ");
        }
    }

    private static void reset(int contatore, String[] x){
        for (int i=0;i<contatore;i++){
            x[i]="";
        }
    }


}