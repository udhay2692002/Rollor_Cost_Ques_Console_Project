# Rollor_Cost_Ques_Console_Project

Initialization: The program starts by creating an integer array 'a' of size 5. Four values are assigned to the array elements: a[0] = 4, a[1] = 2, a[2] = 1, and a[3] = 3. These represent the number of passengers in each round of the ride.

Input: The user is prompted to enter the number of rounds for the day and the number of seats available on the "Rolor Cost" ride. These values are stored in the 'rounds' and 'seats' variables, respectively.

Simulation: The program runs a loop for the given number of 'rounds' (as entered by the user). Inside the loop, it calculates the sum of the first two elements of array 'a' and checks if this sum is less than or equal to the number of available seats ('seats').

Passenger Allocation: If the sum of the first two elements of 'a' is less than or equal to 'seats', the program allocates those two elements as a group for the round. It prints the elements in the format "a[0],a[1] IS TRAVELING ROUND_NUMBER ROUND" and increments the 'count' variable, which keeps track of the current round.

Revenue Calculation: The program calculates the revenue for the current round by multiplying the number of tickets (here, 'ticket' is 1) with the values of a[0] and a[1]. The revenue for the round is added to the 'profit' variable.

Updating the Array: After allocating the group, the program shifts the elements in the array 'a' to the left. The last element of the array (a[3]) is moved to the first position, and so on.

Passenger Allocation (Special Case): If the sum of the first two elements of 'a' is greater than the number of available seats, the program allocates only the first element (a[0]) for the round.

Revenue Calculation (Special Case): The program calculates the revenue for this special case by multiplying the number of tickets (here, 'ticket' is 1) with the value of a[0]. The revenue is added to the 'profit' variable.

Updating the Array (Special Case): Similar to step 6, the program shifts the elements in the array 'a' to the left. The last element of the array (a[3]) is moved to the first position.

Repeat: The loop continues for the given number of rounds, and the process of passenger allocation, revenue calculation, and array updating repeats accordingly.

Total Revenue: After all the rounds are completed, the program prints the total revenue earned by the ride, which is stored in the 'profit' variable.
