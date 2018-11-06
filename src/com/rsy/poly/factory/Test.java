package com.rsy.poly.factory;

public class Test {
	
		public static void main(String []args) {
			MIPhoneBar1 mib = new MIPhoneBar1();
			Phone p = mib.sellPhone(); 	
			p.call(19299999);
		
		
			MIPhoneBar2 mib2 = new MIPhoneBar2();
			Phone p2 = mib2.sellPhone();
			p2.call(17298373);
			
			HWPhoneBar1 hwb = new HWPhoneBar1();
			Phone p3 = hwb.sellPhone();
			p3.call(13432534);
			
			HWPhoneBar2 hwb2 = new HWPhoneBar2();
			Phone p4 = hwb2.sellPhone();
			p4.call(13432534);
			}
}
