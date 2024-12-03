/*/Landon Barden's Work/*/
public class AppleTester{

	public static void main(String[] args) {
		
		//Unsure if this is the way the lab wants. Originally I had it to where the user would provide input but the lab
		//is worded in a way where that seems to not be the case? Anyways, the parameters reference the parameter apple object
		//and Apple2 references the default object.
		Apple Apple1 = new Apple("Golden Delicious", 1.23, 1.54);
		Apple Apple2 = new Apple();
		Apple Apple3 = new Apple("Granny Smith", 1.43, 1.99);
		
		System.out.println(Apple1.toString());
		System.out.println(Apple2.toString());
		System.out.println(Apple3.toString());
		
		if(Apple1.equals(Apple3) == true) { //uses the output from "equals" to output this dialog
			System.out.println("The apples are the same type.");
		}
		else {
			System.out.println("The apples are not the same type.");
		}
	}
}
