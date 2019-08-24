
public class ClassE3_3 {
	static void f(AFloat y) {
		y.val=0;
	}
	public static void main (String[] args) {
		AFloat x=new AFloat();
		x.val=1;
		System.out.println("x.val="+x.val);
		f(x);
		System.out.println("x.val="+x.val);
	}
}
