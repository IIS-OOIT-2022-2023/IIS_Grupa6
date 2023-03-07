package introduction;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello world, Grupa 6");
		
		double firstNumber;
		firstNumber = 1;
		double secondNumber = 2;
		
		double result=firstNumber/secondNumber;
		System.out.println(result);
		
		int intResult=(int)(firstNumber/secondNumber);
		System.out.println(intResult);
		
		int firstNumber1;
		firstNumber1 = 1;
		int secondNumber1 = 2;
		
		int intResult3=firstNumber1/secondNumber1;
		System.out.println(intResult3);
		
		boolean firstBool = true;
		boolean secondBool = false;
		System.out.println(firstBool && secondBool);
		System.out.println(firstBool || secondBool);
		
		if(firstNumber>0) {
			System.out.println("prvi broj");
		}else {
			System.out.println("drugi broj");
		}
		
		String ime="Petar";
		String prezime="Petrovic";
		int broj=2;
		System.out.println(ime + " "+ prezime+" " + broj);
		String broj2="2";
		System.out.println(broj+broj2);
	}

}
