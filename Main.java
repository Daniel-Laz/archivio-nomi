import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int quanti=0;
		Scanner in=new Scanner(System.in);
		int selezione;
		String[] nomi=new String[100];
		do{
		    System.out.println("1 - Aggiunta di un nome;\n2 - Cancellazione del singolo nome;\n3 - Ricerca sequenziale di un nome;\n4 - Visualizza nomi ripetuti con numero ripetizioni;\n5 - Modifica di un nome;\n6 - Visualizzazione di tutti i nomi presenti;\n7 - Ricerca del nome più lungo e più corto;\n8 - Cancellazione di tutte le occorrenze di un nome;\n0 - Uscita ");
		    selezione=in.nextInt();
		    
		    if (selezione==1){
		        System.out.println("inserisci una parola");
		        String parola=in.nextLine();
		        aggiunta(parola, quanti, nomi);
		        quanti++;
		    }
		    
		    if (selezione==6){
		        visualizza(nomi, quanti);
		    }
		    
		    
		}while(selezione!=0);
	}
	private static void aggiunta(String parola, int posizione, String[] nomi){
	    nomi[posizione]=parola;
	}
	
	private static void visualizza(String[] x, int contatore){
	    for (int i=0;i<contatore;i++){
	        System.out.println(x[i]+';');
	    }
	}

	    
}
