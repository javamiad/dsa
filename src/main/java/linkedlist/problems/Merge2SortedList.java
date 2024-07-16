package linkedlist.problems;

import linkedlist.theory.LinkedNode;

public class Merge2SortedList {

    //https://leetcode.com/problems/merge-two-sorted-lists/


    public LinkedNode mergeTwoLists(LinkedNode list1, LinkedNode list2) {


        LinkedNode head = list1;
        LinkedNode temp = null;

        if(list1==null || list2==null)
        {
            return null;
        }
        while(list1.next!=null)
        {
            if(list1.data<list2.data || list1.data==list2.data )
            {
                // temp = list2.next;
                head.next=list2;
                // list2.next = temp;
            }
            else
            {
                //temp = list1.next;
                head=list2;
                head.next=list1;
            }

            list1 = list1.next;
            list2 = list2.next;
            //head=head.next;

        }

        return head;

    }

    public LinkedNode getLinkedNode1()
    {
        LinkedNode one = new LinkedNode(1);
        LinkedNode two = new LinkedNode(2);
        LinkedNode four = new LinkedNode(4);

        one.next=two;
        two.next=four;

        return one;
    }

    public LinkedNode getLinkedNode2()
    {
        LinkedNode one = new LinkedNode(1);
        LinkedNode three = new LinkedNode(3);
        LinkedNode four = new LinkedNode(4);

        one.next=three;
        three.next=four;

        return one;
    }


    public static void main(String[] args) {


        Merge2SortedList m = new Merge2SortedList();
        LinkedNode result = m.mergeTwoLists(m.getLinkedNode1(), m.getLinkedNode2());

        while (result!=null)
        {
            System.out.println(result.data);
            result=result.next;
        }
    }

}
