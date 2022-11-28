import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Equipo argentina = new Equipo("Argentina" );
        Equipo polonia = new Equipo("Polonia");
        Llave semifinalMundial = new Llave("Final", new ArrayList<>());
        Partido partidoDelMiercoles = new Partido(new Date(2022, 10, 28), argentina, polonia);
        partidoDelMiercoles.getResultado().setGolesLocales(3);
        partidoDelMiercoles.getResultado().setGolesVisitantes(2);

        ArrayList<Equipo> finalistas = semifinalMundial.getEquiposQueAvanzan();
        Partido partidoFinalMundial = new Partido(new Date(), finalistas.get(0), finalistas.get(1));
        partidoFinalMundial.getResultado().setGolesLocales(1);
        ArrayList<Partido> partidosFinal = new ArrayList<>();
        partidosFinal.add(partidoFinalMundial);
        Llave finalMundial = new Llave("Final mundial", partidosFinal);
        finalMundial.getEquiposQueAvanzan();





    }
}
