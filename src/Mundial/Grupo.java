package Mundial;

import java.util.ArrayList;

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
        ArrayList<Equipo> equiposQueAvanzan = new ArrayList<>();
        for (int i = 0; i < getPartidos().size(); i++) {//para la suma de puntajes
            if (getPartidos().get(i).getResultado().ganoLocal()) {
                getPartidos().get(i).getLocal().setPuntaje(+3);
            } else {
                getPartidos().get(i).getVisitante().setPuntaje(+3);

            }
        }

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

