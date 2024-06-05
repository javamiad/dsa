package linkedlist.problems;

import linkedlist.theory.LinkedNode;
import linkedlist.theory.PracticeBasics1;

public class ReverseLinkedList {

    LinkedNode prev = null;
    public LinkedNode populateLinkedList()
    {
        LinkedNode head = new LinkedNode(1);
        LinkedNode two = new LinkedNode(2);
        LinkedNode three = new LinkedNode(3);
        LinkedNode four = new LinkedNode(4);

        head.next = two;
        two.next = three;
        three.next = four;


        return head;
    }

//    public LinkedNode reverseLL(LinkedNode list)
//    {
//        while(list.next!=null)
//        {
//            LinkedNode nextNode = list.next;
//            list.next=prev;
//            prev = list;
//            list = nextNode;
//            //System.out.println(list.data);
//        }
//        return list;
//    }


    public LinkedNode reverseLL2(LinkedNode head)
    {
        LinkedNode prev = null;

        while(head.next!=null)
        {

            LinkedNode nextNode = head.next;
            head.next=prev;
            //prev = nextNode;
            prev = head;
            head = nextNode;

        }
        /*
        The question as to why is the return value prev and not head?
        Head is on the original LL with head.next pointing to the right.  We condition the prev to make prev.next to
        go left.  All the reverse LL logic is in the prev node.  The head Node is only the old LL.  Therefore, we need to return
        prev.  Now, if we make it return head, head.next = null;  That means we will miss out on the last node in the LL.
         */

        /*
        The below 2 lines alone prove the head.next is being defined to go back.  then defining prev = head is moving the
        prev pointer from n-1 to n and n here is head.

        Also, another way to look at it is prev is a new LL like how head was the old LL and we define the backwards
        movement on the prev Node because the head node is rightward movement.
         */

        head.next=prev;
        prev=head;

        head=prev;  //--> If I want to use head still
        prev=null;  // To save space
        return head;
    }



    public static void main(String[] args) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        LinkedNode newNode = reverseLinkedList.populateLinkedList();

        LinkedNode reversed = reverseLinkedList.reverseLL2(newNode);

        while(reversed.next!=null)
        {
            System.out.println(reversed.data);
            reversed=reversed.next;
        }

        System.out.println(reversed.data);


    }

}
