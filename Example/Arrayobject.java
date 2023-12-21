/*here we create array of object.
 * as of now we learn about arrays concept of integer type here this is array of object , 
 * which means we are creating array of data having different, data types like int, string....
 * while creating object the data type is name itself "NAME OF CLASS variable name[] = new NAME OF CLASS[size]";
 * we first creates various objects later on we create array for storing them.
 */

 /*here we also used enhanced for loop for better execution withou geting any exceptions also no need of size and no increment also
*/


class Student{
    int rollno;
    String name;
    int marks;
}

public class Arrayobject {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "krish";
        s1.marks =80;
        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "kisa";
        s2.marks =60;
        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "rish";
        s3.marks =90;

        Student students[] = new Student[3];// here students is reference variable or the object variable of array type.
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        /*for(int i=0;i<students.length;i++)
        {
            System.out.println(students[i].rollno  +  " : "  +  students[i].name  +  " : "  +  students[i].marks);
        }*/
        // using enhanced for loopor for each loop
        //here  for(data_type variable_name : objects_arrayname)
        for(Student stud : students)
        {
            System.out.println(stud.rollno  +  " : "  +  stud.name  +  " : "  +  stud.marks);
        }
    }
}
