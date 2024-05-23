package linkedlist.theory;

public class LinkedList {


    int data;
    LinkedList next;

    public LinkedList(int data)
    {
        this.data=data;
    }


    public static void main(String[] args)
    {

        LinkedList head = new LinkedList(3);

    }


}
//https://www.quora.com/What-are-the-advantages-and-disadvantages-of-using-a-linked-list-or-array-to-store-data-with-an-increasing-sequence-of-numbers-like-ID-numbers#:~:text=Arrays%20are%20ok%20(if%20properly,way%20how%20elements%20are%20added.
/*
What are the advantages and disadvantages of using an array and a linked list?
While preparing for interviews, one of the most important concepts and data structures to learn is the linked list. A solid understanding of Linked Lists can be a huge asset in a coding interview.

A Linked List is a data structure that is linear. Unlike arrays, the elements are not stored in sequential order. Pointers are used to connect the elements of the Linked List. Each node is made up of two parts:

Data: Information stored at a specific address.

Reference: Contains the address of the linked list's next node.

The Benefits of Linked Lists Over Arrays-

1) Dynamic Data Structure:

Because the linked list is a dynamic data structure that can shrink and grow at runtime by deallocating or allocating memory, there is no need for an initial size.

In contrast, in an array, an initial size must be declared, and the number of elements cannot exceed that size.

2) There is no memory waste:

There is no memory waste because the size of a linked list can grow or shrink at runtime. Only the necessary memory is allocated.

In arrays, we must first initialise it with a size that we may or may not fully utilise; thus, memory waste may occur.

3) Implementation:

A Linked List can be used to easily implement some very useful data structures such as queues and stacks.

4) Insertion and Deletion:

Insertion and deletion operations in a Linked List are simple because there is no need to shift every element after insertion or deletion. Only the address in the pointers needs to be changed.

We need to shift elements in an array. Assume we have a sorted array and need to insert some element into it in a sorted manner. Let arr[]= [1, 3, 5, 7,....], and we need to add 2. As a result, all elements following 1 must move one space to the right.

Let us also consider the disadvantages of Linked Lists.

disadvantages of Linked List over Array-

1) Memory Utilization:

The memory required by a linked list is greater than the memory required by an array because the linked list contains a pointer field in addition to the data field. Memory is also required by the pointer field to store the address of the next node.

2) Random Access:

To get to node an at index x in a linked list, we must first go through all the nodes before it. In the case of an array, however, we can use arr[x] to directly access an element at index x.

3) Reverse Traversal:

Reverse traversal is not possible in a singly linked list because each node stores only the address of the next node. Reverse traversal is possible in the case of a doubly-linked list, but it consumes more memory because we must allocate extra memory to store the previous pointer.

With the help of a for loop, we can perform a simple reverse traversal in arrays.
 */


