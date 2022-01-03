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
 * AdjListOutputFile name is passed through the command line as args[1]
 * Output to AdjListOutputFile with the format:
 * 1. c lines, each starting with a different course ID, then 
 *    listing all of that course's prerequisites (space separated)
 */
public class AdjList {

    private HashMap<String, ArrayList<String>> adjList; //graph

    //Contructor that creates the graph based off the input data
    public AdjList(){ 
        adjList = new HashMap<String, ArrayList<String>>();
        buildGraph();
    }

    public void buildGraph(){
        //Creating the adjList and reading through the input file to add the courses
        int numCourses = StdIn.readInt();
        StdIn.readLine();

        String course = null;

        for(int i = 0; i < numCourses; i++){
            course = StdIn.readLine();
            adjList.put(course, new ArrayList<String>());
            adjList.get(course).add(course);
        }
        
        int numConnections = StdIn.readInt();
        StdIn.readLine();
        String prereq = null;

        //Adding prereq to courses in adjList
        for(int i = 0; i < numConnections; i++){
            prereq = StdIn.readLine();
            
            //Finds the Key = course
            course = prereq.substring(0, prereq.indexOf(" "));

            //Finds the Value = prereq that is to be inserted at the key
            prereq = prereq.substring(prereq.indexOf(" ") + 1);
            adjList.get(course).add(prereq);
        }
    }

    //Adding direct prereq to a course
    public void addEdge(String course, String prereq){
        adjList.get(course).add(prereq);
    }

    //Getter method for the graph
    public HashMap<String, ArrayList<String>> getGraph(){
        return adjList;
    }

    //Methods for ValidPreq.java
    public boolean hasCycle(String course1, String course2){
        boolean hasCycle = search(course1, course2);
        return hasCycle;
    }

    public boolean search(String course1, String course2){
        if(course2.equals(course1)){
            return true;
        }
        if(adjList.get(course2).size() == 1){ //termination condition if there is only one course
            return false;
        }

        for(int i = 1; i < adjList.get(course2).size(); i++){ //i = 1 bc the first value is the original course

            //if we found a prereq that is equal to course1 then there is cycle and we don't need to check anymore
            if(search(course1, adjList.get(course2).get(i))){
                return true;
            }
        }

        return false;
    }

    //Methods for Eligible.java
    
    public ArrayList<String> coursesCompleted(ArrayList<String> courses){
        ArrayList<String> prereqList = new ArrayList<String>();
        for(int i = 0; i < courses.size(); i++){
            prereqList.add(courses.get(i));
            prereq(prereqList, courses.get(i));
        }
        return prereqList;
    }

    public void prereq(ArrayList<String> prereqList, String course){
        for(int i = 1; i < adjList.get(course).size(); i++){
            prereqList.add(adjList.get(course).get(i));
            prereq(prereqList, adjList.get(course).get(i));
        }
    }

    public static void main(String[] args) {

        if ( args.length < 2 ) {
            StdOut.println("Execute: java -cp bin prereqchecker.AdjList <adjacency list INput file> <adjacency list OUTput file>");
            return;
        }

        //Inputting data into the list
        StdIn.setFile(args[0]);

        AdjList graph = new AdjList();

        //Local adjList HashMap (not instance var)
        HashMap<String, ArrayList<String>> adjList = graph.getGraph();

        //Writing to the output file
        StdOut.setFile(args[1]);

        for(String key : adjList.keySet()){
            for(int i = 0; i < adjList.get(key).size(); i++){
                StdOut.print(adjList.get(key).get(i) + " ");
            }
            StdOut.println();
        }



    }

}
