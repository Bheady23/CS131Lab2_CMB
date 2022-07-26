
public class Application {

	public static void main(String[] args) {
		
		//creating Wizard and checking for locked protection
		Wizard one = new Wizard ("Chris",95);
		System.out.println(one.toString());
		one.setKey(25);
		one.lock(25);
		one.unlock(23);
		one.takeDamage(100);
		System.out.println(one.toString());
		System.out.print("Wizard "+one.getName()+" protection spell was locked no damage taken");
		
		System.out.println();
		System.out.println();
		
		//creating Wizard and checking for unlocked or no protection
		Wizard two=new Wizard ("Acadia", 86);
		System.out.println(two.toString());
		two.setKey(50);
		two.lock(34);
		two.unlock(50);
		two.takeDamage(75);
		System.out.println(two.toString());
		System.out.print("Wizard "+two.getName()+" protection spell was unlocked damage taken!");
		
		
		
	}//end main

}//end class
