package classes;

public class Telefon {
    // Atributs
    private int numeroTelefon;
    private String etiqueta;

    // Constructor
    public Telefon(int _numeroTelefon, String _etiqueta) {
        this.numeroTelefon = _numeroTelefon;
        this.etiqueta = _etiqueta;
    }

    // Setters i Getters
    public int getNumeroTelefon() {
        return numeroTelefon;
    }

    public void setNumeroTelefon(int _numeroTelefon) {
        if(_numeroTelefon > 100000000 && _numeroTelefon < 999999999) {
            this.numeroTelefon = _numeroTelefon;
        }
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String _etiqueta) {
        this.etiqueta = _etiqueta;
    }


}
