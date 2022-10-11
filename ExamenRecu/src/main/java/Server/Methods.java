package Server;

public class Methods {

    String numeroSerie;
    String marca;
    String modelo;
    String color;

    public Methods(String numeroSerie, String marca, String modelo, String color) {
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public Methods(){

    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



}
