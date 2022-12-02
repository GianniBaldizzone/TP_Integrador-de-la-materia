import java.util.ArrayList;

public class Grupo extends EtapaMundial{
    public Grupo(String descripcionEtapa, ArrayList<Partido> partidos) {
        super(descripcionEtapa, partidos);

    }


    public ArrayList<Equipo> getEquiposQueAvanzan() {
        ArrayList<Equipo> equiposQueAvanzan = new ArrayList<>();
        for (int i=0;i<getPartidos().size();i++){
            if(getPartidos().get(i).getResultado().ganoLocal()) {
                equiposQueAvanzan.add(getPartidos().get(i).getLocal());
            } else {
                equiposQueAvanzan.add(getPartidos().get(i).getVisitante());
            }

        }
        return equiposQueAvanzan;

    }
}
