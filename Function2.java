class Function2{
	public static void main(String[] args){
		int total = sum(1,2);
		System.out.println("The sum of two number is:"+total);
		System.out.println(name());
	}
	static int sum(int x, int y){
		return x+y;
		// Any code after the return statement won't execute
		// The output should be in int as we already defined the return type as int during function declartion
	}
	static String name(){
		return "Hello this is sonis sapkota from Bhairahawa";
	}
}