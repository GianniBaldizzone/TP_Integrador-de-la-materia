import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Equipo catar = new Equipo("Catar");
        Equipo ecuador = new Equipo("Ecuador");
        Equipo holanda = new Equipo("Holanda");
        Equipo senegal = new Equipo("Senegal");

        Equipo  inglaterra = new Equipo("Inglaterra");
        Equipo  iran = new Equipo("Irán");
        Equipo  estadosUnidos = new Equipo("Estados Unidos");
        Equipo  gales = new Equipo("Gales");

        Equipo argentina = new Equipo("Argentina");
        Equipo mexico = new Equipo("Mexico");
        Equipo polonia = new Equipo("Polonia");
        Equipo arabiaSaudita = new Equipo("Arabia Saudita");

        Equipo francia = new Equipo("Francia");
        Equipo australia = new Equipo("Australia");
        Equipo dinamarca = new Equipo("Dinamarca");
        Equipo tunez = new Equipo("Túnez");

        Equipo españa = new Equipo("España");
        Equipo costaRica = new Equipo("Costa Rica");
        Equipo alemania = new Equipo("Alemania");
        Equipo japón = new Equipo("Japón");

        Equipo  bélgica = new Equipo("Bélgica");
        Equipo  canadá= new Equipo("Canadá");
        Equipo  marruecos= new Equipo("Marruecos");
        Equipo  croacia= new Equipo("Croacia");

        Equipo brasil= new Equipo("Brasil");
        Equipo serbia = new Equipo("Serbia");
        Equipo suiza = new Equipo("Suiza");
        Equipo camerún = new Equipo("Camerún");

        Equipo portugal = new Equipo("Portugal");
        Equipo ghana = new Equipo("Ghana");
        Equipo uruguay = new Equipo("Uruguay");
        Equipo coreaDelSur = new Equipo("Corea del Sur");

        Grupo grupoA = new Grupo("Grupa A",new ArrayList<Partido>(0));
        grupoA.agregarPartidos(new Partido(new Date(3,4,2022),,,new Resultado(0,2)));
        grupoA.agregarPartidos(new Partido(new Date(3,4,2022),,,new Resultado(0,2)));
        grupoA.agregarPartidos(new Partido(new Date(3,4,2022),,,new Resultado(0,2)));
        grupoA.agregarPartidos(new Partido(new Date(3,4,2022),,,new Resultado(0,2)));
        grupoA.agregarPartidos(new Partido(new Date(3,4,2022),,,new Resultado(0,2)));
        grupoA.agregarPartidos(new Partido(new Date(3,4,2022),,,new Resultado(0,2)));

        Grupo grupoB = new Grupo("Grupa B",new ArrayList<Partido>(0));

        Grupo grupoC = new Grupo("Grupa C",new ArrayList<Partido>(0));

        Grupo grupoD = new Grupo("Grupa D",new ArrayList<Partido>(0));

        Grupo grupoE = new Grupo("Grupa E",new ArrayList<Partido>(0));

        Grupo grupoF = new Grupo("Grupa F",new ArrayList<Partido>(0));

        Grupo grupoG = new Grupo("Grupa G",new ArrayList<Partido>(0));

        Grupo grupoH = new Grupo("Grupa H",new ArrayList<Partido>(0));























        //Llaves
        Equipo gianniTeam = new Equipo("GianniTeam");
        Equipo gianniTeam1 = new Equipo("GianniTeam1");
        Equipo gianniTeam2 = new Equipo("GianniTeam2");
        Equipo gianniTeam3 = new Equipo("GianniTeam3");
        Equipo gianniTeam4 = new Equipo("GianniTeam4");
        Equipo gianniTeam5 = new Equipo("GianniTeam5");
        Equipo gianniTeam6 = new Equipo("GianniTeam6");
        Equipo gianniTeam7 = new Equipo("GianniTeam7");
        Equipo gianniTeam8 = new Equipo("GianniTeam8");
        Equipo gianniTeam9 = new Equipo("GianniTeam9");
        Equipo gianniTeam10 = new Equipo("GianniTeam10");
        Equipo gianniTeam11 = new Equipo("GianniTeam11");
        Equipo gianniTeam12 = new Equipo("GianniTeam12");
        Equipo gianniTeam13 = new Equipo("GianniTeam13");
        Equipo gianniTeam14 = new Equipo("GianniTeam14");
        Equipo gianniTeam15 = new Equipo("GianniTeam15");

        Llave octavos = new Llave("octavos",new ArrayList<Partido>(0));
        System.out.println("Octavos");
        octavos.agregarPartidos(new Partido(new Date(3,4,2022),gianniTeam,gianniTeam2,new Resultado(3,0)));
        System.out.println(octavos.getPartidos().get(0).getLocal().getNombre()+" "+octavos.getPartidos().get(0).getResultado().getGolesLocales()+"-"+octavos.getPartidos().get(0).getResultado().getGolesVisitantes()+" "+octavos.getPartidos().get(0).getVisitante().getNombre());
        octavos.agregarPartidos(new Partido(new Date(3,4,2022),gianniTeam1,gianniTeam3,new Resultado(2,4)));
        System.out.println(octavos.getPartidos().get(1).getLocal().getNombre()+" "+octavos.getPartidos().get(1).getResultado().getGolesLocales()+"-"+octavos.getPartidos().get(1).getResultado().getGolesVisitantes()+" "+octavos.getPartidos().get(1).getVisitante().getNombre());
        octavos.agregarPartidos(new Partido(new Date(3,4,2022),gianniTeam4,gianniTeam6,new Resultado(5,2)));
        System.out.println(octavos.getPartidos().get(2).getLocal().getNombre()+" "+octavos.getPartidos().get(2).getResultado().getGolesLocales()+"-"+octavos.getPartidos().get(2).getResultado().getGolesVisitantes()+" "+octavos.getPartidos().get(2).getVisitante().getNombre());
        octavos.agregarPartidos(new Partido(new Date(3,4,2022),gianniTeam5,gianniTeam7,new Resultado(4,1)));
        System.out.println(octavos.getPartidos().get(3).getLocal().getNombre()+" "+octavos.getPartidos().get(3).getResultado().getGolesLocales()+"-"+octavos.getPartidos().get(3).getResultado().getGolesVisitantes()+" "+octavos.getPartidos().get(3).getVisitante().getNombre());
        octavos.agregarPartidos(new Partido(new Date(3,4,2022),gianniTeam8,gianniTeam10,new Resultado(3,0)));
        System.out.println(octavos.getPartidos().get(4).getLocal().getNombre()+" "+octavos.getPartidos().get(4).getResultado().getGolesLocales()+"-"+octavos.getPartidos().get(4).getResultado().getGolesVisitantes()+" "+octavos.getPartidos().get(4).getVisitante().getNombre());
        octavos.agregarPartidos(new Partido(new Date(3,4,2022),gianniTeam9,gianniTeam11,new Resultado(2,4)));
        System.out.println(octavos.getPartidos().get(5).getLocal().getNombre()+" "+octavos.getPartidos().get(5).getResultado().getGolesLocales()+"-"+octavos.getPartidos().get(5).getResultado().getGolesVisitantes()+" "+octavos.getPartidos().get(5).getVisitante().getNombre());
        octavos.agregarPartidos(new Partido(new Date(3,4,2022),gianniTeam12,gianniTeam14,new Resultado(5,2)));
        System.out.println(octavos.getPartidos().get(6).getLocal().getNombre()+" "+octavos.getPartidos().get(6).getResultado().getGolesLocales()+"-"+octavos.getPartidos().get(6).getResultado().getGolesVisitantes()+" "+octavos.getPartidos().get(6).getVisitante().getNombre());
        octavos.agregarPartidos(new Partido(new Date(3,4,2022),gianniTeam13,gianniTeam15,new Resultado(4,1)));
        System.out.println(octavos.getPartidos().get(7).getLocal().getNombre()+" "+octavos.getPartidos().get(7).getResultado().getGolesLocales()+"-"+octavos.getPartidos().get(7).getResultado().getGolesVisitantes()+" "+octavos.getPartidos().get(7).getVisitante().getNombre());
        System.out.println("");

        Llave cuartos = new Llave("cuartos",new ArrayList<Partido>(0));
        System.out.println("Equipos que clasificaron a cuartos");
        for (int i=0;i<octavos.getEquiposQueAvanzan().size();i++) {
            System.out.println(octavos.getEquiposQueAvanzan().get(i).getNombre());
        }
        System.out.println("");
        System.out.println("Cuartos");
        cuartos.agregarPartidos(new Partido(new Date(3,4,2022),octavos.getEquiposQueAvanzan().get(0),octavos.getEquiposQueAvanzan().get(1),new Resultado(3,0)));
        System.out.println(cuartos.getPartidos().get(0).getLocal().getNombre()+" "+cuartos.getPartidos().get(0).getResultado().getGolesLocales()+"-"+cuartos.getPartidos().get(0).getResultado().getGolesVisitantes()+" "+cuartos.getPartidos().get(0).getVisitante().getNombre());
        cuartos.agregarPartidos(new Partido(new Date(3,4,2022),octavos.getEquiposQueAvanzan().get(2),octavos.getEquiposQueAvanzan().get(3),new Resultado(2,4)));
        System.out.println(cuartos.getPartidos().get(1).getLocal().getNombre()+" "+cuartos.getPartidos().get(1).getResultado().getGolesLocales()+"-"+cuartos.getPartidos().get(1).getResultado().getGolesVisitantes()+" "+cuartos.getPartidos().get(1).getVisitante().getNombre());
        cuartos.agregarPartidos(new Partido(new Date(3,4,2022),octavos.getEquiposQueAvanzan().get(4),octavos.getEquiposQueAvanzan().get(5),new Resultado(5,2)));
        System.out.println(cuartos.getPartidos().get(2).getLocal().getNombre()+" "+cuartos.getPartidos().get(2).getResultado().getGolesLocales()+"-"+cuartos.getPartidos().get(2).getResultado().getGolesVisitantes()+" "+cuartos.getPartidos().get(2).getVisitante().getNombre());
        cuartos.agregarPartidos(new Partido(new Date(3,4,2022),octavos.getEquiposQueAvanzan().get(6),octavos.getEquiposQueAvanzan().get(7),new Resultado(4,1)));
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
        //Llaves


















    }
}
