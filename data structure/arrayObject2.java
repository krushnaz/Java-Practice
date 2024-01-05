class student{
    String name;
    student(String name){
           this.name = name;
    }
}
public class arrayObject2 {
    public static void main(String[] args) {
       student[] myStudents = new student[]{new student("krushna"),new student("ram")};
       for(int i=0;i<myStudents.length;i++){
        System.out.println(myStudents[i].name);
       }
    

    }
}
