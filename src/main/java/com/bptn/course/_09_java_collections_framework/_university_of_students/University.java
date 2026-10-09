package com.bptn.course._09_java_collections_framework._university_of_students;

import java.util.*;
//import java.util.stream.Collectors;

class University {

    // property - get inspired by the UML diagram
    ArrayList <Student> students = new ArrayList<> ();
   

    public void addStudent(Student s) {
        // add a student to the "university" arraylist
        this.students.add(s);
        
    }
    
    private int getStudentIndex( double studentId){
        for(Student student: this.students) {
          if(studentId == student.getStudentId()) {
            int studentIndex = students.indexOf(student);
            return studentIndex;
          }
        }
        return -1;
      }

    public Student getStudent(long studentId) {
      // get the first student in the university that has the studentId. (ideally, this would be unique, so you can stop searching after finding the fist match)
    	return this.students.get(getStudentIndex(studentId));
    }

    public List<Student> searchStudent(String userNamePrefix) {
       // return all students that have usernames beginning with the prefix 
    	List<Student> filteredStudents = new ArrayList<>();
        for (Student student : this.students) {
          if (student.getUserName().startsWith(userNamePrefix)) {
          filteredStudents.add(student);
          }
        }
        return filteredStudents;
    }

    public boolean deleteStudent(long studentId) {
       // return if a successful deletion happened
    	int studentIndex = getStudentIndex(studentId);
        if(studentIndex>=0){
          this.students.remove(studentIndex);
          return true;
        }
        return false;
      }
    }
