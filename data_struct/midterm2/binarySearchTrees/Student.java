package midterm2.binarySearchTrees;
/* We'll use this class as the value into a symbol table */
public class Student {
    
    private String name;
    private int    graduationYear;
    // other fields to be added: courses, grades, ...
    
    public Student (String name, int graduationYear) {
        this.name           = name;
        this.graduationYear = graduationYear;
    }
    public String toString () {
        return String.format("%s (%d)", name, graduationYear);
    }
}