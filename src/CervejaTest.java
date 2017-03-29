import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CervejaTest {
    
    @Test(expected=Exception.class)
    public void criarCervejaDiferenteIpaIbuAlto() throws Exception {
        Cerveja pilsen = new Cerveja("Loucura Tcheca", "Bohemian Pilsner", 51);
    }
    
    @Test
    public void criarCervejaIpaIbuAlto() throws Exception {
        Cerveja ipa = new Cerveja("Hoparama IPA", "IPA", 83);
        assertEquals(83, ipa.getIBU());
    }
}