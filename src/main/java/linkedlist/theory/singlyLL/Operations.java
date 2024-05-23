package linkedlist.theory.singlyLL;

import linkedlist.theory.LinkedNode;

public class Operations {

    public LinkedNode prepend(LinkedNode one)
    {
        LinkedNode zero = new LinkedNode(0);
        zero.next=one;
        return zero;
    }

    public LinkedNode insertLinkedNodeInList(int target, LinkedNode ll, int num)
    {
        int iter = 0;
        LinkedNode newNode = new LinkedNode(num);
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



    public LinkedNode removeNode(int value, LinkedNode head)
    {
        while(head.next!=null)
        {
            if(head.next.data == value)
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
        LinkedNode one = new LinkedNode(1);
        LinkedNode two = new LinkedNode(2);
        LinkedNode three = new LinkedNode(3);
        LinkedNode four = new LinkedNode(4);

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
        System.out.println(one.data);

        while(one.next!=null)
        {
            one = one.next;
            System.out.println(one.data);
        }




    }


}
