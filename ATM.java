import javax.swing.JOptionPane;

public class ATM {

	// Creating variables needed in this task
	static int balance = 1000;
	
	public static void main(String[] args) {
		
		// creating while loop to continue the program until the user wants to end it 
		while(true) {
            
			// creating a variable for presenting information for user to use
            String info = "Automated Teller Machine\n";
            info += "Choose the operation you want to perform:\n";
            info += "Choose 1 for Withdraw\n";
            info += "Choose 2 for Deposit\n";
            info += "Choose 3 for Check Balance\n";
            info += "Choose 4 for Exit";
            
            // Getting the choice number as a string
            String answer = JOptionPane.showInputDialog(info);
            // Converting the string into number to deal with
            int answerAsNumber = Integer.parseInt(answer);
            
            
            // Creating if statement to check the number for doing the processes (withdraw, deposit, check, exit)
            if(answerAsNumber == 1) { 
            	// Calling the function withdraw
            	withdraw();
            	
            }else if(answerAsNumber == 2) {
            	// Calling the function deposit
            	deposit();
            	
            }else if(answerAsNumber == 3) {
            	// Calling the function check
            	check();
            	
            }else if(answerAsNumber == 4) {
            	// To exit the application
            	break;
            	
            }else {
            	// This is for the user in case entering an invalid number
            	JOptionPane.showMessageDialog(null,"Invalid answer. Please enter 1, 2, 3, or 4.");
            }
            
            
		}

	}
	
	
	//------------------------------------------------------------------------------------------------------------
	
	
	// Creating the function withdraw
	static void withdraw() {
		// creating an prompt to get the number from user as a string
		String answer = JOptionPane.showInputDialog("Enter the number for withdraw : ");
		// convert the string to integer
        int withdraw = Integer.parseInt(answer);
		
        // checking if the withdraw is bigger than balance or the balance equals 0   >>>   user will not get money
        // if the withdraw > balance and balance > 0    >>>   the user will get the money
		if(balance == 0 || withdraw > balance) {
			JOptionPane.showMessageDialog(null,"Sorry, you can not take the money.\nYour balance is " + balance);
		}else {
			balance -= withdraw;
			JOptionPane.showMessageDialog(null,"Please, collect you money");
		}
		
	}
	
	
	//------------------------------------------------------------------------------------------------------------

	
	// Creating the function deposit
	static void deposit() {
		
		// creating an prompt to get the number from user as a string
		String answer = JOptionPane.showInputDialog("Enter the number for deposit : ");
		// convert the string to integer
        int deposit = Integer.parseInt(answer);
        // add the number to the variable
        balance += deposit;
		
        
        // Showing a message to the user
		JOptionPane.showMessageDialog(null, "Your Money has been successfully depsited.\nYour balance now is " + balance);
	}
	
	
	//------------------------------------------------------------------------------------------------------------
	
	
	// Creating the function deposit
	static void check() {
		// Showing the balance to the user
		JOptionPane.showMessageDialog(null, "Your balance is " + balance);
	}
	
	
	//------------------------------------------------------------------------------------------------------------


}
