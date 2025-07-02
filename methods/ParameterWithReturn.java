package methods;

public class ParameterWithReturn {
 
	public int addNumbers(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
  ParameterWithReturn obj= new ParameterWithReturn();
  int result=obj.addNumbers(10,30);
  System.out.println("sum is "+result);
	}

}
