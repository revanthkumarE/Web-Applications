package rev;

class demo6{
	static double x=90;
	static void disp() {
		System.out.println("disp method running ");
		
		
		
	}
}

class demo7{
	public static void main(String[] args) {
		System.out.println("main method running");
		System.out.println("x value is "+demo6.x);
		demo6.x=100;
		System.out.println(demo6.x);
	}
}
