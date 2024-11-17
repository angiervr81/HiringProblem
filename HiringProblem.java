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
                    totalCost += currentHireSkill;   // hiring cost will equal to skill level
                    hiredCandidates.append("Candidate ").append(i+1).append(" "); //keep track of hired candidates 
                }else{

                    // If statement to check if next cancidate is better than current 
                    if (candidates[i] > currentHireSkill) {
                        // calculate hiring cost 
                        int hiringCost = candidates[i] - currentHireSkill;
                        totalCost += hiringCost; // adad the hiring cost to the total 
                        currentHireSkill = candidates[i];  //update current hired skill level 
                        hiredCandidates.append("Candidate "). append(i+1).append(" ");  // keep track of hired candidates
                        
                    }
                }
            }
                // printing out the results 
                System.out.print(" A = [");
                for (int i=0; i<candidates.length;i++){
                    System.out.print(candidates[i]);

                    if (i < candidates.length -1){
                        System.out.print(" , ");
                    }
                }

                System.out.println("] " + hiredCandidates + " are hired and the total cost of this hiring process is $" + totalCost);


        }
    }
}