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
    static protected int index;
    static protected String p;
    
    
    /**
     * S'inicia el joc i s'estableix la condició de que es podrá jugar mentres el numero de errors no sigui superior al numero de
     * lletres que estem buscant
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("ComenÃ§a el joc!");

        Random rand = new Random();
        index = rand.nextInt(3);
        for (int i=0; i<paraules[index].length(); i++) {
            p += "_";
        }

        System.out.println(p);

        Scanner reader = new Scanner(System.in);

        int num_errors = 0;

        while (!p.equals(paraules[index]) && num_errors < 5) {
            if (!nova_lletra(reader.next().charAt(0))) {
                num_errors++;
            }
            System.out.println(p);
        }
   }
    
    
    
    /**
     * La funció principal aqui es demanar una nova lletra, tant si la introduida forma part de la paraula que estem buscant com si no
     * @param nova
     * @return
     */
    static public boolean nova_lletra(char nova) {
        boolean trobada = false;
        String paraula_old = p;
        p = "";
        for (int i=0; i<paraules[index].length(); i++) {
            if (paraules[index].charAt(i) == nova) {
                p += paraules[index].charAt(i);
                trobada = true;
            }
            else {
                p += paraula_old.charAt(i);
            }
        }
        return trobada;
    }
    
    /**
     * Fi del programa.
     */

}