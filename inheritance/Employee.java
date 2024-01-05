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
    System.out.println("person name :"+name);
    System.out.println("person age :"+age);
    System.out.println("person dateOfBirth :"+dateOfBirth);
    System.out.println("person adress :"+address);

   }
}

public class Employee extends Person{
   int salary;
   int empId;
   String department;

   Employee(String name,int age,String dateOfBirth,String address,int salary,int empId,String department){
      super(name, age, dateOfBirth, address);
      this.salary = 20000;
      this.empId = 101;
      this.department = "IT";
   }

   void displayEmp(){
      // System.out.println("Employee name :"+name);
      // System.out.println("Employee age :"+age);
      // System.out.println("Employee dateOfBirth :"+dateOfBirth);
      // System.out.println("Employee adress :"+address);
      System.out.println("Employee salary :"+salary);     
       System.out.println("Employee Id :"+empId);
      System.out.println("Employee Department :"+department);
   }

   public static void main(String[] args) {
      Employee obj = new Employee("krushna",22,"12/09/2002","Nagar",1000000,101,"IT");
      obj.displayPerson();
      obj.displayEmp();
   }
}


//extend the person class and create the student class like name name dob age address roll no course and marks
//display method