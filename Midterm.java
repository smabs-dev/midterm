package week4;
import stanford.karel.*/
//1)
public class InnerBorderKarel extends SuperKarel {
	public void run() {
		moveUpRow();
		for(int i=0;i<4;i++) {
			handleBorder();
			nextPosition();
	}
}
		private void handleBorder() {
			move();
			while(frontIsClear()) {
				if(noBeepersPresent()) {
					putBeeper();
				}
			move();
			}
		}
	private void moveUpRow() {
		turnLeft();
		move();
		turnRight();
	}
	private void nextPosition() {
		turnRight();
		move();
		turnRight();
		move();
		turnRight();
	}
}
/*2a) 5.0/4-4/5    answer: 1.25
 * 7 < 9 - 5 && 3 % 0 == 3  answer: false
 * "b" + 8 + 4
 *
 *2b) the 1st number is: 78
 *    the 2nd number is: 73
 *
 *
 *3) Simple Java Programs
import acm.program.*;

import acm.program.*;
public class SecondLargest extends ConsoleProgram {
//* Defines the sentinel used to signal the end of the input
private static final int SENTINEL = 0;
	public void run() {
		println("This program finds the two largest integers in a");
		println("list. Enter values, one per line, using a "
				+ SENTINEL + " to");
		println("signal the end of the list.");
		int largest = -1;
		int secondLargest = -1;
		while (true) {
			int input = readInt(" ? ");
			if (input == SENTINEL) break;
			if (input > largest) {
				secondLargest = largest;
				largest = input;
			} else if (input > secondLargest) {
				secondLargest = input;
			}
		}
		println("The largest value is " + largest);
		println("The second largest is " + secondLargest);
	}
}

 
 
 * 4) Frogger Graphics Program
 public class Frogger extends GraphicsProgram{
 	private GImage frog;
 	
 	public void run(){
 	frog = new GImage("res.frog.gif");
 	double fx = (getWidth() = frog.getWidth())/2;
 	double fy = getHeight() = frog.getHeight();
 	add(frog, fx, fy);
 	}
 	public void mouseClicked(MoustEvent even){
 		double mouseY = event.gety();
 		double frogTop = frog.getY();
 		double frogHeight = frog.getHeight();
 		double frogBottom = frogTop + frogHeight;
 		if (mouseY > frogTop && frogTop >= frogHeight) {
 			frog.move(0, -frogHeight);
 		} else if (mouseY > frogBottom && frogBottom + frogHeight <= getHeight()) {
 			frog.move(0. frogHeight);
 		}
 	}
 }
 *5) Strings and characters
private String removeDoubledLetters(String str) {
	String result = "";
	for (int i = 0; i < str.length(); i++) {
		char ch = str.charAt(i);
		if (i == 0 || ch != str.charAt(i - 1)) {
			result += ch;
		}
	}
	return result;
}
*
*/