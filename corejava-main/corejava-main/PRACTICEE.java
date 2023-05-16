package nitinn;
class box{
	int length,breadth,height;
	box(){
		System.out.println("default constructor called");
		length=4;
		breadth=5;
		height=6;
	}
	box(int l,int b,int h){
		System.out.println("parameterised constructor");
		length=l;
		breadth=b;
		height=h;
	}
	box(box b){
		System.out.println("copy constructor called");
		length=b.length;
		breadth=b.breadth;
		height=b.height;
		
	}
	void volume() {
		System.out.println("volume is: "+(length*breadth*height));
	}
}

public class PRACTICEE {
	public static void main(String[] args) {
		box b1=new box();
		b1.volume();
		box b2=new box(5,6,7);
		b2.volume();
		box b3=new box(b2);
		b3.volume();
	}
	

}
