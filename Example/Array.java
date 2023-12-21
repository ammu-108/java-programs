/*array is used to store multiple values at a time.
 * it declared as datatype name[] = {.,.,.,.,.,.};(when size and values known)
 * the size of arrary is fixed once declared we cant change them after initialization.
 * when we dont know the values then datatype name[] = new datatype[size];
 * array index number starts with 0.
 * two dimensional array having two array boxes one indicates rows and other one declare no of values in that particular row.
 * syntax is data type name[][] = new datatype[no of arrays][no of values inside array];
 * two seperate loops are needed inorder to get values from 2d array.
 * Jagged array means we are declaring no of rows but not columns then we called as jagged arrays.
 * 3d arrays are also possible so that we are going to increase another loop for it.
 */


// static array, dynamic array, multi dimensional array,jagged arrays
public class Array {
    public static void main(String args[]){
        /*int num[] = { 3, 2, 7, 9};// creating an array and declare its values.
        num[2] = 10;// updating externally
        System.out.println(num[1]);// printing the values of array of respective index.
        System.out.println(num[2]);*/

        // Dynamic array
        /*int num[] = new int[3];
        num[0]=4;
        num[1]=9;
        num[2]=1;
        for(int i=0;i<=2;i++){
            System.out.println(num[i]);
        }*/

        //2d array printing known values
        /*int nums[][] = new int[3][5];
        nums[0][1]=4;
        nums[1][2]=9;
        nums[2][3]=1;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        } */


        // 2d array printing random values generated using math function
        /*int nums[][] = new int[3][5];
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                nums[i][j]= (int)(Math.random() *10);// Math.random function gives some random values to our program.which is of type double so 
            }                                          // we type cast them into int after multiplying with 10.
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }*/

        //Jagged array using enhanced for loop to print values
        /*int nums[][] = new int[3][];
        nums[0] = new int[2];
        nums[1] = new int[3];
        nums[2] = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                nums[i][j] = (int)(Math.random() *10);
            }
        }
        for(int n[] : nums)// here n[] represents main array of array name nums
        {
            for(int m : n)// here m represents array from n array
            {
                System.out.print(m +" ");// we fetching the values of inner loop(m) // and println means new line, print means side by side.
            }
            System.out.println();
        }*/

        // 3D Array 
        int nums[][][] = new int[3][2][5];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                for(int k=0;k<5;k++)
                {
                    System.out.print(nums[i][j][k] + " ");    
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();

    }    
}
