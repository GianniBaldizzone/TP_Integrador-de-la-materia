package Garage.vehiculos;

public class Vehiculo {
    private String marca;
    private double kilometraje;

    private int numeroDeRuedas;


    public int getNumeroDeRuedas() {
        return numeroDeRuedas;
    }

    public void setNumeroDeRuedas(int numeroDeRuedas) {
        this.numeroDeRuedas = numeroDeRuedas;
    }

    public Vehiculo(String marca, double kilometraje) {
        this.marca = marca;
        this.kilometraje = kilometraje;
        this.numeroDeRuedas = numeroDeRuedas;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }


}
