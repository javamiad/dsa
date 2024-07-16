package linkedlist.problems;

import linkedlist.theory.LinkedNode;

public class RemoveDuplicates {


    public LinkedNode deleteDuplicates(LinkedNode head) {
        LinkedNode temp = head;

        while(head!=null && head.next!=null )
        {

            if (head.data == head.next.data)
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
        LinkedNode node = removeDuplicates.deleteDuplicates( r.populateLinkedListWithDuplicates());

        System.out.println(node.data);
        while(node.next!=null)
        {

            node=node.next;
            System.out.println(node.data);

        }



    }
}
