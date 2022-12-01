import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Equipo gianniTeam = new Equipo("GianniTeam");
        Equipo gianniTeam1 = new Equipo("GianniTeam1");
        Equipo gianniTeam2 = new Equipo("GianniTeam2");
        Equipo gianniTeam3 = new Equipo("GianniTeam3");
        Equipo gianniTeam4 = new Equipo("GianniTeam4");
        Equipo gianniTeam5 = new Equipo("GianniTeam5");
        Equipo gianniTeam6 = new Equipo("GianniTeam6");
        Equipo gianniTeam7 = new Equipo("GianniTeam7");




        Llave cuartos = new Llave("cuartos",new ArrayList<Partido>(0));
        cuartos.agregarPartidos(new Partido(new Date(3,4,2022),gianniTeam,gianniTeam2,new Resultado(3,0)));
        System.out.println(cuartos.getPartidos().get(0).getResultado().getGolesLocales()+"-"+cuartos.getPartidos().get(0).getResultado().getGolesVisitantes());
        cuartos.agregarPartidos(new Partido(new Date(3,4,2022),gianniTeam1,gianniTeam3,new Resultado(3,0)));
        System.out.println();
        cuartos.agregarPartidos(new Partido(new Date(3,4,2022),gianniTeam4,gianniTeam6,new Resultado(3,0)));
        System.out.println();
        cuartos.agregarPartidos(new Partido(new Date(3,4,2022),gianniTeam5,gianniTeam7,new Resultado(3,0)));
        System.out.println();
        System.out.println(cuartos.getPartidos());

        Llave semifinal = new Llave("semifinal",new ArrayList<Partido>(0));
        semifinal.agregarPartidos(new Partido(new Date(3,4,2022),cuartos.getEquiposQueAvanzan().get(0),cuartos.getEquiposQueAvanzan().get(2),new Resultado(3,0)));
        semifinal.agregarPartidos(new Partido(new Date(3,4,2022),cuartos.getEquiposQueAvanzan().get(1),cuartos.getEquiposQueAvanzan().get(3),new Resultado(3,0)));
        System.out.println(semifinal.getPartidos());


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
