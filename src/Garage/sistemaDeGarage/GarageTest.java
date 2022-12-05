package Garage.sistemaDeGarage;
import Garage.vehiculos.Vehiculo;
import Garage.vehiculos.Auto;
import Garage.vehiculos.Motocicleta;
public class GarageTest {
    public static void main(String[] args) {

        Garage garageGianni = new Garage(5,10);
        Vehiculo auto1 = new Auto("Ferrari",1500,4);
        Vehiculo auto2 = new Auto("Ferrari",1500,4);
        Vehiculo auto3 = new Auto("Ferrari",1500,4);
        Vehiculo auto4 = new Auto("Ferrari",1500,4);
        Vehiculo auto5 = new Auto("Ferrari",1500,4);
        Vehiculo moto6 = new Motocicleta("Benelli",3000,250);
        Vehiculo moto7 = new Motocicleta("Benelli",3000,250);
        Vehiculo moto8 = new Motocicleta("Benelli",3000,600);
        Vehiculo moto9 = new Motocicleta("Benelli",3000,600);

        garageGianni.agregarVehiculo(auto1);
        garageGianni.agregarVehiculo(auto2);
        garageGianni.agregarVehiculo(auto3);
        garageGianni.agregarVehiculo(auto4);
        garageGianni.agregarVehiculo(auto5);
        garageGianni.agregarVehiculo(moto6);
        garageGianni.agregarVehiculo(moto7);
        garageGianni.agregarVehiculo(moto8);
        garageGianni.agregarVehiculo(moto9);

        garageGianni.mostrarInformacionDelGarajeYSusVehiculosActuales();
        garageGianni.precioQueSupondríaCambiarTodasLasRuedasDeTodosLosVehículosActuales();
        garageGianni.kilometrajePromedio();



    }

}
