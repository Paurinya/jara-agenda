package menu;

import java.util.InputMismatchException;
import classes.Teclat;

public class Menu {
    private static final int MAXIM = 100;
    private static final int ERROR = -1;

    private static final int CATALA = 1;
    private static final int CASTELLA = 2;
    private static final int ANGLES = 3;

    private static final int ERROR_OPCIO_DISPONIBLE = 0;
    private static final int ERROR_NO_ES_NOMBRE_ENTER = 1;

    private static String[][] vectorMissatges = {
        {   "Error!! Cal que entris una de les opcions disponibles!",
            "Error!! Es necesario que entres una de las opciones disponibles!",
            "Error!! You must enter one of the available options!"
        },
        {   "Error!! Cal que entris un nombre enter!",
            "Error!! ¡Hay que entrar un número entero!",
            "Error!! You must enter an integer!"
        }
    };



    private String titolMenu;

    // Constructor
    public Menu(String _titolMenu) {
        this.titolMenu = _titolMenu;
    }

    public static int obteOpcioMenu(String[] opcions, String titol, String missatge){
        int opcioEscollida;
        opcioEscollida = ERROR;
        boolean esCorrecte;
        do {
            mostraMenu(opcions, titol, missatge);
            try {
                esCorrecte = true;
                opcioEscollida = Teclat.llegirEnter();
                if ((opcioEscollida < 1) || (opcioEscollida > MAXIM)) {
                    System.out.println(vectorMissatges[ERROR_OPCIO_DISPONIBLE]);
                    esCorrecte = false;
                }
            } catch (InputMismatchException esUnaLletra) {
                System.out.println(vectorMissatges[ERROR_NO_ES_NOMBRE_ENTER]);
                esCorrecte = false;
            }
        } while(!esCorrecte);
        return opcioEscollida;
    }

    public static void mostraMenu(String[] opcions, String titol, String missatge){
        int midaTitol = titol.length();
        String cadenaOpcions = "";
        cadenaOpcions += " (";
        System.out.println();
        System.out.println(titol);
        System.out.println("=".repeat(midaTitol));
        for (int i = 0; i < opcions.length; i++) {
            System.out.format("%d - %s\n", (i+1) , opcions[i]);
            cadenaOpcions += (i+1);
            if(i<opcions.length-1){
                cadenaOpcions += ",";
            }
        }
        cadenaOpcions += "): ";
        System.out.println("=".repeat(midaTitol));
        System.out.print(missatge + cadenaOpcions);
    }
}
