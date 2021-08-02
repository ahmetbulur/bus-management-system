
public class SingleObjectX {

   //create an object of SingleObject
   private static SingleObjectX instance = new SingleObjectX();

   //make the constructor private so that this class cannot be
   //instantiated
   private SingleObjectX(){}

   //Get the only object available
   public static SingleObjectX getInstance(){
      return instance;
   }

   public String message(){
      return ("Successfully added!");
   }
}
