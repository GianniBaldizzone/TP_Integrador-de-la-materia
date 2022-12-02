import java.util.ArrayList;

public class Grupo extends EtapaMundial{
    private ArrayList<Equipo> equipos;

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public Grupo(String descripcionEtapa, ArrayList<Partido> partidos) {
        super(descripcionEtapa, partidos);
        this. equipos = new ArrayList<Equipo>(0);

    }


    public ArrayList<Equipo> getEquiposQueAvanzan() {
        ArrayList<Equipo> equiposQueAvanzan = new ArrayList<>();
        for (int i=0;i<getPartidos().size();i++) {//para la suma de puntajes
            if (getPartidos().get(i).getResultado().ganoLocal()) {
                getPartidos().get(i).getLocal().setPuntaje(+2);
            } else {
                getPartidos().get(i).getVisitante().setPuntaje(+2);
                ;
            }
        }
        for (int i=0;i<equipos.size();i++){//para guardar los que pasan de etapa


        }
        return equiposQueAvanzan;

    }
    public void agregarEquipo(Equipo equipo ){
        getEquipos().add(equipo);
    }

}

