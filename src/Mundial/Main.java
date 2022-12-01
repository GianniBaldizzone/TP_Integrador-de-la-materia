package Mundial;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Equipo gianniTeam = new Equipo("GianniTeam"); //finalista 1
        Equipo gianniniTeam = new Equipo("GianniniTeam"); //finalista 2
        Equipo gianniTeam1 = new Equipo("GianniTeam1"); //finalista 1
        Equipo gianniniTeam2 = new Equipo("GianniniTeam2"); //finalista 2


        //Final

        ArrayList<Equipo> semifinal = new ArrayList<Equipo>(); // semifinal.getEquiposQueAvanzan();
        semifinal.add(gianniTeam);
        semifinal.add(gianniniTeam);

        semifinal.add(gianniTeam1);
        semifinal.add(gianniniTeam2);

        Partido partidoSemi1 = new Partido(new Date(3,2,2022),semifinal.get(0), semifinal.get(1));
        partidoSemi1.setResultado(new Resultado(2,1));

        Partido partidoSemi2 = new Partido(new Date(3,2,2022),semifinal.get(0), semifinal.get(1));
        partidoSemi1.setResultado(new Resultado(2,1));

        ArrayList<Equipo> finalistas = new ArrayList<>();

        if(partidoSemi1.getResultado().ganoLocal()) {
            finalistas.add(partidoSemi1.getLocal());
        } else {
            finalistas.add(partidoSemi1.getVisitante());
        }

        if(partidoSemi2.getResultado().ganoLocal()) {
            finalistas.add(partidoSemi2.getLocal());
        } else {
            finalistas.add(partidoSemi2.getVisitante());
        }


        Llave finalMundial = new Llave();
        finalMundial.getEquiposQueAvanzan();

        Partido partidoFinal = new Partido(new Date(3,2,2022),finalistas.get(0), finalistas.get(1));
        Resultado resultadoPartidoFinal = new Resultado(2,1);
        partidoFinal.setResultado(resultadoPartidoFinal);

        ArrayList<Equipo> ganadores = new ArrayList<>();
        if(partidoFinal.getResultado().ganoLocal()) {
            ganadores.add(partidoFinal.getLocal());
        } else {
            ganadores.add(partidoFinal.getVisitante());
        }


        //resultadoPartido1.ganoLocal();
        //resultadoPartido1.empate();


















        //Equipo argentina = new Equipo("Argentina" );
        //Equipo polonia = new Equipo("Polonia");
        //Llave semifinalMundial = new Llave("Final", new ArrayList<>());
        //Partido partidoDelMiercoles = new Partido(new Date(2022, 10, 28), argentina, polonia);
        //partidoDelMiercoles.getResultado().setGolesLocales(3);
        //partidoDelMiercoles.getResultado().setGolesVisitantes(2);

        //ArrayList<Equipo> finalistas = semifinalMundial.getEquiposQueAvanzan();
        //Partido partidoFinalMundial = new Partido(new Date(), finalistas.get(0), finalistas.get(1));
        //partidoFinalMundial.getResultado().setGolesLocales(1);
        //ArrayList<Partido> partidosFinal = new ArrayList<>();
        //partidosFinal.add(partidoFinalMundial);
        //Llave finalMundial = new Llave("Final mundial", partidosFinal);
        //finalMundial.getEquiposQueAvanzan();





    }
}
