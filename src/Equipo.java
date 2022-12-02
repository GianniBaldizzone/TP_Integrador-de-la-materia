import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Partido> partidosJugados;

    private int puntaje;

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.partidosJugados = new ArrayList<Partido>(0);
        this.puntaje= puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Partido> getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(ArrayList<Partido> partidosJugados) {
        this.partidosJugados = partidosJugados;
    }
}
