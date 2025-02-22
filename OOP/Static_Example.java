package oop;

 class Human{
	 
	 String name;
	 int age;
	 long salary;
	static int population=0;
	 
	 public Human(String name,int age,long salary,int population) {
		 this.name=name;
		 this.age=age;
		 this.salary=salary;
		 Human.population+=1;
	 }
	 
 }
public class Static_Example {

	
	public static void main(String[] args) {
		
		Human raj=new Human("Raj",23,15000,1);
		System.out.println("Total Population: when Raj created:"+raj.population);
		
		Human viraj=new Human("Viraj",25,15000,1);
		System.out.println("Total Population: when Viraj created:"+viraj.population);

		Human niraj=new Human("niraj",25,12000,1);
		System.out.println("Total Population: when Niraj created:"+niraj.population);

		Human dhiraj=new Human("dhiraj",25,12000,1);
		System.out.println("Total Population: when Dhiraj created:"+dhiraj.population);

		Human miraj=new Human("miraj",25,12000,1);
		System.out.println("Total Population: when Miraj created:"+miraj.population);

		
		System.out.println("**********************");
		
		System.out.println("Human Population:"+Human.population);
	}
}
