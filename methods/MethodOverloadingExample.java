package methods;

public class MethodOverloadingExample {
   public void show() {
	   System.out.println("show method with no parameters");
   }
   public void show(int a) {
	   System.out.println("show method with one parameter");   
   }
   public void show(String name) {
	   System.out.println("show method with String paramter");
   }
	public static void main(String[] args) {
   MethodOverloadingExample obj= new MethodOverloadingExample();
   obj.show();
   obj.show(100);
   obj.show("Bhagya");
	}

}
