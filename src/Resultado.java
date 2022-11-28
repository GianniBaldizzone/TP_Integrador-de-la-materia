public class Resultado {
    private int golesLocales;
    private int golesVisitantes;

    public Resultado(int golesLocales, int golesVisitantes) {
        this.golesLocales = golesLocales;
        this.golesVisitantes = golesVisitantes;
    }
    public Resultado() {
        this.golesLocales = 0;
        this.golesVisitantes = 0;
    }

    public int getGolesLocales() {
        return golesLocales;
    }

    public void setGolesLocales(int golesLocales) {
        this.golesLocales = golesLocales;
    }

    public int getGolesVisitantes() {
        return golesVisitantes;
    }

    public void setGolesVisitantes(int golesVisitantes) {
        this.golesVisitantes = golesVisitantes;
    }

    public boolean ganoLocal(){
        if (getGolesLocales()>getGolesVisitantes()) {
            return true;
        }else{
            return false;
        }
    }
    public boolean empate(){
        if (getGolesLocales()==getGolesVisitantes()) {
            return true;
        }else{
            return false;
        }
    }
}
