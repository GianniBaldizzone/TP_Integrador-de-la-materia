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
        System.out.println("Cuartos");
        cuartos.agregarPartidos(new Partido(new Date(3,4,2022),gianniTeam,gianniTeam2,new Resultado(3,0)));
        System.out.println(cuartos.getPartidos().get(0).getLocal().getNombre()+" "+cuartos.getPartidos().get(0).getResultado().getGolesLocales()+"-"+cuartos.getPartidos().get(0).getResultado().getGolesVisitantes()+" "+cuartos.getPartidos().get(0).getVisitante().getNombre());
        cuartos.agregarPartidos(new Partido(new Date(3,4,2022),gianniTeam1,gianniTeam3,new Resultado(2,4)));
        System.out.println(cuartos.getPartidos().get(1).getLocal().getNombre()+" "+cuartos.getPartidos().get(1).getResultado().getGolesLocales()+"-"+cuartos.getPartidos().get(1).getResultado().getGolesVisitantes()+" "+cuartos.getPartidos().get(1).getVisitante().getNombre());
        cuartos.agregarPartidos(new Partido(new Date(3,4,2022),gianniTeam4,gianniTeam6,new Resultado(5,2)));
        System.out.println(cuartos.getPartidos().get(2).getLocal().getNombre()+" "+cuartos.getPartidos().get(2).getResultado().getGolesLocales()+"-"+cuartos.getPartidos().get(2).getResultado().getGolesVisitantes()+" "+cuartos.getPartidos().get(2).getVisitante().getNombre());
        cuartos.agregarPartidos(new Partido(new Date(3,4,2022),gianniTeam5,gianniTeam7,new Resultado(4,1)));
        System.out.println(cuartos.getPartidos().get(3).getLocal().getNombre()+" "+cuartos.getPartidos().get(3).getResultado().getGolesLocales()+"-"+cuartos.getPartidos().get(3).getResultado().getGolesVisitantes()+" "+cuartos.getPartidos().get(3).getVisitante().getNombre());
        System.out.println("");

        Llave semifinal = new Llave("semifinal",new ArrayList<Partido>(0));
        System.out.println("Equipos que clasificaron a la semifinal");
        for (int i=0;i<cuartos.getEquiposQueAvanzan().size();i++) {
        System.out.println(cuartos.getEquiposQueAvanzan().get(i).getNombre());
        }
        System.out.println("");
        System.out.println("Semifinal");
        semifinal.agregarPartidos(new Partido(new Date(3,4,2022),cuartos.getEquiposQueAvanzan().get(0),cuartos.getEquiposQueAvanzan().get(2),new Resultado(2,4)));
        System.out.println(cuartos.getEquiposQueAvanzan().get(0).getNombre()+" "+semifinal.getPartidos().get(0).getResultado().getGolesLocales()+"-"+semifinal.getPartidos().get(0).getResultado().getGolesVisitantes()+" "+cuartos.getEquiposQueAvanzan().get(2).getNombre());
        semifinal.agregarPartidos(new Partido(new Date(3,4,2022),cuartos.getEquiposQueAvanzan().get(1),cuartos.getEquiposQueAvanzan().get(3),new Resultado(3,1)));
        System.out.println(cuartos.getEquiposQueAvanzan().get(1).getNombre()+" "+semifinal.getPartidos().get(1).getResultado().getGolesLocales()+"-"+semifinal.getPartidos().get(1).getResultado().getGolesVisitantes()+" "+cuartos.getEquiposQueAvanzan().get(3).getNombre());
        System.out.println("");

        Llave finalMundial = new  Llave("Final",new ArrayList<Partido>(0));
        System.out.println("Equipos que clasificaron a la final");
        for (int i=0;i<semifinal.getEquiposQueAvanzan().size();i++) {
            System.out.println(semifinal.getEquiposQueAvanzan().get(i).getNombre());
        }
        System.out.println("");
        System.out.println("Final");
        finalMundial.agregarPartidos(new Partido(new Date(3,4,2022),semifinal.getEquiposQueAvanzan().get(0),semifinal.getEquiposQueAvanzan().get(1),new Resultado(3,2)));
        System.out.println(semifinal.getEquiposQueAvanzan().get(0).getNombre()+" "+finalMundial.getPartidos().get(0).getResultado().getGolesLocales()+"-"+finalMundial.getPartidos().get(0).getResultado().getGolesVisitantes()+" "+semifinal.getEquiposQueAvanzan().get(1).getNombre());
        System.out.println("");
        System.out.println("GANADOR DEL MUNDIAL : "+finalMundial.getEquiposQueAvanzan().get(0).getNombre());
















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
