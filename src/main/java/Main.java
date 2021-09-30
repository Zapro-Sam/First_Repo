import java.io.IOException;

public class Main {
	Main() throws IOException{
		
	}
	static {
		System.out.println("Static block......");
	}
	public static void main(String[] args) {
		System.out.println("Hello");
	}
}

class A extends Main{

	A() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

//	A(){
//		
//	}
}


