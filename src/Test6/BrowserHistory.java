package Test6;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {

    // Declare a list to store the browsing history
    List<String> list;

    // Declare variables to track the total number of pages visited and the current page index
    int total = 0;
    int curr = 0;

    public BrowserHistory(String homepage) {
        // Initialize the list and add the homepage as the first page
        list = new ArrayList<String>();
        list.add(homepage);

        // Increment the total number of pages visited and set the current page index to 1
        total++;
        curr++;
    }

    public void visit(String url) {
        // If the current page index is within the bounds of the list, update the current page
        // Otherwise, add the new page to the end of the list
        if (list.size() > curr) {
            list.set(curr, url);
        } else {
            list.add(url);
        }

        // Increment the current page index and update the total number of pages visited
        curr++;
        total = curr;
    }

    public String back(int steps) {
        // Decrement the current page index by the number of steps specified, but not below 1
        curr = Math.max(1, curr - steps);

        // Return the URL of the current page
        return list.get(curr - 1);
    }

    public String forward(int steps) {
        // Increment the current page index by the number of steps specified, but not above the total number of pages visited
        curr = Math.min(total, curr + steps);

        // Return the URL of the current page
        return list.get(curr - 1);
    }
    public class Main {
        public static void main(String[] args) {
            // Create a new browser history with the homepage "www.google.com"
            BrowserHistory history = new BrowserHistory("www.google.com");

            // Visit some other pages
            history.visit("www.github.com");
            history.visit("www.reddit.com");
            history.visit("www.stackoverflow.com");

            // Test the back and forward methods
            System.out.println(history.back(2)); // should print "www.github.com"
            System.out.println(history.forward(1)); // should print "www.stackoverflow.com"
            System.out.println(history.back(1)); // should print "www.reddit.com"
        }
    }
}