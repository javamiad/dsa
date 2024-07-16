package linkedlist.problems;


import linkedlist.theory.LinkedList;
import linkedlist.theory.ListNode;

public class InsertionSort
{


    public ListNode populateLL()
    {
        ListNode head = new ListNode(4);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode one = new ListNode(1);
        ListNode five = new ListNode(5);


        head.next=two;
        two.next=one;
        one.next=three;
     //   four.next=five;

        return  head;
    }

//4,2,1,3

    public ListNode sort(ListNode head)
    {
        ListNode sort = new ListNode(0);

        while(head!=null) {
            ListNode temp = head;

            head = head.next;
            //  System.out.println(temp.val);

            if (head.val < temp.val) {
                sort.next = temp;
                sort = sort.next;
                sort.next = head;
            }
            head = head.next;
        }


return sort.next;
    }



    public static void main(String[] args) {

        InsertionSort r = new InsertionSort();
        ListNode head = r.sort(r.populateLL());

        while (head!=null)
        {
            System.out.println(head.val);
            head=head.next;
        }


    }


}
