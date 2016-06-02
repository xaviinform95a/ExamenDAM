/**
 * @Author Xavi Molar
 * Examen DAM JavaDOC
 * @version 1.0
 */

import java.util.Scanner;
import java.util.Random;

public class Main_dolent {
	
	/**
	 * Declaració de les variables, on tenim un String paraules amb les possibles respostes correctes del joc,
	 * un integer index i un altre String "p"
	 *
	 */
	
    static protected String paraules[] = {"hola","programaciÃ³","casa"};
    static protected int introduides;
    static protected String hueco; 
    /**
     * S'inicia el joc i s'estableix la condició de que es podrá jugar mentres el numero de errors no sigui superior al numero de
     * lletres que estem buscant
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("ComenÃ§a el joc!");

        Random rand = new Random();
        introduides = rand.nextInt(3);
        hueco = "_";   //No estava inicialitzat
        for (int i=1; i<paraules[introduides].length(); i++) {
           hueco += "_";
        }

        System.out.println(hueco);

        Scanner reader = new Scanner(System.in); //Error, reader no tancat T_T

        int num_errors = 0;

        while (!hueco.equals(paraules[introduides]) && num_errors < 5) {
            if (!nova_lletra(reader.next().charAt(0))) {
                num_errors++;
            }
            System.out.println(hueco);
        }
   }
    
    
    
    /**
     * La funció principal aqui es demanar una nova lletra, tant si la introduida forma part de la paraula que estem buscant com si no
     * @param nova
     * @return trobada
     */
    static public boolean nova_lletra(char nova) {
        boolean trobada = false;
        String paraula_old = hueco;
        hueco = " ";
        for (int i=0; i<paraules[introduides].length(); i++) {
            if (paraules[introduides].charAt(i) == nova) {
                hueco += paraules[introduides].charAt(i);
                trobada = true;
            }
            else {
                hueco += paraula_old.charAt(i);
            }
        }
        return trobada;
    }

    
    /**
     * Fi del programa.
     */

}