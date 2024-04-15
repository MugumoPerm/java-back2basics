public class fibonacci {
	public static void main (String[] args){
		System.out.println("hello fibonacci");
		int f1 = 0;
		int f2 = 1;
			
		for (int i=0; i<=10; i+=2){
			System.out.println(f1);
			System.out.println(f2);	

			f1 = f1 + f2;
			f2 = f1 + f2;
		}
		}
	}
