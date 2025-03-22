
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
        /*alternatively you can do
        if(front == rear)
        {
        front = rear = null;
        }
        else{
        front = front.next;
        front.prev = null;
       }
         */
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

        /*
        alternatively you can do is
        if(rear == null) //to check single node case
        {
        front = rear = null;
        }
        else
        {
        rear = rear.prev;
        rear.next = null;
        }
         */
        if(rear!= null){
            rear.next = null;
        }
        else{
            front = null;
        }
    }

    void print()
    {
        if(isEmpty())
        {
            System.out.println("Deque is empty");
            return;
        }

        Node temp = front;
        while(temp!= null)
        {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }



}






public class Main {
    public static void main(String[] args) {
        deque dq1 = new deque();
        //dq1.popBack();
        //dq1.popFront();
        dq1.pushFront(1);
        dq1.pushBack(2);
        dq1.print();
        dq1.popFront();
        dq1.print();
        dq1.popBack();
        dq1.print();


        }
    }
