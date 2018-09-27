import javax.swing.JOptionPane;

//Genna Barge Random Guessing Game Code
public class U1L03RandomGuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//first allow the computer to obtain a random number 
		int computerNum = (int)(Math.random() * 100) + 1;
		int count = 0; 

		// ^ (see the slide for the code
//then, show a display screen and instructions, may input -1 etc. 
		JOptionPane.showMessageDialog(null, "Welcome to the number guesser!" +
"\nInput any number, and if you choose to quit at any point, enter -1." +
				" Let's get started!"); 


// ask for user input as to what the number may be
		String input = JOptionPane.showInputDialog("Enter a number between 1-100");
		int guess = Integer.parseInt(input);
		
// enter a if loop ex: if user guesses too high, it displays it
		while (guess != -1) {
			if (guess > computerNum) {
				JOptionPane.showMessageDialog(null, "Looks like your guess is a little too high!");
				count++;
				input = JOptionPane.showInputDialog("Guess again!");
			    guess = Integer.parseInt(input);
			}
			if (guess < computerNum) {
				JOptionPane.showMessageDialog(null, "A little too low!");
				count++; 
				input = JOptionPane.showInputDialog("Guess again!");
				guess = Integer.parseInt(input);
			}
			if (guess == computerNum) { 
				JOptionPane.showMessageDialog(null, "Congrats!! You guessed it correctly!");
				JOptionPane.showMessageDialog(null, "it took you " + count + " guesses");
				
				break; 
			}
			if (guess == -1) {
				JOptionPane.showMessageDialog(null, "Thanks for playing, bye!");
				JOptionPane.showMessageDialog(null, "you attempted this game " + count + " times");
				break; 
			}
		}
		
		//use another if statement to determine if its too low
		
		//another if statement if its the correct number
		//^print "Congrats! You guessed correctly! The amount of times... :" + count"
		
		//another if statement if the user inputs -1
		
//^ in the loops (excluding the -1, the count of how many guesses)
		
	}

}
