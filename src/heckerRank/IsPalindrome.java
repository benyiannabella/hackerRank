package heckerRank;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class IsPalindrome {
    private Queue<Character> myQueue = new LinkedList<>();
    private Stack<Character> myStack = new Stack<>();


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        IsPalindrome p = new IsPalindrome();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }

    private char dequeueCharacter() {
        return myQueue.remove();
    }

    private void enqueueCharacter(char c) {
        myQueue.add(c);
    }

    private char popCharacter() {
        return myStack.pop();
    }

    private void pushCharacter(char c) {
        myStack.push(c);
    }


}
