// Java code to demonstrate
// Short equals() method
  
class GFG {
    public static void main(String[] args)
    {
  
        // creating a Short object
        Short a = new Short("20");
  
        // creating a Short object
        Short b = new Short("20");
  
        // equals method in Short class
        boolean output = a.equals(b);
  
        // Printing the output
        System.out.println("Does " + a
                           + " equals " + b
                           + " : " + output);
    }
}