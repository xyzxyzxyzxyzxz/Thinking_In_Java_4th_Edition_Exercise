
public class ClassE3_2 {
	public static void main (String[] args ) {
		AFloat t1=new AFloat();
		AFloat t2=new AFloat();
		
		t1.val=1;
		t2.val=2;
		
		System.out.print("t1.val="+t1.val+" t2.val="+t2.val+"\n");
		
		t2=t1;
		t1.val=100;
		System.out.print("t1.val="+t1.val+" t2.val="+t2.val+"\n");
	}
}


