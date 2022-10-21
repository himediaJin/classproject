package first;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("==========Start to Generate User Table==========");
		char[] animationChars = new char[] { '|', '/', '-', '\\' };
		for (int i = 0; i < 1000000; i++) {
		    System.out.print("Processing: " + String.format("%.3f",i/10000f) + "% " + animationChars[i % 4] + "\r");
		    //userRepository.save(new User(String.format("name%07d", i), 10L));
		}
		System.out.println("==========Fin.==========");
		
		
		System.out.print("test \r");
		System.out.print("!!!");

	}

}
