package Garage.vehiculos;

public class Auto extends Vehiculo{
    private int numeroDePuertas;





    public Auto(String marca, double kilometraje, int numeroDePuertas) {
        super(marca, kilometraje);
        this.numeroDePuertas=numeroDePuertas;
        this.setNumeroDeRuedas(4);
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
                " Marca:"+ getMarca() +" - "+
                "Numero de Puertas: " + getNumeroDePuertas() +" - "+
                "Kilometraje: " + getNumeroDePuertas() +
                " }";
    }
}
