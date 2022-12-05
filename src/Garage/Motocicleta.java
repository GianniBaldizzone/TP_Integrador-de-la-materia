package Garage;

public class Motocicleta extends Vehiculo{
    private double cilindrada;

    public Motocicleta(String marca, double kilometraje, int numeroDeRuedas, double cilindrada) {
        super(marca, kilometraje, numeroDeRuedas=2);
        this.cilindrada = cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "Marca:"+ getMarca() +" / "+
                "cilindrada=" + getCilindrada() +
                "Kilometraje: " + getKilometraje()+" / "+
                '}';
    }
}
