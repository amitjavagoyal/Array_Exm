import java.util.Arrays;
import java.util.Scanner;

public class Array_Exp {

    public void Test_array(){
        int a[] = {33,3,4,8};  //declaration, instantiation and initialization
        for (int i=0; i<a.length; i++){
            System.out.println(a[i]); //printing array
        }
    }

    public void Test_array2(){
        int b[] = {35,40,53,5};
        //printing array using for-each loop
        for(int i:b){
            System.out.println(i);
        }
    }

    public void Array_min_num(){
        int a[] = {53,65,25,30};
        int b[] = {2,3,6,57,65,8};
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println("Smallest in a[]: "+ a[0]);
        System.out.println("Smallest in b[]: "+ b[0]);
    }


    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: for Test_array, 2:for Test_array2, 3: For Array_min_num");
           Array_Exp obj= new Array_Exp();
           int choice= scanner.nextInt();
           if (choice == 1){
               obj.Test_array();
           }
           if (choice==2){
               obj.Test_array2();
           }
           if (choice == 3){
               obj.Array_min_num();
           }

    }


}
