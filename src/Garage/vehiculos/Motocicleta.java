package Garage.vehiculos;

public class Motocicleta extends Vehiculo{
    private double cilindrada;




    public Motocicleta(String marca, double kilometraje, double cilindrada) {
        super(marca, kilometraje);
        this.cilindrada = cilindrada;
        this.setNumeroDeRuedas(2);
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return " Motocicleta{" +
                "Marca:"+ getMarca() +" - "+
                "Cilindrada: " + getCilindrada() + " - "+
                "Kilometraje: " + getKilometraje()+" - "+
                " }";
    }
}
