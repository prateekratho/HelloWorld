package JavaPackage;

public class bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//Get Bit
//		int n =5; //0101
//		int pos =3; 
//		int bitmassk = 1<<pos; //0001 ->0100
//		if((bitmassk & n) == 0) { //0100 & 0101
//			System.out.println("bit was zero");
//		}
//		else {
//			System.out.println("bit was one");
//		}
		//Get Bit
				int n =5; //0101
				int pos =1; 
				int bitmassk = 1<<pos; //0001 ->0100
				
				int newNumber = bitmassk | n;
				
					System.out.println(newNumber);
				}

}
