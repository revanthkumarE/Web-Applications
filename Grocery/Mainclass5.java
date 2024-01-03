
class demo5{
	int a=10;
	int b=20;
	
	
}
class Mainclass5 {
	
	public static void main(String[] args) {
		System.out.println("main method started....");
		
		demo5.d1 = new demo5();
		demo5.d2 = new demo5();
		
		System.out.println("first value of d1 is :" +d1.a);
        System.out.println("first value of d1 is :" +d1.b);

        System.out.println("second value of d1 is :" +d2.a);
        System.out.println("second value of d1 is :" +d2.a);
        
        System.out.println("main method ended");
	}

}
