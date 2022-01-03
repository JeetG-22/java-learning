package prereqchecker;

import java.util.*;

/**
 * Steps to implement this class main method:
 * 
 * Step 1:
 * AdjListInputFile name is passed through the command line as args[0]
 * Read from AdjListInputFile with the format:
 * 1. a (int): number of courses in the graph
 * 2. a lines, each with 1 course ID
 * 3. b (int): number of edges in the graph
 * 4. b lines, each with a source ID
 * 
 * Step 2:
 * NeedToTakeInputFile name is passed through the command line as args[1]
 * Read from NeedToTakeInputFile with the format:
 * 1. One line, containing a course ID
 * 2. c (int): Number of courses
 * 3. c lines, each with one course ID
 * 
 * Step 3:
 * NeedToTakeOutputFile name is passed through the command line as args[2]
 * Output to NeedToTakeOutputFile with the format:
 * 1. Some number of lines, each with one course ID
 */
public class NeedToTake {
    public static void main(String[] args) {

        if ( args.length < 3 ) {
            StdOut.println("Execute: java NeedToTake <adjacency list INput file> <need to take INput file> <need to take OUTput file>");
            return;
        }

        //Creating the adjList graph
        StdIn.setFile(args[0]);
        AdjList graph = new AdjList();

        //Gathering the input from needtotake.in
        StdIn.setFile(args[1]);
        String targetCourse = StdIn.readLine();
        int numTakenCourses = StdIn.readInt();
        StdIn.readLine();
        ArrayList<String> inputList = new ArrayList<String>();
        for(int i = 0; i < numTakenCourses; i++){
            inputList.add(StdIn.readLine());
        }

        ArrayList<String> target = new ArrayList<String>();
        target.add(targetCourse);

        //Finding all the direct and indirect prereq for courses taken and target course
        ArrayList<String> takenCourseList = graph.coursesCompleted(inputList);
        ArrayList<String> targetCourseList = graph.coursesCompleted(target);

        //Removing duplicates from targetCourseList using HashSet
        HashSet<String> targetCourseSet = new HashSet<String>();
        for(int i = 1; i < targetCourseList.size(); i++){ //Starts at 1 bc we don't need target course
            targetCourseSet.add(targetCourseList.get(i));
        }
        
        //Writes to the output file needtotake.out
        StdOut.setFile(args[2]);
        for(String key : targetCourseSet){
            if(!takenCourseList.contains(key)){ //Checks to see if the target course prereqs have been completed or not
                StdOut.println(key);
            }
        }


        // System.out.println(takenCourseList);
        // System.out.println();
        // System.out.println(targetCourseList);

        

    }
}
