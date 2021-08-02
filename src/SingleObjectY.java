
public class SingleObjectY {

	//create an object of SingleObject
	private static SingleObjectY instance = new SingleObjectY();
	
	//make the constructor private so that this class cannot be
	//instantiated
	private SingleObjectY(){}

	//Get the only object available
	public static SingleObjectY getInstance(){
		return instance;
	}
	
	public String message(){
		return ("Successfully deleted!");
	}   
	
}
