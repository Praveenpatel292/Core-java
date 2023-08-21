package core_java.com.pp;

public class Test1 {
	
	public Test1() {
		int i = 10;
		int j = 20;
		int k = i +j;
		System.out.println("Result +"+ k );
	}

	public static void main(String[] args) {
		System.out.println("Main Method");	
		Test1  t = new Test1();
		
		System.out.println("Stop excution");

	}

}
