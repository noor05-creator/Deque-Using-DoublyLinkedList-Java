
class Node{
    int data;
    Node prev;
    Node next;

    Node(int data){
        this.data = data;
        prev = next = null;
    }
}

class deque{
    Node front;
    Node rear;
    deque(){
        front = rear = null;
    }

    boolean isEmpty()
    {
        if(front == null && rear == null)
        {
            return true;
        }
        return false;
    }

    void pushFront(int data)
    {
        Node newNode = new Node(data);
        if(isEmpty()){
            front = rear = newNode;
            return;
        }
        newNode.next = front;
        front.prev = newNode;
       // newNode.prev = null;
        front = newNode;


    }
    void pushBack(int data)
    {
        Node newNode = new Node(data);
        if(isEmpty())
        {
            front = rear = newNode;
            return;
        }
        newNode.prev = rear;
        rear.next = newNode;
        //newNode.next = null;
        rear = newNode;
    }
    void popFront()
    {
        if(isEmpty())
        {
            System.out.println("Nothing to pop");
            return;
        }

        front = front.next;
        //if there was a single node only
        if(front != null)
        {
            front.prev = null;
        }
        else{
            rear = null;
        }
    }
    void popBack()
    {
        if(isEmpty())
        {
            System.out.println("Nothing to pop");
            return;
        }
        rear = rear.prev;
        if(rear!= null){
            rear.next = null;
        }
        else{
            front = null;
        }
    }


}






//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}