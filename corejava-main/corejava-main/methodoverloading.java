package nitinn;
public class methodoverloading {
  void show() {
	  System.out.println("first function");
  }
  void show(int a) {
	  System.out.println("second function called");
  }
  void show(int a,int b) {
	  System.out.println("third function called");
  }
  public static void main(String[] args) {
	methodoverloading m=new methodoverloading();
	m.show();
	m.show(5);
	m.show(4, 8);
}
}
