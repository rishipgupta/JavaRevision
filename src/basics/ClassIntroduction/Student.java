package basics.ClassIntroduction;

public class Student {
    int id; //data member or instance variable
    String name;//data member or instance variable

    //The entry point of a standalone Java application is the main method or function.
    public static void main(String[] args) {
        Student s1 = new Student();//Object Creation from Class Student
        //Now our s1 can access id and name from Student class;
    }
}
