package Collections;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayDequePractice {
    static Deque<Integer> deque = new ArrayDeque<>();

    static {
        deque.add(600);
        deque.add(542);
        deque.add(34);
    }

    public static void main(String[] args) throws InterruptedException {


        //insert at the end of the tail by default
        // add() adds the element to the end of the deque

        printActionWithDeque("Initial state  ");
        Thread.sleep(500);
        deque.add(12);
        printActionWithDeque("After add(12) ");
        Thread.sleep(500);
        // offer() also adds an element but returns a boolean indicating success
        deque.offer(13);
        printActionWithDeque("After offer(13) ");
        Thread.sleep(500);
        // push() adds the element to the front of the deque (like a stack)
        deque.push(90);
        printActionWithDeque("After push(90) ");
        Thread.sleep(500);
        // offerFirst() inserts an element at the beginning and returns a boolean
        printActionWithDeque("After offerFirst(14)->" + deque.offerFirst(14));
        Thread.sleep(500);
        // offerLast() inserts an element at the end and returns a boolean
        printActionWithDeque("After offerLast(15) -> " + deque.offerLast(15));
        Thread.sleep(500);
        // addFirst() inserts an element at the beginning without returning anything
        deque.addFirst(16);
        printActionWithDeque("After addFirst(16) ");
        Thread.sleep(500);




        // remove() removes a specific element
        deque.remove(14);
        printActionWithDeque("After remove(14) ");
        Thread.sleep(500);
        // removeFirst() removes the first element (from the front)
        deque.removeFirst();
        printActionWithDeque("After removeFirst() ");
        Thread.sleep(500);
        // removeLast() removes the last element (from the end)
        deque.removeLast();
        printActionWithDeque("After removeLast() ");

        deque.pop();
        printActionWithDeque("After pop() ");


        //retreiving
        printActionWithDeque("After peekFirst() "+deque.peekFirst());
        printActionWithDeque("After peekLast() "+deque.peekLast());
        printActionWithDeque("After getFirst() "+deque.getFirst());
        printActionWithDeque("After getLast() "+deque.getLast());

        deque = deque.stream().sorted().collect(Collectors.toCollection(ArrayDeque::new));


        printActionWithDeque("After sort() ");
    }

    private static void printActionWithDeque(String action) {
        Runnable printRunnable = () -> {
            // Format action to always take 30 characters
            String formattedAction = String.format("%-30s", action);
            System.out.println(formattedAction + " : " + deque);
        };
        // Execute the Runnable to print the action and deque
        printRunnable.run();
    }
}
