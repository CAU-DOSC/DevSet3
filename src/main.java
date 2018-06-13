import java.util.Random;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] v;
		
		Random rand = new Random();

		IntSet S = new IntSetBST();
	    
		S.intSetImp(50, 100);
		while(S.size() < 99){
			S.insert(rand.nextInt() % 50);
		}
		
	       
		v = S.report();
	    
	    for (int i = 0; i < v.length; i++)
	    	System.out.println(v[i]);
	    	
	}

}
