package Garage;

import java.util.ArrayList;

public class Garage {
    private double precioDeCambioDeUnaRueda;
    private int capacidadDeVehiculos;
    private ArrayList<Vehiculo> vehiculos;
    private int contadorDeVehiculosActuales;

    private double precioQueSupondríaCambiarTodasLasRuedasDeTodosLosVehículosActuales;
    private double kilometrajePromedio;

    public double getKilometrajePromedio() {
        return kilometrajePromedio;
    }

    public void setKilometrajePromedio(double kilometrajePromedio) {
        this.kilometrajePromedio = kilometrajePromedio;
    }

    public Garage(double precioDeCambioDeUnaRueda, int capacidadDeVehiculos) {
        this.precioDeCambioDeUnaRueda = precioDeCambioDeUnaRueda;
        this.capacidadDeVehiculos = capacidadDeVehiculos;
        this.contadorDeVehiculosActuales= 0;
        this.vehiculos = new ArrayList<Vehiculo>(0);
        this.precioQueSupondríaCambiarTodasLasRuedasDeTodosLosVehículosActuales=precioQueSupondríaCambiarTodasLasRuedasDeTodosLosVehículosActuales;
        this.kilometrajePromedio=kilometrajePromedio;
    }



    public double getPrecioQueSupondríaCambiarTodasLasRuedasDeTodosLosVehículosActuales() {
        return precioQueSupondríaCambiarTodasLasRuedasDeTodosLosVehículosActuales;
    }

    public void setPrecioQueSupondríaCambiarTodasLasRuedasDeTodosLosVehículosActuales(double precioQueSupondríaCambiarTodasLasRuedasDeTodosLosVehículosActuales) {
        this.precioQueSupondríaCambiarTodasLasRuedasDeTodosLosVehículosActuales = precioQueSupondríaCambiarTodasLasRuedasDeTodosLosVehículosActuales;
    }

    public double getPrecioDeCambioDeUnaRueda() {
        return precioDeCambioDeUnaRueda;
    }

    public void setPrecioDeCambioDeUnaRueda(double precioDeCambioDeUnaRueda) {
        this.precioDeCambioDeUnaRueda = precioDeCambioDeUnaRueda;
    }

    public int getCapacidadDeVehiculos() {
        return capacidadDeVehiculos;
    }

    public void setCapacidadDeVehiculos(int capacidadDeVehiculos) {
        this.capacidadDeVehiculos = capacidadDeVehiculos;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public int getContadorDeVehiculosActuales() {
        return contadorDeVehiculosActuales;
    }

    public void setContadorDeVehiculosActuales(int contadorDeVehiculosActuales) {
        this.contadorDeVehiculosActuales = contadorDeVehiculosActuales;
    }

    public void agregarVehiculo( Vehiculo vehiculos){
        if (getContadorDeVehiculosActuales()>=getCapacidadDeVehiculos()){
            System.out.println("Ha llegado a la capacidad maxima de vehiculos si desea agregar nuevos remueva alguno");
        }else {
            getVehiculos().add(vehiculos);
            this.contadorDeVehiculosActuales = getContadorDeVehiculosActuales() + 1;
            System.out.println("El vehiculo " + vehiculos.getMarca() + " fue agregado con exito");
        }
    }
    public void removerVehiculo( Vehiculo vehiculos){
        getVehiculos().remove(vehiculos);
        this.contadorDeVehiculosActuales= getContadorDeVehiculosActuales()-1;
        System.out.println("El vehiculo "+ vehiculos.getMarca()+" fue removido con exito");
    }
public void kilometrajePromedio(){
        for (int i=0;i<getVehiculos().size();i++){
            kilometrajePromedio =getKilometrajePromedio() + getVehiculos().get(i).getKilometraje();
        }
        kilometrajePromedio = getKilometrajePromedio()/getContadorDeVehiculosActuales();
    System.out.println("Kilometraje promedio entre todos los vehiculos: "+getKilometrajePromedio());
}
    public void precioQueSupondríaCambiarTodasLasRuedasDeTodosLosVehículosActuales(){
        for (int i=0;i<getVehiculos().size();i++){
            precioQueSupondríaCambiarTodasLasRuedasDeTodosLosVehículosActuales = precioQueSupondríaCambiarTodasLasRuedasDeTodosLosVehículosActuales + getVehiculos().get(i).getNumeroDeRuedas() * getPrecioDeCambioDeUnaRueda();
        }
        System.out.println("Precio de cambio de ruedas de todos los vehiculos actuales: "+getPrecioQueSupondríaCambiarTodasLasRuedasDeTodosLosVehículosActuales()+"$");
    }
    public void mostrarInformacionDelGarajeYSusVehiculosActuales(){
        System.out.println("");
        System.out.println("*** Información general del Garage ***");
        System.out.println("Cantidad de vehiculos actuales: "+getContadorDeVehiculosActuales());
        System.out.println("");
        System.out.println("Capacidad maxima de vehiculos: "+getCapacidadDeVehiculos());
        System.out.println("");
        System.out.println("Precio de cambio de una rueda: "+getPrecioDeCambioDeUnaRueda());
        System.out.println("");
        System.out.println("*** Información de los vehiculos ***");
        for (int i=0;i<getVehiculos().size();i++){

            System.out.println(getVehiculos().get(i).toString());
        }
        System.out.println("");
    }


}
