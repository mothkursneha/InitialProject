public class LinkedList {
    public static Node head;

    private class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }


    public void Insert(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            return;
        }
        else{
            Node cuurrent=head;
            while (cuurrent.next!=null) {
                cuurrent=cuurrent.next;
            }
            cuurrent.next=node;
        }
    }

    public void print(){
        Node current = head;
        while (current!=null) {
            System.out.print(current.data+ " -> ");
            current=current.next;
        }
        System.out.println("Null");
    }
    
}
