package linkedlist.problems;

import linkedlist.theory.ListNode;

public class Merge2SortedList {

    //https://leetcode.com/problems/merge-two-sorted-lists/


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {


        ListNode head = list1;
        ListNode temp = null;

        if(list1==null || list2==null)
        {
            return null;
        }
        while(list1.next!=null)
        {
            if(list1.val<list2.val || list1.val==list2.val )
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

    public ListNode getLinkedNode1()
    {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode four = new ListNode(4);

        one.next=two;
        two.next=four;

        return one;
    }

    public ListNode getLinkedNode2()
    {
        ListNode one = new ListNode(1);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);

        one.next=three;
        three.next=four;

        return one;
    }


    public static void main(String[] args) {


        Merge2SortedList m = new Merge2SortedList();
        ListNode result = m.mergeTwoLists(m.getLinkedNode1(), m.getLinkedNode2());

        while (result!=null)
        {
            System.out.println(result.val);
            result=result.next;
        }
    }

}
