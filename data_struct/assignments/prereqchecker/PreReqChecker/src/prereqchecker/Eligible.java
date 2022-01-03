package prereqchecker;

import java.util.*;

/**
 * 
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
 * EligibleInputFile name is passed through the command line as args[1]
 * Read from EligibleInputFile with the format:
 * 1. c (int): Number of courses
 * 2. c lines, each with 1 course ID
 * 
 * Step 3:
 * EligibleOutputFile name is passed through the command line as args[2]
 * Output to EligibleOutputFile with the format:
 * 1. Some number of lines, each with one course ID
 */
public class Eligible {
    public static void main(String[] args) {

        if ( args.length < 3 ) {
            StdOut.println("Execute: java -cp bin prereqchecker.Eligible <adjacency list INput file> <eligible INput file> <eligible OUTput file>");
            return;
        }

        //Creating the adjList graph
        StdIn.setFile(args[0]);
        AdjList graph = new AdjList();

        //Getting input from eligible.in
        StdIn.setFile(args[1]);
        int numCourses = StdIn.readInt();
        StdIn.readLine();
        ArrayList<String> courses = new ArrayList<String>();

        for(int i = 0; i < numCourses; i++){
            courses.add(StdIn.readLine());
        }

        //Finds all the courses completed including direct and indirect prereq given the course list in eligible.in
        ArrayList<String> prereqList = graph.coursesCompleted(courses);

        //Finding and writing the eligible courses to eligible.out
        StdOut.setFile(args[2]);
        HashMap<String, ArrayList<String>> adjList = graph.getGraph();
        for(String key : adjList.keySet()){

            boolean isEligible = true; //check this

            //if any of the prereqs are equal to the course than the course has already been taken
            if(prereqList.contains(key)){ 
                continue;
            }

            for(int i = 1; i < adjList.get(key).size(); i++){
                if(!prereqList.contains(adjList.get(key).get(i))){
                    isEligible = false;
                    break;
                }
            }
            if(isEligible){
                StdOut.println(key);
            }
        }

        // System.out.println(prereqList);

        // for(String key : graph.getGraph().keySet()){
        //     System.out.println(graph.getGraph().get(key));
        // }

       /* Test
        * System.out.println(graph.getGraph().values());
        * System.out.println();
        * System.out.println(courses);
        */

    }
}
