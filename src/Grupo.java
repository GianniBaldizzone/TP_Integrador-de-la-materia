import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Grupo extends EtapaMundial{
    private ArrayList<Equipo> equipos;

    private Equipo primerLugarDelGrupo;
    private Equipo segundoLugarDelGrupo;

    public Equipo getPrimerLugarDelGrupo() {
        return primerLugarDelGrupo;
    }

    public void setPrimerLugarDelGrupo(Equipo primerLugarDelGrupo) {
        this.primerLugarDelGrupo = primerLugarDelGrupo;
    }

    public Equipo getSegundoLugarDelGrupo() {
        return segundoLugarDelGrupo;
    }

    public void setSegundoLugarDelGrupo(Equipo segundoLugarDelGrupo) {
        this.segundoLugarDelGrupo = segundoLugarDelGrupo;
    }

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

  public void fijarPuntajeDelGrupo(Grupo grupo) {
      for (int i = 0; i < grupo.getPartidos().size(); i++) {//para la suma de puntajes
          if (grupo.getPartidos().get(i).getResultado().ganoLocal()) {
              grupo.getPartidos().get(i).getLocal().setPuntaje(this.getPartidos().get(i).getLocal().getPuntaje() + 3);
          } else {
              grupo.getPartidos().get(i).getVisitante().setPuntaje(this.getPartidos().get(i).getVisitante().getPuntaje() + 3);

          }

      }
      for (int i = 0; i < grupo.getEquipos().size(); i++){
         System.out.println(grupo.getEquipos().get(i).getNombre()+" : "+grupo.getEquipos().get(i).getPuntaje()+" pts");
      }

  }
    public ArrayList<Equipo> getEquiposQueAvanzan() {
        ArrayList<Equipo> equiposQueAvanzan = new ArrayList<>(0);
        Collections.sort(equipos, Comparator.comparing(Equipo::getPuntaje));
        equiposQueAvanzan.add(equipos.get(equipos.size()-2));
        equiposQueAvanzan.add(equipos.get(equipos.size()-1));
        //System.out.println("Primer lugar: "+equipos.get(equipos.size()-1).getNombre());
        //System.out.println("Segundo lugar: "+equipos.get(equipos.size()-2).getNombre());
        return equiposQueAvanzan;
    }
            public void agregarEquipo(Equipo equipo ){
        getEquipos().add(equipo);
    }

}



//int primero = 0, segundo = 0, max = -1;
//        for (int i = 0; i < equipos.size(); i++) {//para guardar los que pasan de etapa
//            if (equipos.get(i).getPuntaje() > max) {
//                max = equipos.get(i).getPuntaje();
//                primero = i + 1;
//            }
//        }
//        for (int i = 0; i < equipos.size(); i++) {//para guardar los que pasan de etapa
//            if (equipos.get(i).getPuntaje() > max && equipos.get(i).getPuntaje() != max) {
//                max = equipos.get(i).getPuntaje();
//                this.setPrimerLugarDelGrupo(equipos.get(i));
//
//
//            }
//
//
//        }

