package Number1.project1.src;


public class CompareHeight {
    public static void compare(int person1, int person2, int person3) {
		if (person1 > person2 && person1 > person3) {
			System.out.println("The first person is taller");
		} else if (person2 > person1 && person2 > person3) {
			System.out.println("The second person is taller");
		} else if (person3 > person1 && person3 > person2) {
			System.out.println("The third person is taller");
		} else if (person1 == person2 && person1 != person3) {
			System.out.println("The first and second person have the same height");
		} else if (person2 == person3 && person2 != person1) {
			System.out.println("The second and third person have the same height");
		} else if (person3 == person1 && person3 != person2) {
			System.out.println("The first and third person have the same height");
		} else {
			System.out.println("The three persons are the same height");
		}
	}
}
/*Height Comparison Algorithm

Start
Create a new 	Scanner to read user’s input
Print and enter the height of the First Person
Read the user input for the First Person
Print and enter the height of the Second Person
Read the user input for the First Person
Compare the height of the First Person and Second Person
Print out the result of the height comparison

he height of the second person: ");
		int height2= height.nextInt();
		
		//now we will use if statepackage heightcomparison;
 */