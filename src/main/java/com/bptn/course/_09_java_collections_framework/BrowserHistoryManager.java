package com.bptn.course._09_java_collections_framework;

import java.util.LinkedList;

public class BrowserHistoryManager {
    public static void main(String[] args) {
        // 1. Create a LinkedList for history
    	LinkedList<String> history = new LinkedList<>();

        // 2. Visit Pages (Add to end/tail)
    	history.addLast("https://www.google.com/url?sa=E&source=gmail&q=homepage.com");
    	history.addLast("products.com");
    	history.addLast("aboutus.com");
    	history.addLast("https://www.obsidi.com");
    	history.addLast("https://www.youtube.com");
    	history.addLast("https://www.claude.ai");
    	history.addLast("https://www.facebook.com");
    	history.addLast("https://www.bfutr.com");

        // 3. Go Back (Remove Last/Tail)

        // 4. Visit a New Page

        // 5. View Current History

    }
}
