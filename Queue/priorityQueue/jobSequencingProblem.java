package Queue.priorityQueue;
import java.util.*;
public class jobSequencingProblem {
    static class Job{
        char job_id;
        int deadline;
        int profit;
        Job(char job_id,int deadline,int profit){
            this.job_id=job_id;
            this.deadline=deadline;
            this.profit=profit;
        }

    }
    public static void printJobScheduling(ArrayList<Job> arr){
//         import java.util.Arrays;
// import java.util.Comparator;

// class Job {
//     char id;
//     int deadline, profit;

//     Job(char id, int deadline, int profit) {
//         this.id = id;
//         this.deadline = deadline;
//         this.profit = profit;
//     }
// }

// // Custom comparator for sorting jobs based on profit in descending order
// class JobComparator implements Comparator<Job> {
//     public int compare(Job j1, Job j2) {
//         return j2.profit - j1.profit; // Sorting in descending order of profit
//     }
// }

// public class JobSequencing {
//     public static void main(String[] args) {
//         Job[] jobs = {
//             new Job('a', 4, 20),
//             new Job('b', 1, 10),
//             new Job('c', 1, 40),
//             new Job('d', 1, 30)
//         };

//         jobSequencing(jobs);
//     }

//     public static void jobSequencing(Job[] jobs) {
//         // Sort jobs using the custom comparator
//         Arrays.sort(jobs, new JobComparator());

//         int n = jobs.length;

//         // Find the maximum deadline to create a slot array
//         int maxDeadline = 0;
//         for (int i = 0; i < n; i++) {
//             if (jobs[i].deadline > maxDeadline) {
//                 maxDeadline = jobs[i].deadline;
//             }
//         }

//         char[] result = new char[maxDeadline]; // To store job sequence
//         boolean[] slot = new boolean[maxDeadline]; // To check occupied slots

//         // Iterate through all jobs
//         for (int i = 0; i < n; i++) {
//             // Find a free slot from job.deadline to 0
//             for (int j = Math.min(maxDeadline, jobs[i].deadline) - 1; j >= 0; j--) {
//                 if (!slot[j]) { // If slot is free, assign the job
//                     result[j] = jobs[i].id;
//                     slot[j] = true;
//                     break;
//                 }
//             }
//         }

//         // Print the scheduled jobs
//         for (int i = 0; i < maxDeadline; i++) {
//             if (result[i] != 0) {
//                 System.out.print(result[i] + ", ");
//             }
//         }
//     }
}
    
    public static void main(String[] args) {
        ArrayList<Job> arr= new ArrayList<Job>();
        arr.add(new Job('a', 4, 20));
        arr.add(new Job('b', 1, 10));
        arr.add(new Job('c', 1, 40));
        arr.add(new Job('d', 1, 30));
        System.out.println("Following is the maximum "
        +"Profit sequence of Jobs : ");
        printJobScheduling(arr);

    }
}
