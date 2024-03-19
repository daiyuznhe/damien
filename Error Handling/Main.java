package dividebyzero;

public class Main {
  /**
	 * @param args the command line arguments
	 */
    public static void main(String[] args) {
        try {
            System.out.println(3/0);
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Caught runtime exception \r\n" + "= %s\\n");
        } 
   }
}
