import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
              queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
              queue.dequeue();
            } else if (operation == 3) { // print/peek
              System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}

class MyQueue<T> {

  private final Stack<T> _enqueue;
  private final Stack<T> _dequeue;

    public MyQueue(){
        _enqueue = new Stack<>();
        _dequeue = new Stack<>();
    }

    public void enqueue(T value){
        _enqueue.push(value);
    }
   
    public T dequeue(){
        balanceStack();
        return _dequeue.pop();
    }

    public T peek(){
        balanceStack();
        return _dequeue.peek();
    }

    private void balanceStack(){
        if(_dequeue.empty()){
            while(!_enqueue.empty()){
                _dequeue.push(_enqueue.pop());
            }
        }
    }

}


