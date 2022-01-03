public class LinkedListStack<T> {

    private Node<T> first = null;

    private class Node<T> {
        private T item;
        private Node<T> next;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void push(T item){
        Node<T> newNode = new Node<>();
        newNode.item = item;
        if(isEmpty()){ //Check to see if there are any elements in the stack 
           first = newNode; 
        } else {
            newNode.next = first;
            first = newNode;
        }

    }

    public T pop(){
        T item = first.item;
        first = first.next;
        return item;
    }

    public static void main(String[] args){
        LinkedListStack<String> stack = new LinkedListStack<String>();
        stack.push("Cat");
        stack.push("Dog");
        stack.push("Rabbit");
        stack.push("Monkey");

        while( !stack.isEmpty() ) {
            System.out.println(stack.pop());
        }
    }


}
