package nitinn;
class nitin{
	nitin(){
		
		System.out.println("default constructor ");
	}
	void show() {
		System.out.println("hello ");
	}
}
class kumar extends nitin{
	kumar(){
		
		System.out.println("default constructor called");
	}
	void show() {
		super.show();
		System.out.println("hello world");
	}
}
class nkp extends kumar{
	nkp(){
	   
		System.out.println("c's default constructor called");
	}
	void show() {
		super.show();
		System.out.println("hello java");
	}
}
public class methodoverriding {
	public static void main(String[] args) {
		nkp c=new nkp();
		c.show();
		
		
		
	}

}
