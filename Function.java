import java.util.Scanner;

class Function{
	public static void main (String[] args){
		sum();
	}

	static void sum(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you name:");
		String name = sc.nextLine();
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		if(age<=18){
			System.out.println("You cannot vote "+" " + name);
		}else{
			System.out.println("You can vote " +" " +name);
		}
	}
}