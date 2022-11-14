public class Student { //here is the class name
    private String name; //instance variable of type String
    private int rollNo; //instance variable of type int

    Student(String s, int r) //this is the constructor with parameters of type String and int
    {
        name = s; //here, variable "name" is set equal to the String argument the method is passed. in this case: Rambo
        rollNo = r; //here, variable "rollNo" is set equal to the int argument the method is passed. in this case: 21
    }

    void methodForDisplay() //this is an instance method for class Student
    {
        System.out.println(name+"'s Roll No: "+rollNo);
    }

    public static void main(String[] args) {
        Student obj1=new Student("Rambo",21); //this statement is a Student object being created
        obj1.methodForDisplay();
    }
}

/*
Static methods can be called simply by using the name and adding "();"(and any arguments in the parentheses if the method has parameters).
Public methods however, must use an object to invoke them, so you must create an object of the class that said public method resides in,
then use it to invoke the method. IE: classObj.method();
 */