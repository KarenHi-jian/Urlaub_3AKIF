public class ReiseBuro
{
    private Urlaub urlaub0;
    private Urlaub urlaub1;
    private Urlaub urlaub2;
    
    public void hinzufugen(Urlaub welcher)
    {
        if (urlaub0==null)
        {
          urlaub0= welcher;
        }
        else
        {
            if(urlaub1==null)
            {
               urlaub1 = welcher;
               
            }
            else
            {
                if(urlaub2==null)
                {
                    urlaub2= welcher;
                }
                else
                {
                    System.out.println("Fehler: keine weiteren Angebote mehr möglich!");
                }
            }
        }
    }
    public int gunstigsterUrlaub()
    {
        int min;
        min =999999;
        if (urlaub0 != null)
        {
           if (urlaub0.getPreis() < min)
           {
               min = urlaub0.getPreis();
           }
        }
        if (urlaub1 != null)
        {
            if(urlaub1.getPreis() < min)
            {
                min = urlaub1.getPreis();
            }
        }
        if (urlaub2 != null)
        {
            if(urlaub2.getPreis()< min)
            {
                min = urlaub2.getPreis();
            }
        }
    
        return min;
    }  
}
    