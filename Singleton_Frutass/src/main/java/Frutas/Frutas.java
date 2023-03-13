package Frutas;

public class Frutas {

    private Frutas() {};
    private static Frutas instance = new Frutas();
    public static Frutas getInstance() {
        return instance;
    }

    private String NomeDaFruta;
    private String TipoDeFruta;
    private String UsuarioDaFruta;




    public String getnomeDaFruta() {
        return NomeDaFruta;
    }

    public void setNomeDaFruta(String NomeDaFruta) {
        this.NomeDaFruta = NomeDaFruta;
    }





    public String getTipoDeFruta() {
        return TipoDeFruta;
    }

    public void setTipoDeFruta(String TipoDeFruta) {
        this.TipoDeFruta = TipoDeFruta;
    }





    public String getUsuarioDaFruta() {
        return UsuarioDaFruta;
    }

    public void setUsuarioDaFruta(String UsuarioDaFruta) {
        this.UsuarioDaFruta = UsuarioDaFruta;
    }
}
