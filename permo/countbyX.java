public class countbyX {
	public static int[] countBy(int x, int n){
		int[] p = new int[n+1];
		int u = n;	
		for (int i=0; i<=n; i++) {
			p[i] = x + i;

		System.out.print( p + ",");
		
		}

		return null;
	}

	public static void main (String[] args) {
	countBy(1,10);
	}


}
