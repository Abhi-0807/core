package nitinn;
class student{
	int rno;
	String name;
	public student(){
		System.out.println("default constructor called");
	}
	public student(int rno,String name) {
		this();
		System.out.println("parameterized constructor called");
		this.rno=rno;
		this.name=name;
	}
	void display(student s) {
		System.out.println("Rno.: "+s.rno);
		System.out.println("Name: "+s.name);
	}
	
	  void show()
	  { this.display(this);
	  }
	 
	
}
public class thisdemo {
public static void main(String[] args) {
	student st=new student(5,"nitin");
	st.show();
}
}
