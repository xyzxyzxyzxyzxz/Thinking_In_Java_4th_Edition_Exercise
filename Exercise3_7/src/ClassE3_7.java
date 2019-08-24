import java.util.*;

public class ClassE3_7 {
	public static void main (String[] args) {
		Random coin=new Random();
		int frba=coin.nextInt(2);
		if (frba==0)
			System.out.println("front");
		else
			System.out.println("back");
	}
}
