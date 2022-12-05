package Garage;

import java.util.ArrayList;

public class Garage {
    private double precioDeCambioDeUnaRueda;
    private int capacidadDeVehiculos;
    private ArrayList<Vehiculo> vehiculos;
    private int contadorDeVehiculosActuales;


    public Garage(double precioDeCambioDeUnaRueda, int capacidadDeVehiculos) {
        this.precioDeCambioDeUnaRueda = precioDeCambioDeUnaRueda;
        this.capacidadDeVehiculos = capacidadDeVehiculos;
        this.contadorDeVehiculosActuales= 0;
        this.vehiculos = new ArrayList<Vehiculo>(0);
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
public double precioQueSupondríaCambiarTodasLasRuedasDeTodosLosVehículos(){
        new double
        for (int i=0;i<getVehiculos().size();i++){

        }
}
    public void mostrarInformacionDelGarajeYSusVehiculosActuales(){
        System.out.println("Cantidad de vehiculos actuales: "+getContadorDeVehiculosActuales());
        System.out.println("");
        System.out.println("Capacidad maxima de vehiculos: "+getCapacidadDeVehiculos());
        System.out.println("");
        System.out.println("Precio de cambio de una rueda: "+getPrecioDeCambioDeUnaRueda());

        for (int i=0;i<getVehiculos().size();i++){
            System.out.println("*** Información de los vehiculos ***");
            System.out.println(getVehiculos().get(i).toString());
        }
        System.out.println("");
    }


}
