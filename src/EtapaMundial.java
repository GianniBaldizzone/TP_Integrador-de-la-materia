import java.util.ArrayList;

public class EtapaMundial {
    private String descripcionEtapa;
    private ArrayList<Partido> partidos;

    public EtapaMundial(String descripcionEtapa, ArrayList<Partido> partidos) {
        this.descripcionEtapa = descripcionEtapa;
        this.partidos = (new ArrayList<Partido>(0));
    }


    public void setDescripcionEtapa(String descripcionEtapa) {
        this.descripcionEtapa = descripcionEtapa;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }



    public String getDescripcionEtapa() {
        return descripcionEtapa;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public ArrayList<Equipo> getEquiposQueAvanzan() {
    return null;
    }

    public void agregarPartidos(Partido partido ){
        getPartidos().add(partido);
    }
    public void removerPartidos(Partido partido){
        getPartidos().add(partido);
    }

}
