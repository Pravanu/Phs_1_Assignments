package phase1_p2;

import phase1_p1.M;
import phase1_p1.N;

public class Z extends M{
	public static void main(String[] args) {
		Z obj = new Z();
		System.out.println(obj.m3(5.2f));
		
		N ob1=new N();
		ob1.m5(1);
		
		X ob = new X();
		System.out.println(ob.m9(2.5f));
		System.out.println(ob.m10('M'));
		System.out.println(ob.m8(26));
	}
}
