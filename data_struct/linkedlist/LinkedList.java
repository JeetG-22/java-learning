public class LinkedList {

    private class Node {
        private String item;
        private Node next;
    }

    Node first; // points to the first node of the LL

    public void addToFront(String item) {
        Node newFirst = new Node();
        newFirst.item = item;
        newFirst.next = first;
        first = newFirst;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void print(){
        Node temp = first;
        while(temp != null){
            System.out.print(temp.item + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public String removeAtFront(){

        if(isEmpty()){
            return null;
        }

        String item = first.item;
        first = first.next;
        return item;
    }

    public static void main(String[] args){
        LinkedList link = new LinkedList();
        link.addToFront("Cat");
        link.addToFront("Dog");
        link.addToFront("Rabbit");
        link.print();
        System.out.println(link.removeAtFront());
        System.out.println(link.removeAtFront());
        System.out.println(link.removeAtFront());
        System.out.println(link.removeAtFront());


    }
}
