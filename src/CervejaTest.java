import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CervejaTest {
    
    @Test(expected=Exception.class)
    public void criarCervejaDiferenteIpaIbuAlto() throws Exception {
        Cerveja pilsen = new Cerveja("Loucura Tcheca", "Bohemian Pilsner", 51);
    }
}