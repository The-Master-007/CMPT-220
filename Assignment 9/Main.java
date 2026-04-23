/*
Remember that stacks/queues/linkedlists all work super similarly to arraylists, so i bet you $10 you could reference earlier HW if you get stuck....

1. Take the stack I created and find the maximum and minimum value
2. Find out how many elements were in the stack

3. Find the middle value of the linkedlist I created

4. Implement a real life example of any of the structures and do at least 3 operations to it
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stax = new Stack<>();
        
        stax.push(70);
        stax.push(34);
        stax.push(807);
        stax.push(61);
        stax.push(28);
        stax.push(563);
        stax.push(492);
        stax.push(386);
        
        // Set max,min to the first element to avoid issues with negative numbers
        int max = stax.peek();
        int min = stax.peek();
        // Create temp stack to move values after checking them for max/min
        Stack<Integer> tempStack = new Stack<>();
        while(!stax.isEmpty())
        {
            int curr = stax.pop();
            if (curr > max)
            {
                max = curr;
            }
            if (curr < min)
            {
                min = curr;
            }
            tempStack.push(curr);
        }

        System.out.println("The max value in the stack is: " + max);
        System.out.println("The min value in the stack is: " + min);
        // You can't use the original stack because we popped all values out
        System.out.println("There are " + tempStack.size() + " elements in the stack.");
        
        
        
        LinkedList<Integer> linky = new LinkedList<>();

        linky.add(10);
        linky.add(20);
        linky.add(30);
        linky.add(40);
        linky.add(50);

        // Integer division will round down, but this gets the middle index without a temp stack
        int middleIndex = linky.size() / 2;
        // Easier to get n value from a linked list rather than stack/queue
        int middleValue = linky.get(middleIndex);
        System.out.println("The middle value in the linked list is: " + middleValue);

        Queue<String> line = new LinkedList<>();
        System.out.println("A line forms outside of a clothing store with the following people: Bob, Alice, Charlie, and Max.");
        line.add("Bob");
        line.add("Alice");
        line.add("Charlie");
        line.add("Max");
        System.out.println("The first person in line is: " + line.peek());
        line.remove();
        System.out.println("After the first person went into the store, the new first person in line is: " + line.peek());
        line.remove();
        System.out.println("After the second person went into the store, the new first person in line is " + line.peek());
        System.out.println("There are " + line.size() + " people left in line.");

        /* This was a refresher on using stacks/queues/linkedlists. I don't remember stacks as much because
        * in my class we learned them and then learned the 80 different ways you can have a linked list; double, circularly, etc
        * I remember queues and linked lists better, but this was nice overall.
         */
    }
}
