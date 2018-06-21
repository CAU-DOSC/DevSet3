package Set;

import java.util.Random;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] v;
		
		final int m = 20000;
		final int maxval = 20000;
		
		Random rand = new Random();
		
		IntSet S = new IntSetBST();
	    
		S.intSetImp(m, maxval);

		int inx = 0;
		
		while (S.size() < m)
			S.insert(inx++);
		
		v = S.report();
	    
	    for (int i = 0; i < v.length; i++)
	    	System.out.println(v[i] + " / line : " + i);
	    	
	}
}
