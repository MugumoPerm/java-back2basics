public class nestedforloops {
	public static void main(String[] args){
		for (int i=0; i<=5; i++){
			for (int j=0; j<=i; j++){
				System.out.println(j);
			}
			System.out.println("outside the inner loop");
		}
	}
}
