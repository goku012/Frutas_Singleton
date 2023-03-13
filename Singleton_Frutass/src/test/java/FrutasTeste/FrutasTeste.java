package FrutasTeste;

import org.junit.jupiter.api.Test;
import Frutas.Frutas;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrutasTeste {

    @Test
    public void deveRetornarNomeDaFruta() {
        Frutas.getInstance().setNomeDaFruta("GORO GORO NO MI");
        assertEquals("GORO GORO NO MI", Frutas.getInstance().getnomeDaFruta());
    }

    @Test
    public void deveRetornarTipoDaFruta() {
        Frutas.getInstance().setTipoDeFruta("PARAMECIA");
        assertEquals("PARAMECIA", Frutas.getInstance().getTipoDeFruta());
    }


    @Test
    public void deveRetornarUsuarioDaFruta() {
        Frutas.getInstance().setUsuarioDaFruta("monkey d.luffy");
        assertEquals("monkey d.luffy", Frutas.getInstance().getUsuarioDaFruta());
    }

}
