package nitinn;

public class Module_2_23 {
	
	
			int datamembers;
			String name;
			int age;
			long phonenumber;
			String address;
			int salary;
			
			void printSalary() {
				System.out.println("Name: "+name+" Salary : "+salary);
			}
		
	
public static void main(String[] args) {
	Module_2_23 ob=new Module_2_23();
	ob.datamembers=1;
	ob.name="Nitin";
	ob.age=21;
	ob.phonenumber=123456789;
	ob.address="Sirohi Rajasthan";
	ob.salary=15000;
	ob.printSalary();
	

}}
