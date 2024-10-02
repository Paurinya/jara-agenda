package classes;

import java.util.LinkedList;

public class Agenda {
    private LinkedList<Contacte> llistaContactes;
    public Agenda() {
        this.llistaContactes = new LinkedList<>();
    }

    public LinkedList<Contacte> getLlistaContactes() {
        return llistaContactes;
    }
    public void setLlistaContactes(LinkedList<Contacte> _llistaContactes) {
        this.llistaContactes = _llistaContactes;
    }
    public void agregarContacte(Contacte contacte) {
        this.llistaContactes.addLast(contacte);
    }

}
