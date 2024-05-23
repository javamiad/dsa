package linkedlist.problems;

import linkedlist.theory.LinkedNode;
import linkedlist.theory.PracticeBasics1;

public class ReverseLinkedList {

    LinkedNode prev = null;
    public LinkedNode populateLinkedList()
    {
        LinkedNode head = new LinkedNode(4);
        LinkedNode five = new LinkedNode(5);
        LinkedNode eight = new LinkedNode(8);
        LinkedNode two = new LinkedNode(2);

        head.next = five;
        five.next = eight;
        two.next = two;


        return head;
    }

    public LinkedNode reverseLL(LinkedNode list)
    {
        while(list.next!=null)
        {
            LinkedNode nextNode = list.next;
            list.next=prev;
            prev = list;
            list = nextNode;
            //System.out.println(list.data);
        }
        return list;
    }


    public static void main(String[] args) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        LinkedNode head = reverseLinkedList.populateLinkedList();


        while(head.next!=null)
        {
            System.out.println("inside populate LL: "+head.data);
            head=head.next;
        }

        LinkedNode reversed = reverseLinkedList.reverseLL(head);

        while(reversed.next!=null)
        {

            reversed = reversed.next;
            System.out.println("reverse: "+reversed);
        }
    }

}
