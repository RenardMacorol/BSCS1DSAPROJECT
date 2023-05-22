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
			System.out.println("The first and second person has the same height");
		} else if (person2 == person3 && person2 != person1) {
			System.out.println("The second and third person has the same height");
		} else if (person3 == person1 && person3 != person2) {
			System.out.println("The first and third person has the same height");
		} else {
			System.out.println("The three persons are the same height");
		}
	}
}


/*Height Comparison Algorithm

Step 1: Start
Step 2: Accept three heights values: 'person1', 'person2', and 'person3'.
Step 3: Compare the heights using a conditional statements:
		* If 'person1' is greater then both 'person2' and 'person3', print "The first person is taller".
		* If 'person2' is greater then both 'person1' and 'person3', print "The second person is taller".
		* If 'person3' is greater then both 'person1' and 'person2', print "The thrid person is taller".
		* If 'person1' and 'person2' has the same height but different from 'person3', 
			print "The first and second person has the same height".
		* If 'person2' and 'person3' has the same height but different from 'person1', 
			print "The second and third person has the same height".
		* If 'person1' and 'person3' has the same height but different from 'person2', 
			print "The first and third person has the same height".
		* If all three heights are equal, print "The three persons are the same height".
Step 4: End

 */