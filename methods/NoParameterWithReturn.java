package methods;

public class NoParameterWithReturn {

	public String getGreeting() {
		return "Goodmorning";
	}
	public static void main(String[] args) {
    NoParameterWithReturn obj = new NoParameterWithReturn();
    String message= obj.getGreeting();
    System.out.println(message);
	}
    }
