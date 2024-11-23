public class TestUrlaubObjectReference
{
    public void test1()
    {
        Urlaub u1;
        
        u1 = new Urlaub("Dubai", 999, false);
        u1.setPreis(1199);
    }
    
    public void test2()
    {
        Urlaub u1, u2, u3, u4;
        
        u1 = new Urlaub("Dubai", 999, false);
        u1.setPreis(1199);
        u2 = new Urlaub("Rom",  1200, false);
        u4 = u1;
        u4.setPreis(555);
        u1.setAllInclusive(true);
        u3 = new Urlaub("Ibiza", 888, true);
        u1 = null;
        u1 = new Urlaub("Wien",  600, false);
        u3 = null;
    }
}
