

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestUrlaubJUnit
{
    @Test
    public void testBillig()
    {
        Urlaub baden;
        
        baden = new Urlaub("Baden", 499, false);
        // Fehler
        assertEquals(baden.getPreis(), 1999);
    }
    
    @Test
    public void testOK()
    {
        Urlaub rom;
        
        rom = new Urlaub("Rom", 1200, false);
        assertEquals(rom.getPreis(), 1200);
    }
    
    @Test
    public void testTeuer()
    {
        Urlaub d;
        
        d = new Urlaub("Dubai", 3001, true);
        // Fehler
        assertEquals(d.getPreis(), 1999);
    }

}
