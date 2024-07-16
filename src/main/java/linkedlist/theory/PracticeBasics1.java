package linkedlist.theory;

public class PracticeBasics1 {

    static int length=1;
   // LinkedNode linkedNode = new LinkedNode();


    public static ListNode populateLinkedList()
    {
        ListNode head = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode eight = new ListNode(8);
        ListNode two = new ListNode(2);

        head.next = five;
        five.next = two;
        two.next = eight;

        return head;
    }

    public static ListNode populateWithPrevLinkedList()
    {
        ListNode head = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode eight = new ListNode(8);
        ListNode two = new ListNode(2);

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

    public static void printAllvalues(ListNode head)
    {
        System.out.println("+------------------------------+");
        while(head.next!=null)
        {
            head = head.next;
            System.out.println("|  next node value is : "+head.val+"      |");
            length++;
        }
        System.out.println("+------------------------------+");
        while(head.prev!=null)
        {
            head=head.prev;
            System.out.println("|  prev node value is : "+head.val+"      |");
        }
        System.out.println("+------------------------------+");
    }



    public static void main(String[] args)
    {

        ListNode list = populateWithPrevLinkedList();
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
