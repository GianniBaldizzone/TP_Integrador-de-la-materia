package Garage;

public class Auto extends Vehiculo{
    private int numeroDePuertas;

    public Auto(String marca, double kilometraje, int numeroDeRuedas, int numeroDePuertas) {
        super(marca, kilometraje, numeroDeRuedas = 4);
        this.numeroDePuertas=numeroDePuertas;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "Marca:"+ getMarca() +" / "+
                "Numero de Puertas: " + getNumeroDePuertas() +" / "+
                "Kilometraje: " + getNumeroDePuertas() +
                '}';
    }
}
