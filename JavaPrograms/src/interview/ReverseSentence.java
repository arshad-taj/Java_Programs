/*Program to reverse sentence 
 *  e.g. "Arshad is Automation test engineer" to
 *  rngineer test Automation is Arshad"
 */
package interview;

public class ReverseSentence {

	public static void main(String[] args) {
		String str = "Arshad is Automation test engineer";
		String arr[] = str.split(" ");
		String revSent = " ";
		for (int i = arr.length-1; i>=0 ; i--) {
			revSent = revSent + " " + arr[i];
		}
		
		System.out.println(revSent.trim());

	}
	
}
