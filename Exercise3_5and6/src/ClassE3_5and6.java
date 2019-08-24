
public class ClassE3_5and6 {
	public static void main (String[] args) {
		Dog spot=new Dog();
		Dog scruffy=new Dog();
		spot.name="spot";
		scruffy.name="scruffy";
		spot.says="Ruff";
		scruffy.says="Wurf";
		
		System.out.println("spot name:"+spot.name+" spot syas:"+spot.says);
		System.out.println("scruffy name:"+scruffy.name+" scuffy syas:"+scruffy.says);
		
		Dog dog1;
		dog1=spot;
		System.out.println("dog1==spot:"+(dog1==spot));
		System.out.println("dog1.equals(spot):"+(dog1.equals(spot)));
	}
}
