package linkedlist.theory.singlyLL;

import linkedlist.theory.ListNode;

public class Operations {

    public ListNode prepend(ListNode one)
    {
        ListNode zero = new ListNode(0);
        zero.next=one;
        return zero;
    }

    public ListNode insertLinkedNodeInList(int target, ListNode ll, int num)
    {
        int iter = 0;
        ListNode newNode = new ListNode(num);
        while(ll.next!=null)
        {
            iter++;

            if(iter==target)
            {
              //  System.out.println(ll.data);
                //LinkedNode temp = ll.next;
                newNode.next=ll.next;
                ll.next=newNode;
                return ll;
             //   ll=ll.next;
            }
        }

        return ll;
    }



    public ListNode removeNode(int value, ListNode head)
    {
        while(head.next!=null)
        {
            if(head.next.val == value)
            {
                head.next = head.next.next;
                return head;
            }
            head=head.next;
        }
        return head;
    }


    public static void main(String[] args) {
        Operations ops = new Operations();
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);

        one.next=two;
        two.next=three;
        three.next=four;

//        while(one.next!=null)
//        {
//            System.out.println(one.data);
//            one = one.next;
//            System.out.println(one.data);
//        }

       // LinkedNode pre = ops.prepend(one);

//        while(pre.next!=null)
//        {
//            System.out.println(pre.data);
//            pre = pre.next;
//        }


        ops.insertLinkedNodeInList(2,one, 8);

        ops.removeNode(3,one);
        System.out.println(one.val);

        while(one.next!=null)
        {
            one = one.next;
            System.out.println(one.val);
        }




    }


}
