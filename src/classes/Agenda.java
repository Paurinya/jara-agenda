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

            System.out.println("El contacte "+contacte.getNom()+"ja existeix a la agenda");

        }else {

            this.llistaContactes.addLast(contacte);
            System.out.println("El contacte " + contacte.getNom() + " esta afegit correctament");
        }
    }

    public boolean buscarContacte(String nom, String cognom) {
        // Convierte el nombre y el cognom ingresados a minúsculas
        String nomMin = nom.toLowerCase();
        String cognomMin = cognom.toLowerCase();

        for (Contacte contacte : llistaContactes) {
            // Compara los nombres y apellidos en minúsculas
            if (contacte.getNom().toLowerCase().equals(nomMin) && contacte.getCognom().toLowerCase().equals(cognomMin)) {
                return true; // Contacto encontrado
            }
        }
        return false; // Contacto no encontrado
    }


    public void eliminarContacte(Contacte contacte) {
        this.llistaContactes.remove(contacte);

    }

    public void modificarContacte(String nom, String cognom, Contacte contacteModificat) {
        // Convierte el nombre y el cognom ingresados a minúsculas
        String nomMin = nom.toLowerCase();
        String cognomMin = cognom.toLowerCase();

        for (int i = 0; i < llistaContactes.size(); i++) {
            Contacte contacte = llistaContactes.get(i);
            // Compara los nombres y apellidos en minúsculas
            if (contacte.getNom().toLowerCase().equals(nomMin) && contacte.getCognom().toLowerCase().equals(cognomMin)) {
                // Reemplaza el contacto existente con el modificado
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


