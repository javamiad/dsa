package linkedlist.problems;

import linkedlist.theory.LinkedNode;

public class InsertionSort {

    //https://leetcode.com/problems/insertion-sort-list/description/

//solution to be revised:  https://leetcode.com/problems/insertion-sort-list/solutions/46420/an-easy-and-clear-way-to-sort-o-1-space/
    public LinkedNode fillList()
    {
        LinkedNode head = new LinkedNode(8);
        LinkedNode two = new LinkedNode(2);
        LinkedNode nine = new LinkedNode(9);
        LinkedNode seven = new LinkedNode(7);
        LinkedNode five = new LinkedNode(5);

        head.next=nine;
        nine.next=seven;
        seven.next=two;
        two.next=five;

        return head;
    }

    public void print(LinkedNode head)
    {
        while(head!=null)
        {
            System.out.print("("+head.data+")-->");
            head=head.next;
        }
    }


    public LinkedNode sortedList(LinkedNode head)
    {
        int min = head.data;
        LinkedNode sorted = null;
        LinkedNode minNode = null;
        LinkedNode prev =null;
        while(head!=null)
        {
            while (head!=null)
            {
                if(head.data <= min)
                {
                    min = head.data;
                }
            }

            minNode = new LinkedNode(min);
            head=head.next.next;

            if(sorted==null)
            {
                sorted = minNode;
            }
            else
            {
                sorted.next = minNode;
            }
        }
        return head;
    }




    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();
        LinkedNode test = sort.fillList();

        LinkedNode sortedList = sort.sortedList(test);
        sort.print(sortedList);

    }



}
