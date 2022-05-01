package phase1_p2;

import phase1_p1.N;

public class Y extends N {
	
	public static void main(String[] args) {
		Y obj = new Y();
		System.out.println(obj.m5(5));
		System.out.println(obj.m4(10));
		
		X ob = new X();
		System.out.println(ob.m9(2.5f));
		System.out.println(ob.m10('M'));
		System.out.println(ob.m8(26));
	}
}
