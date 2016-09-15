package hello_world;

public class Hello_world {

	double d1;
	
	private void kbdTest(){
		
		int i1 = Kbd.readInt("Integer: ");
		String test = Kbd.readString("Input Kbd: ");
		System.out.println(i1);
		System.out.println(test);
		
	}
	
	private void liten(){
		char c1 = Kbd.readChar("char: ");
		if((int)c1 >= (int)'A' & (int)c1 <= (int)'Z'){
			System.out.println(c1 + " liten " + (char)(c1+32));
			
		}
		else if((int)c1 >= (int)'a' & (int)c1 <= (int)'z'){
			System.out.println(c1 + " stor " + (char)(c1-32));

		}
		else{
			System.out.println("Error");
		}

	}
	
	private void tArea() {
		double b = Kbd.readDouble("Bas: ");
		double h = Kbd.readDouble("Höjd: ");
		System.out.println((b*h/2));
	}
	
	private int avrunda(double d1){
		d1 += 0.5;
		return (int)d1;
	}
	
	private void bankomat() {
		double d2 = Kbd.readInt("hur mycket pengar: ");
		d2 = (d2/100);
		Hello_world h1 = new Hello_world();
		d2 = h1.avrunda(d2);
		System.out.println(d2*100);
	}
	
	private void bankomat2() {
		double d3 = Kbd.readDouble("Input: ");
		double d4 = 0;
		double d5 = 0;
		while(d3 > 0){
			if(d3 > 500){
				d4 += 500;
				d3 -= 500;
			}
			else if(d3 > 100){
				d5 += 100;
				d3 -= 100;
			}
			else{
				d5 += 100;
				d3 = 0;
			}
		}
		System.out.println("500: " + d4);
		System.out.println("100: " + d5);
	}
	
	public static void main(String[] args) {
		Hello_world h = new Hello_world();
		
		//h.kbdTest();
		//h.liten();
		//h.tArea();
		h.bankomat2();
		
	}

}
