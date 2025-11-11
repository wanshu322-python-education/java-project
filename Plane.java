
    


/** Create the class header for the Plane class */
public class Plane {

    private String currentLocation;
    private String nextLocation;
    
    // default constructor
    public Plane () {
        currentLocation = "Stevenson";
        nextLocation = "";
    }
    
    //second constructor
    public Plane( String s) {
        currentLocation = s;
        nextLocation = "";
        
    } 
    //Methods    
    //setNext method
    public boolean setNext(String s) {
        if (s.length() == 0)
        {
          return false;
          
        }
        else
        {
            nextLocation = s;
            return true;
        }
    }
    public void fly () {
        
        if (nextLocation.length() != 0) 
        {
            currentLocation = nextLocation;
            nextLocation = "";
        }
    
    
    } 
      
    public static void main(String[] args)
    {
        Plane p1 = new Plane(); 
        System.out.println(p1); 
    }

}