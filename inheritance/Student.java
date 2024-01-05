// write a program to create class person and it has data mem like name age date of birth and  address 1 display method 
//  extend this class with emplpyee class and data mem like name age date of birth salary emp id and dept 

 class Person {
   String name;
   int age;
   String dateOfBirth; 
   String address;

   Person(String name,int age,String dateOfBirth,String address){
    this.name = name;
    this.age = age;
    this.dateOfBirth = dateOfBirth;
    this.address = address;
   }

   public void displayPerson(){
    System.out.println("Student name :"+name);
    System.out.println("Student age :"+age);
    System.out.println("Student dateOfBirth :"+dateOfBirth);
    System.out.println("St adress :"+address);

   }
}

public class Student extends Person{
    int rollNo;
    String course;
    int marks;

    Student( int rollNo,String course,int marks){
        super(course, marks, course, course);
        this.rollNo = rollNo;
        this.course = course;
        this.marks = marks;
    }
   void displayStudent(){
    System.out.println("student rollNo :"+rollNo);
    System.out.println("student course :"+course);
    System.out.println("student marks :"+marks);
   }
}

//extend the person class and create the student class like name name dob age address roll no course and marks
//display method