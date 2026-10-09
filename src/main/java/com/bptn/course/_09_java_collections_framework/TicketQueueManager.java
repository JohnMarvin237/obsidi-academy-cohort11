package com.bptn.course._09_java_collections_framework;

import java.util.*;

public class TicketQueueManager {
	public static void main(String[] args) {
        // 1. Create a LinkedList to act as a Queue
        LinkedList<Integer> supportedQueue = new LinkedList<>();

        // 2. New Tickets Arrive (Add to tail using Queue method)
        supportedQueue.offer(101);
        supportedQueue.offer(102);
        supportedQueue.offer(103);

        // 3. Agent Checks Queue (Peek)
        System.out.println("Next ticket to be handled (peek): " + supportedQueue.peek());

        // 4. Process Ticket (Poll) - removes from head
        System.out.println("Processing ticket: " + supportedQueue.poll());
        
        // 5. Urgent New Ticket (Offer First)
        supportedQueue.addFirst(99);

        // 6. Process Next
        System.out.println("Processing ticket: " + supportedQueue.poll());
        
        // Final Check
        System.out.println("Tickets remaining in queue: " + supportedQueue);

    }
}
