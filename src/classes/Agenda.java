package classes;

import java.util.LinkedList;

public class Agenda {
    // Atributs
    private LinkedList<Contacte> llistaContactes;
    // Constructors
    public Agenda() {
        this.llistaContactes = new LinkedList<>();
    }

    // Getters y Setters

    public LinkedList<Contacte> getLlistaContactes() {
        return llistaContactes;
    }

    public void setLlistaContactes(LinkedList<Contacte> _llistaContactes) {
        this.llistaContactes = _llistaContactes;
    }

    public void afegirContacte(Contacte contacte) {
        String nomContacte, cognomContacte;
        boolean existeixElContacte = false;

        nomContacte = contacte.getNom();
        cognomContacte = contacte.getCognom();
        existeixElContacte = this.buscarContacte(nomContacte, cognomContacte);
        if (existeixElContacte) {

            System.out.println("Contacte amb nom "+contacte.getNom()+"ja existeix a la agenda");

        }else {

            this.llistaContactes.addLast(contacte);
            System.out.println("Contacte amb nom " + contacte.getNom() + " Contacte afegit correctament");
        }
    }

    public boolean buscarContacte(String nomContacteABuscar, String cognomContacteABuscar) {
        boolean trobat = false;
        if (llistaContactes.size() == 0) {
            trobat = false;
        } else  {
            for (int i = 0; i<this.getLlistaContactes().size(); i++) {
                if ((this.llistaContactes.get(i).getNom().toLowerCase().equals(nomContacteABuscar) &&
                        (this.llistaContactes.get(i).getCognom().toLowerCase().equals(cognomContacteABuscar)))) {
                    trobat = true;
                }
            }
        }
        return trobat;

    }

    public void eliminarContacte(Contacte contacte) {
        this.llistaContactes.remove(contacte);

    }

    public void modificarContacte(String nom, String cognom, Contacte contacteModificat) {
        for (int i = 0; i < llistaContactes.size(); i++) {
            Contacte contacte = llistaContactes.get(i);
            if (contacte.getNom().equals(nom) && contacte.getCognom().equals(cognom)) {
                llistaContactes.set(i, contacteModificat);
                return;
            }
        }
        System.out.println("No s'ha pogut modificar el contacte perquè no existeix.");
    }


    public void mostrarContactes() {
        if (llistaContactes.size() == 0) {
            System.out.println("La agenda esta buida1");
        } else  {
            for (int i = 0; i<this.getLlistaContactes().size(); i++) {
                System.out.println((i + 1 ) + ".- "+ llistaContactes.get(i).getNom() + " "+llistaContactes.get(i).getCognom());
            }
        }

    }
}


