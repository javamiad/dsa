package linkedlist.problems;

import linkedlist.theory.ListNode;

public class RemoveDuplicates {


    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;

        while(head!=null && head.next!=null )
        {

            if (head.val == head.next.val)
            {

                head.next = head.next.next;

            }
            else
            {
                head = head.next;


            }

        }

        return temp;
    }


    public static void main(String[] args) {

        ReverseLinkedList r = new ReverseLinkedList();

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        ListNode node = removeDuplicates.deleteDuplicates(r.populateLinkedList() );

        System.out.println(node.val);
        while(node.next!=null)
        {

            node=node.next;
            System.out.println(node.val);

        }



    }
}
