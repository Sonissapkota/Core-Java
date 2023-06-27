import java.util.Scanner;

class ClassAndObject{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		System.out.println("Enter you age:");
		int age = sc.nextInt();
		if(age<=18){
			System.out.print("Hello" +  name +  "you cannot vote");
		}else{
			System.out.print("Hello" +  name +  "you can vote");
		}
	}
}