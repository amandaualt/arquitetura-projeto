package projeto_arquitetura.maven;

public class Elements {

    private double fosforo;
    private double potassio;
    private double calcio;
    private double magnesio;
    private double enxofre;
    private double aluminio;
    private double hAl;

    public Elements(
            double fosforo,
            double potassio,
            double calcio,
            double magnesio,
            double enxofre,
            double aluminio,
            double hAl) {
        this.fosforo = fosforo;
        this.potassio = potassio;
        this.calcio = calcio;
        this.magnesio = magnesio;
        this.enxofre = enxofre;
        this.aluminio = aluminio;
        this.hAl = hAl;
    }

    //Metodos Gets
    public double getFosforo() {
        return fosforo;
    }

    public double getPotassio() {
        return potassio;
    }

    public double getCalcio() {
        return calcio;
    }

    public double getMagnesio() {
        return magnesio;
    }

    public double getEnxofre() {
        return enxofre;
    }

    public double getAluminio() {
        return aluminio;
    }

    public double gethAl() {
        return hAl;
    }
}
