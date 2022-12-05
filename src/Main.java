import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        //Equipos
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

        //Grupos
        Grupo grupoA = new Grupo("Grupa A",new ArrayList<Partido>(0));
        System.out.println("Grupo A");
        grupoA.agregarEquipo(catar);
        grupoA.agregarEquipo(ecuador);
        grupoA.agregarEquipo(holanda);
        grupoA.agregarEquipo(senegal);
        grupoA.agregarPartidos(new Partido(new Date(3,4,2022),catar,ecuador,new Resultado(4,2)));
        System.out.println(grupoA.getPartidos().get(0).getLocal().getNombre()+" "+grupoA.getPartidos().get(0).getResultado().getGolesLocales()+"-"+grupoA.getPartidos().get(0).getResultado().getGolesVisitantes()+" "+grupoA.getPartidos().get(0).getVisitante().getNombre());
        grupoA.agregarPartidos(new Partido(new Date(3,4,2022),senegal,holanda,new Resultado(0,3)));
        System.out.println(grupoA.getPartidos().get(1).getLocal().getNombre()+" "+grupoA.getPartidos().get(1).getResultado().getGolesLocales()+"-"+grupoA.getPartidos().get(1).getResultado().getGolesVisitantes()+" "+grupoA.getPartidos().get(1).getVisitante().getNombre());
        grupoA.agregarPartidos(new Partido(new Date(3,4,2022),catar,senegal,new Resultado(4,2)));
        System.out.println(grupoA.getPartidos().get(2).getLocal().getNombre()+" "+grupoA.getPartidos().get(2).getResultado().getGolesLocales()+"-"+grupoA.getPartidos().get(2).getResultado().getGolesVisitantes()+" "+grupoA.getPartidos().get(2).getVisitante().getNombre());
        grupoA.agregarPartidos(new Partido(new Date(3,4,2022),holanda,ecuador,new Resultado(2,0)));
        System.out.println(grupoA.getPartidos().get(3).getLocal().getNombre()+" "+grupoA.getPartidos().get(3).getResultado().getGolesLocales()+"-"+grupoA.getPartidos().get(3).getResultado().getGolesVisitantes()+" "+grupoA.getPartidos().get(3).getVisitante().getNombre());
        grupoA.agregarPartidos(new Partido(new Date(3,4,2022),holanda,catar,new Resultado(0,2)));
        System.out.println(grupoA.getPartidos().get(4).getLocal().getNombre()+" "+grupoA.getPartidos().get(4).getResultado().getGolesLocales()+"-"+grupoA.getPartidos().get(4).getResultado().getGolesVisitantes()+" "+grupoA.getPartidos().get(4).getVisitante().getNombre());
        grupoA.agregarPartidos(new Partido(new Date(3,4,2022),ecuador,senegal,new Resultado(0,2)));
        System.out.println(grupoA.getPartidos().get(5).getLocal().getNombre()+" "+grupoA.getPartidos().get(5).getResultado().getGolesLocales()+"-"+grupoA.getPartidos().get(5).getResultado().getGolesVisitantes()+" "+grupoA.getPartidos().get(5).getVisitante().getNombre());
        grupoA.fijarPuntajeDelGrupo(grupoA);
        grupoA.getEquiposQueAvanzan();
        System.out.println("");

        Grupo grupoB = new Grupo("Grupa B",new ArrayList<Partido>(0));
        System.out.println("Grupo B");
        grupoB.agregarEquipo(inglaterra);
        grupoB.agregarEquipo(iran);
        grupoB.agregarEquipo(estadosUnidos);
        grupoB.agregarEquipo(gales);
        grupoB.agregarPartidos(new Partido(new Date(3,4,2022),inglaterra,iran,new Resultado(0,2)));
        System.out.println(grupoB.getPartidos().get(0).getLocal().getNombre()+" "+grupoB.getPartidos().get(0).getResultado().getGolesLocales()+"-"+grupoB.getPartidos().get(0).getResultado().getGolesVisitantes()+" "+grupoB.getPartidos().get(0).getVisitante().getNombre());
        grupoB.agregarPartidos(new Partido(new Date(3,4,2022),estadosUnidos,gales,new Resultado(4,2)));
        System.out.println(grupoB.getPartidos().get(1).getLocal().getNombre()+" "+grupoB.getPartidos().get(1).getResultado().getGolesLocales()+"-"+grupoB.getPartidos().get(1).getResultado().getGolesVisitantes()+" "+grupoB.getPartidos().get(1).getVisitante().getNombre());
        grupoB.agregarPartidos(new Partido(new Date(3,4,2022),gales,iran,new Resultado(0,2)));
        System.out.println(grupoB.getPartidos().get(2).getLocal().getNombre()+" "+grupoB.getPartidos().get(2).getResultado().getGolesLocales()+"-"+grupoB.getPartidos().get(2).getResultado().getGolesVisitantes()+" "+grupoB.getPartidos().get(2).getVisitante().getNombre());
        grupoB.agregarPartidos(new Partido(new Date(3,4,2022),inglaterra,estadosUnidos,new Resultado(0,2)));
        System.out.println(grupoB.getPartidos().get(3).getLocal().getNombre()+" "+grupoB.getPartidos().get(3).getResultado().getGolesLocales()+"-"+grupoB.getPartidos().get(3).getResultado().getGolesVisitantes()+" "+grupoB.getPartidos().get(3).getVisitante().getNombre());
        grupoB.agregarPartidos(new Partido(new Date(3,4,2022),iran,estadosUnidos,new Resultado(0,2)));
        System.out.println(grupoB.getPartidos().get(4).getLocal().getNombre()+" "+grupoB.getPartidos().get(4).getResultado().getGolesLocales()+"-"+grupoB.getPartidos().get(4).getResultado().getGolesVisitantes()+" "+grupoB.getPartidos().get(4).getVisitante().getNombre());
        grupoB.agregarPartidos(new Partido(new Date(3,4,2022),gales,inglaterra,new Resultado(0,2)));
        System.out.println(grupoB.getPartidos().get(5).getLocal().getNombre()+" "+grupoB.getPartidos().get(5).getResultado().getGolesLocales()+"-"+grupoB.getPartidos().get(5).getResultado().getGolesVisitantes()+" "+grupoB.getPartidos().get(5).getVisitante().getNombre());
        grupoB.fijarPuntajeDelGrupo(grupoB);
        grupoB.getEquiposQueAvanzan();
        System.out.println("");

        Grupo grupoC = new Grupo("Grupo C",new ArrayList<Partido>(0));
        System.out.println("Grupo C");
        grupoC.agregarEquipo(argentina);
        grupoC.agregarEquipo(mexico);
        grupoC.agregarEquipo(polonia);
        grupoC.agregarEquipo(arabiaSaudita);
        grupoC.agregarPartidos(new Partido(new Date(3,4,2022),argentina,arabiaSaudita,new Resultado(2,0)));
        System.out.println(grupoC.getPartidos().get(0).getLocal().getNombre()+" "+grupoC.getPartidos().get(0).getResultado().getGolesLocales()+"-"+grupoC.getPartidos().get(0).getResultado().getGolesVisitantes()+" "+grupoC.getPartidos().get(0).getVisitante().getNombre());
        grupoC.agregarPartidos(new Partido(new Date(3,4,2022),mexico,polonia,new Resultado(0,2)));
        System.out.println(grupoC.getPartidos().get(1).getLocal().getNombre()+" "+grupoC.getPartidos().get(1).getResultado().getGolesLocales()+"-"+grupoC.getPartidos().get(1).getResultado().getGolesVisitantes()+" "+grupoC.getPartidos().get(1).getVisitante().getNombre());
        grupoC.agregarPartidos(new Partido(new Date(3,4,2022),polonia,arabiaSaudita,new Resultado(0,2)));
        System.out.println(grupoC.getPartidos().get(2).getLocal().getNombre()+" "+grupoC.getPartidos().get(2).getResultado().getGolesLocales()+"-"+grupoC.getPartidos().get(2).getResultado().getGolesVisitantes()+" "+grupoC.getPartidos().get(2).getVisitante().getNombre());
        grupoC.agregarPartidos(new Partido(new Date(3,4,2022),argentina,mexico,new Resultado(2,0)));
        System.out.println(grupoC.getPartidos().get(3).getLocal().getNombre()+" "+grupoC.getPartidos().get(3).getResultado().getGolesLocales()+"-"+grupoC.getPartidos().get(3).getResultado().getGolesVisitantes()+" "+grupoC.getPartidos().get(3).getVisitante().getNombre());
        grupoC.agregarPartidos(new Partido(new Date(3,4,2022),arabiaSaudita,mexico,new Resultado(2,0)));
        System.out.println(grupoC.getPartidos().get(4).getLocal().getNombre()+" "+grupoC.getPartidos().get(4).getResultado().getGolesLocales()+"-"+grupoC.getPartidos().get(4).getResultado().getGolesVisitantes()+" "+grupoC.getPartidos().get(4).getVisitante().getNombre());
        grupoC.agregarPartidos(new Partido(new Date(3,4,2022),polonia,argentina,new Resultado(0,2)));
        System.out.println(grupoC.getPartidos().get(5).getLocal().getNombre()+" "+grupoC.getPartidos().get(5).getResultado().getGolesLocales()+"-"+grupoC.getPartidos().get(5).getResultado().getGolesVisitantes()+" "+grupoC.getPartidos().get(5).getVisitante().getNombre());
        grupoC.fijarPuntajeDelGrupo(grupoC);
        grupoC.getEquiposQueAvanzan();
        System.out.println("");

        Grupo grupoD = new Grupo("Grupa D",new ArrayList<Partido>(0));
        System.out.println("Grupo D");
        grupoD.agregarEquipo(francia);
        grupoD.agregarEquipo(australia);
        grupoD.agregarEquipo(dinamarca);
        grupoD.agregarEquipo(tunez);
        grupoD.agregarPartidos(new Partido(new Date(3,4,2022),dinamarca,tunez,new Resultado(0,2)));
        System.out.println(grupoD.getPartidos().get(0).getLocal().getNombre()+" "+grupoD.getPartidos().get(0).getResultado().getGolesLocales()+"-"+grupoD.getPartidos().get(0).getResultado().getGolesVisitantes()+" "+grupoD.getPartidos().get(0).getVisitante().getNombre());
        grupoD.agregarPartidos(new Partido(new Date(3,4,2022),francia,australia,new Resultado(0,2)));
        System.out.println(grupoD.getPartidos().get(1).getLocal().getNombre()+" "+grupoD.getPartidos().get(1).getResultado().getGolesLocales()+"-"+grupoD.getPartidos().get(1).getResultado().getGolesVisitantes()+" "+grupoD.getPartidos().get(1).getVisitante().getNombre());
        grupoD.agregarPartidos(new Partido(new Date(3,4,2022),tunez,australia,new Resultado(0,2)));
        System.out.println(grupoD.getPartidos().get(2).getLocal().getNombre()+" "+grupoD.getPartidos().get(2).getResultado().getGolesLocales()+"-"+grupoD.getPartidos().get(2).getResultado().getGolesVisitantes()+" "+grupoD.getPartidos().get(2).getVisitante().getNombre());
        grupoD.agregarPartidos(new Partido(new Date(3,4,2022),francia,dinamarca,new Resultado(0,2)));
        System.out.println(grupoD.getPartidos().get(3).getLocal().getNombre()+" "+grupoD.getPartidos().get(3).getResultado().getGolesLocales()+"-"+grupoD.getPartidos().get(3).getResultado().getGolesVisitantes()+" "+grupoD.getPartidos().get(3).getVisitante().getNombre());
        grupoD.agregarPartidos(new Partido(new Date(3,4,2022),australia,dinamarca,new Resultado(0,2)));
        System.out.println(grupoD.getPartidos().get(4).getLocal().getNombre()+" "+grupoD.getPartidos().get(4).getResultado().getGolesLocales()+"-"+grupoD.getPartidos().get(4).getResultado().getGolesVisitantes()+" "+grupoD.getPartidos().get(4).getVisitante().getNombre());
        grupoD.agregarPartidos(new Partido(new Date(3,4,2022),tunez,francia,new Resultado(0,2)));
        System.out.println(grupoD.getPartidos().get(5).getLocal().getNombre()+" "+grupoD.getPartidos().get(5).getResultado().getGolesLocales()+"-"+grupoD.getPartidos().get(5).getResultado().getGolesVisitantes()+" "+grupoD.getPartidos().get(5).getVisitante().getNombre());
        grupoD.fijarPuntajeDelGrupo(grupoD);
        grupoD.getEquiposQueAvanzan();
        System.out.println("");

        Grupo grupoE = new Grupo("Grupa E",new ArrayList<Partido>(0));
        System.out.println("Grupo E");
        grupoE.agregarEquipo(españa);
        grupoE.agregarEquipo(costaRica);
        grupoE.agregarEquipo(alemania);
        grupoE.agregarEquipo(japón);
        grupoE.agregarPartidos(new Partido(new Date(3,4,2022),alemania,japón,new Resultado(0,2)));
        System.out.println(grupoE.getPartidos().get(0).getLocal().getNombre()+" "+grupoE.getPartidos().get(0).getResultado().getGolesLocales()+"-"+grupoE.getPartidos().get(0).getResultado().getGolesVisitantes()+" "+grupoE.getPartidos().get(0).getVisitante().getNombre());
        grupoE.agregarPartidos(new Partido(new Date(3,4,2022),españa,costaRica,new Resultado(0,2)));
        System.out.println(grupoE.getPartidos().get(1).getLocal().getNombre()+" "+grupoE.getPartidos().get(1).getResultado().getGolesLocales()+"-"+grupoE.getPartidos().get(1).getResultado().getGolesVisitantes()+" "+grupoE.getPartidos().get(1).getVisitante().getNombre());
        grupoE.agregarPartidos(new Partido(new Date(3,4,2022),japón,costaRica,new Resultado(0,2)));
        System.out.println(grupoE.getPartidos().get(2).getLocal().getNombre()+" "+grupoE.getPartidos().get(2).getResultado().getGolesLocales()+"-"+grupoE.getPartidos().get(2).getResultado().getGolesVisitantes()+" "+grupoE.getPartidos().get(2).getVisitante().getNombre());
        grupoE.agregarPartidos(new Partido(new Date(3,4,2022),españa,alemania,new Resultado(0,2)));
        System.out.println(grupoE.getPartidos().get(3).getLocal().getNombre()+" "+grupoE.getPartidos().get(3).getResultado().getGolesLocales()+"-"+grupoE.getPartidos().get(3).getResultado().getGolesVisitantes()+" "+grupoE.getPartidos().get(3).getVisitante().getNombre());
        grupoE.agregarPartidos(new Partido(new Date(3,4,2022),costaRica,alemania,new Resultado(0,2)));
        System.out.println(grupoE.getPartidos().get(4).getLocal().getNombre()+" "+grupoE.getPartidos().get(4).getResultado().getGolesLocales()+"-"+grupoE.getPartidos().get(4).getResultado().getGolesVisitantes()+" "+grupoE.getPartidos().get(4).getVisitante().getNombre());
        grupoE.agregarPartidos(new Partido(new Date(3,4,2022),japón,españa,new Resultado(0,2)));
        System.out.println(grupoE.getPartidos().get(5).getLocal().getNombre()+" "+grupoE.getPartidos().get(5).getResultado().getGolesLocales()+"-"+grupoE.getPartidos().get(5).getResultado().getGolesVisitantes()+" "+grupoE.getPartidos().get(5).getVisitante().getNombre());
        grupoE.fijarPuntajeDelGrupo(grupoE);
        grupoE.getEquiposQueAvanzan();
        System.out.println("");

        Grupo grupoF = new Grupo("Grupa F",new ArrayList<Partido>(0));
        System.out.println("Grupo F");
        grupoF.agregarEquipo(bélgica);
        grupoF.agregarEquipo(canadá);
        grupoF.agregarEquipo(marruecos);
        grupoF.agregarEquipo(croacia);
        grupoF.agregarPartidos(new Partido(new Date(3,4,2022),marruecos,croacia,new Resultado(0,2)));
        System.out.println(grupoF.getPartidos().get(0).getLocal().getNombre()+" "+grupoF.getPartidos().get(0).getResultado().getGolesLocales()+"-"+grupoF.getPartidos().get(0).getResultado().getGolesVisitantes()+" "+grupoF.getPartidos().get(0).getVisitante().getNombre());
        grupoF.agregarPartidos(new Partido(new Date(3,4,2022),bélgica,canadá,new Resultado(0,2)));
        System.out.println(grupoF.getPartidos().get(1).getLocal().getNombre()+" "+grupoF.getPartidos().get(1).getResultado().getGolesLocales()+"-"+grupoF.getPartidos().get(1).getResultado().getGolesVisitantes()+" "+grupoF.getPartidos().get(1).getVisitante().getNombre());
        grupoF.agregarPartidos(new Partido(new Date(3,4,2022),bélgica,marruecos,new Resultado(0,2)));
        System.out.println(grupoF.getPartidos().get(2).getLocal().getNombre()+" "+grupoF.getPartidos().get(2).getResultado().getGolesLocales()+"-"+grupoF.getPartidos().get(2).getResultado().getGolesVisitantes()+" "+grupoF.getPartidos().get(2).getVisitante().getNombre());
        grupoF.agregarPartidos(new Partido(new Date(3,4,2022),croacia,canadá,new Resultado(0,2)));
        System.out.println(grupoF.getPartidos().get(3).getLocal().getNombre()+" "+grupoF.getPartidos().get(3).getResultado().getGolesLocales()+"-"+grupoF.getPartidos().get(3).getResultado().getGolesVisitantes()+" "+grupoF.getPartidos().get(3).getVisitante().getNombre());
        grupoF.agregarPartidos(new Partido(new Date(3,4,2022),croacia,bélgica,new Resultado(0,2)));
        System.out.println(grupoF.getPartidos().get(4).getLocal().getNombre()+" "+grupoF.getPartidos().get(4).getResultado().getGolesLocales()+"-"+grupoF.getPartidos().get(4).getResultado().getGolesVisitantes()+" "+grupoF.getPartidos().get(4).getVisitante().getNombre());
        grupoF.agregarPartidos(new Partido(new Date(3,4,2022),canadá,marruecos,new Resultado(0,2)));
        System.out.println(grupoF.getPartidos().get(5).getLocal().getNombre()+" "+grupoF.getPartidos().get(5).getResultado().getGolesLocales()+"-"+grupoF.getPartidos().get(5).getResultado().getGolesVisitantes()+" "+grupoF.getPartidos().get(5).getVisitante().getNombre());
        grupoF.fijarPuntajeDelGrupo(grupoF);
        grupoF.getEquiposQueAvanzan();
        System.out.println("");

        Grupo grupoG = new Grupo("Grupa G",new ArrayList<Partido>(0));
        System.out.println("Grupo G");
        grupoG.agregarEquipo(brasil);
        grupoG.agregarEquipo(serbia);
        grupoG.agregarEquipo(suiza);
        grupoG.agregarEquipo(camerún);
        grupoG.agregarPartidos(new Partido(new Date(3,4,2022),suiza,camerún,new Resultado(0,2)));
        System.out.println(grupoG.getPartidos().get(0).getLocal().getNombre()+" "+grupoG.getPartidos().get(0).getResultado().getGolesLocales()+"-"+grupoG.getPartidos().get(0).getResultado().getGolesVisitantes()+" "+grupoG.getPartidos().get(0).getVisitante().getNombre());
        grupoG.agregarPartidos(new Partido(new Date(3,4,2022),brasil,serbia,new Resultado(0,2)));
        System.out.println(grupoG.getPartidos().get(1).getLocal().getNombre()+" "+grupoG.getPartidos().get(1).getResultado().getGolesLocales()+"-"+grupoG.getPartidos().get(1).getResultado().getGolesVisitantes()+" "+grupoG.getPartidos().get(1).getVisitante().getNombre());
        grupoG.agregarPartidos(new Partido(new Date(3,4,2022),camerún,serbia,new Resultado(0,2)));
        System.out.println(grupoG.getPartidos().get(2).getLocal().getNombre()+" "+grupoG.getPartidos().get(2).getResultado().getGolesLocales()+"-"+grupoG.getPartidos().get(2).getResultado().getGolesVisitantes()+" "+grupoG.getPartidos().get(2).getVisitante().getNombre());
        grupoG.agregarPartidos(new Partido(new Date(3,4,2022),brasil,suiza,new Resultado(0,2)));
        System.out.println(grupoG.getPartidos().get(3).getLocal().getNombre()+" "+grupoG.getPartidos().get(3).getResultado().getGolesLocales()+"-"+grupoG.getPartidos().get(3).getResultado().getGolesVisitantes()+" "+grupoG.getPartidos().get(3).getVisitante().getNombre());
        grupoG.agregarPartidos(new Partido(new Date(3,4,2022),serbia,suiza,new Resultado(0,2)));
        System.out.println(grupoG.getPartidos().get(4).getLocal().getNombre()+" "+grupoG.getPartidos().get(4).getResultado().getGolesLocales()+"-"+grupoG.getPartidos().get(4).getResultado().getGolesVisitantes()+" "+grupoG.getPartidos().get(4).getVisitante().getNombre());
        grupoG.agregarPartidos(new Partido(new Date(3,4,2022),camerún,brasil,new Resultado(0,2)));
        System.out.println(grupoG.getPartidos().get(5).getLocal().getNombre()+" "+grupoG.getPartidos().get(5).getResultado().getGolesLocales()+"-"+grupoG.getPartidos().get(5).getResultado().getGolesVisitantes()+" "+grupoG.getPartidos().get(5).getVisitante().getNombre());
        grupoG.fijarPuntajeDelGrupo(grupoG);
        grupoG.getEquiposQueAvanzan();
        grupoG.getEquiposQueAvanzan();
        System.out.println("");

        Grupo grupoH = new Grupo("Grupa H",new ArrayList<Partido>(0));
        System.out.println("Grupo H");
        grupoH.agregarEquipo(portugal);
        grupoH.agregarEquipo(ghana);
        grupoH.agregarEquipo(uruguay);
        grupoH.agregarEquipo(coreaDelSur);
        grupoH.agregarPartidos(new Partido(new Date(3,4,2022),uruguay,coreaDelSur,new Resultado(0,2)));
        System.out.println(grupoH.getPartidos().get(0).getLocal().getNombre()+" "+grupoH.getPartidos().get(0).getResultado().getGolesLocales()+"-"+grupoH.getPartidos().get(0).getResultado().getGolesVisitantes()+" "+grupoH.getPartidos().get(0).getVisitante().getNombre());
        grupoH.agregarPartidos(new Partido(new Date(3,4,2022),portugal,ghana,new Resultado(0,2)));
        System.out.println(grupoH.getPartidos().get(1).getLocal().getNombre()+" "+grupoH.getPartidos().get(1).getResultado().getGolesLocales()+"-"+grupoH.getPartidos().get(1).getResultado().getGolesVisitantes()+" "+grupoH.getPartidos().get(1).getVisitante().getNombre());
        grupoH.agregarPartidos(new Partido(new Date(3,4,2022),coreaDelSur,ghana,new Resultado(0,2)));
        System.out.println(grupoH.getPartidos().get(2).getLocal().getNombre()+" "+grupoH.getPartidos().get(2).getResultado().getGolesLocales()+"-"+grupoH.getPartidos().get(2).getResultado().getGolesVisitantes()+" "+grupoH.getPartidos().get(2).getVisitante().getNombre());
        grupoH.agregarPartidos(new Partido(new Date(3,4,2022),portugal,uruguay,new Resultado(0,2)));
        System.out.println(grupoH.getPartidos().get(3).getLocal().getNombre()+" "+grupoH.getPartidos().get(3).getResultado().getGolesLocales()+"-"+grupoH.getPartidos().get(3).getResultado().getGolesVisitantes()+" "+grupoH.getPartidos().get(3).getVisitante().getNombre());
        grupoH.agregarPartidos(new Partido(new Date(3,4,2022),ghana,uruguay,new Resultado(0,2)));
        System.out.println(grupoH.getPartidos().get(4).getLocal().getNombre()+" "+grupoH.getPartidos().get(4).getResultado().getGolesLocales()+"-"+grupoH.getPartidos().get(4).getResultado().getGolesVisitantes()+" "+grupoH.getPartidos().get(4).getVisitante().getNombre());
        grupoH.agregarPartidos(new Partido(new Date(3,4,2022),coreaDelSur,portugal,new Resultado(0,2)));
        System.out.println(grupoH.getPartidos().get(5).getLocal().getNombre()+" "+grupoH.getPartidos().get(5).getResultado().getGolesLocales()+"-"+grupoH.getPartidos().get(5).getResultado().getGolesVisitantes()+" "+grupoH.getPartidos().get(5).getVisitante().getNombre());
        grupoH.fijarPuntajeDelGrupo(grupoH);
        grupoH.getEquiposQueAvanzan();
        System.out.println("");
       //Grupos





















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
        octavos.agregarPartidos(new Partido(new Date(3,4,2022),grupoA.getEquiposQueAvanzan().get(0),grupoB.getEquiposQueAvanzan().get(1),new Resultado(3,0)));
        System.out.println(octavos.getPartidos().get(0).getLocal().getNombre()+" "+octavos.getPartidos().get(0).getResultado().getGolesLocales()+"-"+octavos.getPartidos().get(0).getResultado().getGolesVisitantes()+" "+octavos.getPartidos().get(0).getVisitante().getNombre());
        octavos.agregarPartidos(new Partido(new Date(3,4,2022),grupoC.getEquiposQueAvanzan().get(0),grupoD.getEquiposQueAvanzan().get(1),new Resultado(2,4)));
        System.out.println(octavos.getPartidos().get(1).getLocal().getNombre()+" "+octavos.getPartidos().get(1).getResultado().getGolesLocales()+"-"+octavos.getPartidos().get(1).getResultado().getGolesVisitantes()+" "+octavos.getPartidos().get(1).getVisitante().getNombre());
        octavos.agregarPartidos(new Partido(new Date(3,4,2022),grupoE.getEquiposQueAvanzan().get(0),grupoF.getEquiposQueAvanzan().get(1),new Resultado(5,2)));
        System.out.println(octavos.getPartidos().get(2).getLocal().getNombre()+" "+octavos.getPartidos().get(2).getResultado().getGolesLocales()+"-"+octavos.getPartidos().get(2).getResultado().getGolesVisitantes()+" "+octavos.getPartidos().get(2).getVisitante().getNombre());
        octavos.agregarPartidos(new Partido(new Date(3,4,2022),grupoG.getEquiposQueAvanzan().get(0),grupoH.getEquiposQueAvanzan().get(1),new Resultado(4,1)));
        System.out.println(octavos.getPartidos().get(3).getLocal().getNombre()+" "+octavos.getPartidos().get(3).getResultado().getGolesLocales()+"-"+octavos.getPartidos().get(3).getResultado().getGolesVisitantes()+" "+octavos.getPartidos().get(3).getVisitante().getNombre());
        octavos.agregarPartidos(new Partido(new Date(3,4,2022),grupoB.getEquiposQueAvanzan().get(0),grupoA.getEquiposQueAvanzan().get(1),new Resultado(3,0)));
        System.out.println(octavos.getPartidos().get(4).getLocal().getNombre()+" "+octavos.getPartidos().get(4).getResultado().getGolesLocales()+"-"+octavos.getPartidos().get(4).getResultado().getGolesVisitantes()+" "+octavos.getPartidos().get(4).getVisitante().getNombre());
        octavos.agregarPartidos(new Partido(new Date(3,4,2022),grupoD.getEquiposQueAvanzan().get(0),grupoC.getEquiposQueAvanzan().get(1),new Resultado(2,4)));
        System.out.println(octavos.getPartidos().get(5).getLocal().getNombre()+" "+octavos.getPartidos().get(5).getResultado().getGolesLocales()+"-"+octavos.getPartidos().get(5).getResultado().getGolesVisitantes()+" "+octavos.getPartidos().get(5).getVisitante().getNombre());
        octavos.agregarPartidos(new Partido(new Date(3,4,2022),grupoF.getEquiposQueAvanzan().get(0),grupoE.getEquiposQueAvanzan().get(1),new Resultado(5,2)));
        System.out.println(octavos.getPartidos().get(6).getLocal().getNombre()+" "+octavos.getPartidos().get(6).getResultado().getGolesLocales()+"-"+octavos.getPartidos().get(6).getResultado().getGolesVisitantes()+" "+octavos.getPartidos().get(6).getVisitante().getNombre());
        octavos.agregarPartidos(new Partido(new Date(3,4,2022),grupoH.getEquiposQueAvanzan().get(0),grupoG.getEquiposQueAvanzan().get(1),new Resultado(4,1)));
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
        semifinal.agregarPartidos(new Partido(new Date(3,4,2022),cuartos.getEquiposQueAvanzan().get(0),cuartos.getEquiposQueAvanzan().get(1),new Resultado(2,4)));
        System.out.println(cuartos.getEquiposQueAvanzan().get(0).getNombre()+" "+semifinal.getPartidos().get(0).getResultado().getGolesLocales()+"-"+semifinal.getPartidos().get(0).getResultado().getGolesVisitantes()+" "+cuartos.getEquiposQueAvanzan().get(2).getNombre());
        semifinal.agregarPartidos(new Partido(new Date(3,4,2022),cuartos.getEquiposQueAvanzan().get(2),cuartos.getEquiposQueAvanzan().get(3),new Resultado(3,1)));
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
