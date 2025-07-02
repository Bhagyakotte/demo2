package methods;

public class ParamterNoReturn {
	public void displayMessage(String name) {
		System.out.println("welcome"+name+ "!");
	}

	public static void main(String[] args) {
    ParamterNoReturn obj=new ParamterNoReturn();
    obj.displayMessage("Bhagya");
	}

}
