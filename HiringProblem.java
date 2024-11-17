import java.util.Random;
import java.util.Arrays;

class HiringProblem{ 

    public static void main(String[] args) {
        
        Random random  = new Random(); // creating a randome object
        int numOfInterviews = 5; // num of times that will repeat the hiring process
        int numOfCandiates = 5;  // number of candidates 

        // 1st for loop that will repeat the process for interviewing
        for(int interviews = 0; interviews< numOfInterviews;interviews++){
            int [] candidates = new int[numOfCandiates];  // Array to hold cancidates skill level 

            // 2nd for loop that will fill the array with random skill levles between 0-100
            for(int i = 0; i < numOfCandiates; i++){
                candidates[i] = random.nextInt(101); // we want the range to be b/w 0-100 for me make it 101
            }

            int totalCost = 0;  // initialize total cost 
            int currentHireSkill = -1; // initialize skill level 
            StringBuilder hiredCandidates = new StringBuilder(); // we want to add a string builder to keep track hired candidates
            
            //3rd for loop to go through the candidates
            for(int i = 0; i< candidates.length; i++){
                totalCost +=1; // adding $1 for the interview 

                //If statemnet that will hire the 1st candiate 
                if(i==0){
                    currentHireSkill = candidates[i];
                    totalCost += currentHireSkill;   // hiring cost 
                    hiredCandidates.append("Candidate ").append(i+1).append(" ");
                }else{
                    if (candidates[i] > currentHireSkill) {
                        int hiringCost = candidates[i] - currentHireSkill;
                        totalCost += hiringCost;
                        currentHireSkill = candidates[i];
                        hiredCandidates.append("Candidate "). append(i+1).append(" ");
                        
                    }
                }
            }




        }
    }
}