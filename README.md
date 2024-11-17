# HiringProblem
I was giving an assignment by my profressor of algorithms: She asked that we creatie a program that will take an array and give a random value to each index(candidate).
These values indicate the skill level of each candidate.  We will interview each candidate's skill levels and based on their skill levels we will make the deicsion to hire. 
In the end we need to run the calculations of the each person that was interviewed and hired. 

Q-2) Hiring Problem

a) Create an array of 5. Each array index will represent a candidate to be interviewed. 

b) Randomly assign values between 0-100 to those array indexes. These values indicate the skill level of a candidate.

i.e. A = [20, 3, 32, 8, 98]

c) Once you have the array of candidates with their skills then compute the hiring cost. 

d) You will hire the best possible candidate.

e) Interviewing each candidate costs $1. 

f) You will hire the first candidate regardless their skill level

g) You will only hire a new person if and only if they're better than the previous one and when you hire the hiring cost will depend on how much more they are skilled then the previous employee.

i.e. For  A = [20, 3, 32, 8, 98] 


You will interview the first candidate and spend $1 for the interview, and you will hire the first candidate whose skill level is 20 and hiring them will cost you $20. Overall the first candidate will cost you $21 including hiring and interviewing.


You will interview the second candidate and spend $1 for the interview, and you will not hire the second person because they are not better than the person you already hired. Overall the second candidate will cost you $1 for only interviewing.

You will interview the third candidate and spend $1 for the interview, and you will hire the third candidate because they are better than your current employee. The hiring cost will be the skill difference of the new employee and the previous employee. To hire the third candidate, you'd spend $32-$20=$12. Overall the thirdcandidate will cost you $13 including hiring and interviewing.
You will interview the fourth candidate and spend $1 for the interview, and you will not hire the fourth person because they are not better than the person you already hired. Overall the fourth candidate will cost you $1 for only interviewing.

You will interview the fifth candidate and spend $1 for the interview, and you will hire the fifth candidate because they are better than your current employee. The hiring cost will be the skill difference of the new employee and the previous employee. To hire the fifth candidate, you'd spend $98-$32=$66. Overall the thirdcandidate will cost you $67 including hiring and interviewing.
At the end print the sequence you randomly generated and the total cost. i.e. A sample putput

Among the candidates A = [20, 3, 32, 8, 98], candidate 1, 3, and 5 are hired and  the total cost of this hiring process is $103

h) Generate 5 random lists and repeat all the steps above for five times.
