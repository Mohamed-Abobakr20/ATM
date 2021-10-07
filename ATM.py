# Creating variables needed in this task
balance = 1000

#---------------------------------------------------------------


# creating the deposit function
def deposit():
    # get the number for deposit from the user
    deposit = int(input("Enter the number for deposit : "))
    # to deal with the global variable and to add the number to it
    global balance
    balance = balance + deposit

    # print a message to the user
    print("Your Money has been successfully depsited.\nYour balance now is ", balance)


#---------------------------------------------------------------

# creating the withdraw function
def withdraw():
    # get the number for withdraw from the user
    withdraw = int(input("Enter the number for withdraw : "))
    # to deal wih the global variable
    global balance

    # checking if the withdraw is bigger than balance or the balance equals 0   >>>   user will not get money
    # if the withdraw > balance and balance > 0    >>>   the user will get the money 
    if balance == 0 or withdraw > balance:
        print("Sorry, you can not take the money.\nYour balance is ", balance)
    else:
        balance = balance - withdraw
        print("Please, collect your money")


#---------------------------------------------------------------

# creating the check function
def check():
    # Showing the balance to the user
    print("Your balance is ", balance)



#---------------------------------------------------------------
#---------------------------------------------------------------
#---------------------------------------------------------------
#---------------------------------------------------------------




# creating while loop to continue the program until the user wants to end it

while True:

    # creating a variable for presenting information for user to use
    info = "Automated Teller Machine\n"
    info += "Choose 1 for Withdraw\n"
    info += "Choose 2 for Deposit\n"
    info += "Choose 3 for Check Balance\n"
    info += "Choose 4 for Exit\n"
    info += "Choose the operation you want to perform: "

    # Getting the choice number as a string
    # converting it into a number
    answer = int(input(info))

    # Creating if statement to check the number for doing the processes (withdraw, deposit, check, exit)
    if answer == 1:
        # calling the withdraw function
        withdraw()
        print("-----------------------------------------")
    elif answer == 2:
        # calling the deposit function
        deposit()
        print("-----------------------------------------")
    elif answer == 3:
        # calling the check function
        check()
        print("-----------------------------------------")
    elif answer == 4:
        # To exit the program
        break
    else:
        # if the user inter invalid answer
        print("Invalid answer. Please enter 1, 2, 3, or 4.")
        print("-----------------------------------------")

#---------------------------------------------------------------

    














    

        
