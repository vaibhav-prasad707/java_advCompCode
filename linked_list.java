import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data1,Node next1){
        this.data = data1;
        this.next = null;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
    }
};


public class linked_list {
    public static void main(String[] args){
        int[] arr = {2,5,6,8};
        Node y = new Node(arr[3]);
        System.out.println(y);

    }
}
