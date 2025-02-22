package oop;

public class CreatingDestroyingObjects {

	
	public static  class A{
		
		int num=10;
		String name="rahul";
		static int count=0;
		
		public A(String name){this.name=name;}
		public A() {}
		
		@Override
		protected void finalize() throws Throwable {
		count++;
			System.out.println("Obj is destroyed :"+ name);
//			super.finalize();
			
			finalise();
			
			
		}
		
		static int finalise() {
			
			return count;
		}
			
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
	
		
		for(int i=0; i<1000000;i++) {
		
			A obj =new A("rahul-"+i);
			
		}
		
		System.out.println("**************************************");

		
		System.out.println("total count of Destroyed Objects :"+A.finalise());
		System.out.println("___________________________________");
	
	}

}
