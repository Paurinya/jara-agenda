package classes;

import java.util.LinkedList;

public class Contacte {
    //Atributs
    private String nom;
    private String cognom;
    private LinkedList<Telefon> llistaTelefons;
    private LinkedList<Adressa> llistaAdreces;
    //Constructor

    public Contacte() {
        this.nom = "buit";
        this.cognom = "buit";
    }

    public Contacte(String nom, String cognom) {
        this.nom = nom;
        this.cognom = cognom;
    }

    public Contacte(String nom) {
        this.nom = nom;
        this.cognom = "buit";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String _nom) {
        this.nom = _nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String _cognom) {
        this.cognom = _cognom;
    }

    public LinkedList<Telefon> getLlistaTelefons() {
        return llistaTelefons;
    }

    public void setLlistaTelefons(LinkedList<Telefon> _llistaTelefons) {
        this.llistaTelefons = _llistaTelefons;
    }

    public LinkedList<Adressa> getLlistaAdreces() {
        return llistaAdreces;
    }

    public void setLlistaAdreces(LinkedList<Adressa> _llistaAdreces) {
        this.llistaAdreces = _llistaAdreces;
    }
}

