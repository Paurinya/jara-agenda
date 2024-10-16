package aplicacio;

import classes.Adressa;
import classes.Agenda;
import classes.Contacte;
import classes.Teclat;
import eines.EinesJoan;
import menu.Menu;

import java.util.Scanner;

import static eines.EinesJoan.pintaLinia;

public class AppAgenda {
    static Agenda agenda = new Agenda();

    public static void mostrarContactes(){
        agenda.mostrarContactes();
    }

    public static void modificarContacte() {
        String nomContacte, cognomContacte;
        nomContacte = Teclat.llegirCadena("Entra el nom del contacte a modificar: ");
        cognomContacte = Teclat.llegirCadena("Entra el cognom del contacte a modificar: ");

        if (agenda.buscarContacte(nomContacte, cognomContacte)) {

            String nouNom = Teclat.llegirCadena("Entra el nou nom: ");
            String nouCognom = Teclat.llegirCadena("Entra el nou cognom: ");

            Contacte contacteModificat = new Contacte(nouNom, nouCognom);

            agenda.modificarContacte(nomContacte, cognomContacte, contacteModificat);

            System.out.println("Contacte modificat correctament.");
        } else {
            System.out.println("Contacte no trobat.");
        }
    }


    public static void buscarContactes(){
        String nomContacte, cognomContacte;
        nomContacte = Teclat.llegirCadena("Entra el nom del contacte: ");
        cognomContacte = Teclat.llegirCadena("Entra el cognom del contacte: ");
        if (agenda.buscarContacte(nomContacte, cognomContacte)){
            System.out.println("Contacte trobat");
        } else {
            System.out.println("Contacte no trobat");
        };
    }

    public static void afegirContacte(){
        String nomContacte, cognomContacte;
        nomContacte = Teclat.llegirCadena("Entra el nom del contacte: ");
        cognomContacte = Teclat.llegirCadena("Entra el cognom del contacte: ");
        Contacte nouContacte = new Contacte(nomContacte, cognomContacte);
        agenda.afegirContacte(nouContacte);
    }

    public static void eliminarContacte(){
        Scanner teclat = new Scanner(System.in);
        String nomContacte, cognomContacte;
        char resposta = 'N';

        nomContacte = Teclat.llegirCadena("Entra el nom del contacte: ");
        cognomContacte = Teclat.llegirCadena("Entra el cognom del contacte: ");
        Contacte contacteAEsborrar = new Contacte(nomContacte, cognomContacte);

        if (agenda.buscarContacte(nomContacte, cognomContacte)){
            System.out.println("Estas segur d'eliminar el contacte (S/N): ");
            resposta = teclat.next().charAt(0);
            if((resposta == 'S') || (resposta == 's')){
            agenda.eliminarContacte(contacteAEsborrar);
            System.out.println("Contacte eliminat correctament!");
        } else {
            System.out.println("Contacte no trobat");
        };
    }


    }

    public static void main(String[] args) {



        String[] opcions = {
                "Afegir Contacte",
                "Buscar Contacte",
                "Modificar Contacte",
                "Eliminar Contacte",
                "Mostrar Contactes",
                "Sortir"
        };
        boolean sortir = false;
        while (!sortir) {
            int opcio = Menu.obteOpcioMenu(opcions,
                    "Menu Principal",
                    "Escull una opció");
            switch (opcio) {
                case 1:
                    afegirContacte();
                    break;
                case 2:
                    buscarContactes();
                    break;
                case 3:
                    modificarContacte();
                    break;
                case 4:
                    eliminarContacte();
                    break;
                case 5:
                    mostrarContactes();
                    break;
                case 6:
//                    guardarAgenda(nomFitxerAmbAgenda);
                    sortir = true;
                    EinesJoan.pintaComiat();
                    break;
                default:
                    System.out.println("Opció no vàlida!");
            }
        }

//        String _carrer = "Av. Diagonal";
//        int _numeroCarrer = 34;
//        String _ciutat = "Barcelona";
//        String _codiPostal = "08030";
//        String _pais = "Espanya";
//
//        Adressa adressa = new Adressa(_carrer, _numeroCarrer, _ciutat, _codiPostal, _pais);
//
//        System.out.println("L'adressa té el carrer " + adressa.getCarrer() + " el número " + adressa.getNumeroCarrer());
//        String menu = "Menú";
//        System.out.println(menu);
//        pintaLinia(menu,"-");
    }
}