import java.util.ArrayList;

public class Llave extends EtapaMundial{
    public Llave(String descripcionEtapa, ArrayList<Partido> partidos) {
        super(descripcionEtapa, partidos);
    }

   @Override
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

    @Override
    public String toString() {
        return super.toString();
    }
}
