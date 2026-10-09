package com.bptn.course._09_java_collections_framework._university_of_students;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Start by looking in the University and Student classes. Implement the methods. this is done!

        // Create a bunch of student objects 
            // (Make sure one student has the following studentId: 123)
            // (Make sure one other student has the following username: testUsername1)
            
        Student student1 = new Student(
            123L,
            "asmith",
            "Pass@1234",
            "Alice",
            "Smith",
            "alice.smith@example.com",
            "123-456-7890",
            "123 Main St, Springfield",
            "Female",
            new Date(103, 4, 15), 
            new Date(124, 8, 1), 
            1001L,
            "Computer Science"
        );

        // Object 2: Bob Johnson
        Student student2 = new Student(
            102L,
            "testUsername1",
            "Secure#5678",
            "Bob",
            "Johnson",
            "bob.johnson@example.com",
            "987-654-3210",
            "456 Oak Ave, Metropolis",
            "Male",
            new Date(102, 11, 20), 
            new Date(124, 8, 1),  
            1002L,
            "Information Technology"
        );

        // Object 3: Charlie Davis
        Student student3 = new Student(
            103L,
            "cdavis",
            "Char!ie2025",
            "Charlie",
            "Davis",
            "charlie.davis@example.com",
            "555-019-2831",
            "789 Pine Rd, Austin, TX",
            "Male",
            new Date(104, 2, 10), 
            new Date(124, 8, 1), 
            1003L,
            "Mechanical Engineering"
        );

        // Object 4: Diana Prince
        Student student4 = new Student(
            104L,
            "dprince",
            "Wonder#4321",
            "Diana",
            "Prince",
            "diana.prince@example.com",
            "555-014-9823",
            "321 Maple Dr, Seattle, WA",
            "Female",
            new Date(103, 7, 22), 
            new Date(124, 8, 1),  
            1004L,
            "Electrical Engineering"
        );

        
        Student student5 = new Student(
            105L,
            "ehunt",
            "Mission!9999",
            "Ethan",
            "Hunt",
            "ethan.hunt@example.com",
            "555-017-3456",
            "654 Cedar St, Miami, FL",
            "Male",
            new Date(102, 10, 5), 
            new Date(124, 8, 1), 
            1005L,
            "Cybersecurity"
        );
        // Create instance of university called "university" and populate it with the students.

        University university = new University();
        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);
        university.addStudent(student4);
        university.addStudent(student5);

        System.out.println("\nUniversity ------ \n" + university.students);
        System.out.println("\nGetting student------\n" + university.getStudent(123));
        System.out.println("\nDeleting student------\n" + university.deleteStudent(123));
        System.out.println("\nSeaching student------\n" + university.searchStudent("testUserna"));

        System.out.println("\nUniversity ------ \n" + university.students);

    }
}
