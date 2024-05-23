package linkedlist.theory;

public class PracticeBasics1 {

    static int length=1;
   // LinkedNode linkedNode = new LinkedNode();


    public static LinkedNode populateLinkedList()
    {
        LinkedNode head = new LinkedNode(4);
        LinkedNode five = new LinkedNode(5);
        LinkedNode eight = new LinkedNode(8);
        LinkedNode two = new LinkedNode(2);

        head.next = five;
        five.next = two;
        two.next = eight;

        return head;
    }

    public static LinkedNode populateWithPrevLinkedList()
    {
        LinkedNode head = new LinkedNode(4);
        LinkedNode five = new LinkedNode(5);
        LinkedNode eight = new LinkedNode(8);
        LinkedNode two = new LinkedNode(2);

        head.next = five;
        five.prev=head;
        five.next = two;
        two.prev=five;
        two.next = eight;
        eight.prev=two;

        return head;
    }

    public int getLength()
    {
        return length;
    }

    public static void printAllvalues(LinkedNode head)
    {
        System.out.println("+------------------------------+");
        while(head.next!=null)
        {
            head = head.next;
            System.out.println("|  next node value is : "+head.data+"      |");
            length++;
        }
        System.out.println("+------------------------------+");
        while(head.prev!=null)
        {
            head=head.prev;
            System.out.println("|  prev node value is : "+head.data+"      |");
        }
        System.out.println("+------------------------------+");
    }



    public static void main(String[] args)
    {

        LinkedNode list = populateWithPrevLinkedList();
        printAllvalues(list);

        PracticeBasics1 p = new PracticeBasics1();
        System.out.println("The length of the linkedlist is : "+p.getLength());

    }

//    public static class LinkedNode
//    {
//        int data;
//        LinkedNode next;
//        LinkedNode prev;
//        public LinkedNode(int data)
//        {
//            this.data=data;
//        }
//    }


}
