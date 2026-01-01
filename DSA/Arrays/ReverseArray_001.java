import java.util.Scanner;

public class ReverseArray_001{
    public static void main(String args[]){
        Scanner sc = new Scanner( System.in );

        System.out.println( "Please enter the Array Size : " );
        int arr[] = new int[ sc.nextInt() ];

        for( int i = 0; i < arr.length;i++ ){
            arr[i] = sc.nextInt();
        }

        new ReverseArray_001().reverseArray(arr);

        for( int i : arr ){

            System.out.print( i + " " );
        }


        sc.close();
    }

    public void reverseArray(int arr[]) {

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

    }
}


