public class TestUrlaubSemi
{
    public void testBillig()
    {
        Urlaub baden;
        
        baden = new Urlaub("Baden", 499, false);
        // Fehler
        System.out.println(baden.getPreis());
        // 1999
    }
    
    public void testOK()
    {
        Urlaub rom;
        
        rom = new Urlaub("Rom", 1200, false);
        System.out.println(rom.getPreis());
        // 1200
    }
    
    public void testTeuer()
    {
        Urlaub d;
        
        d = new Urlaub("Dubai", 3001, true);
        // Fehler
        System.out.println(d.getPreis());
        // 1999
    }
}













