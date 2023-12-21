/*here we are discussing about string concept , the string is not a datatype its just a class which is defined previously.
 *and here when we create an object for string datatype it creates stack in jvm, and its value is the address present in the heap.
 *actually there is string constant pool present inside the heap, it stores values in it by checking whether it is previously there or not.
 *here s1 and s2 are the local variables that are placed in the stack String and having value as same reference address of heap.
 *here String class have number of methods as well.
*/

/*Mutable string means changable.
 * Immutable string means which cannot changable.
 * by default strings are immutable which cannot be changable, once created we cannot change them.
 * so they are two classes called String Buffer and String Builder which are mutable classes which can be changable.
 * capacity is a method in StringBuffer.not only that they are many methods provides by stringbuffer class.
 * string buffer is thread safe where string builder is not.
 */

public class Stringdemo{
    public static void main(String args[]){
        //String str = new String("durga");// here String is a predefined class type not a data type. as it is a class we create object str
        /*String str = "Durga Devi"; // or we can directly assign the value as normally we assigned to datatypes.
        System.out.println("hello " + str);
        String s1 = "Durga";
        String s2 = "Durga";// here s1,s2 are local variables 
        System.out.println(str.charAt(3));
        System.out.println(str.length());
        System.out.println(s1==s2);*/
        StringBuffer sb = new StringBuffer("Durga");
        //sb.charAt(3);
        str.append(" Devi");
        //sb.deleteCharAt(4);
        System.out.println(sb);
    }
}