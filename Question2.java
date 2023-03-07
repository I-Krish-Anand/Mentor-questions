//Question 2
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

//         [0,1,0,2,1,0,1,3,2,1,2,1]
          //        int  n=sc.nextInt();
//        System.out.println("Enter Input Array");

        Scanner sc=new Scanner(System.in);
        int[]arr=new int[]{ 0,1,0,2,1,0,1,3,2,1,2,1};

        int max=arr[0];
        int waterSum=0,waterLevel=arr[0],i,j;

        for(int k:arr)
            max = Math.max(k, max);

        for( i=0;arr[i]<max;i++)
        {
            if(arr[i]>waterLevel)
                waterLevel=arr[i];
            waterSum+=waterLevel-arr[i];
        }

        waterLevel=arr[arr.length-1];
        for( j=arr.length-1;j>i;j--)
        {
            if(arr[j]>waterLevel)
                waterLevel=arr[j];
            waterSum+=waterLevel-arr[j];
        }
        System.out.println(waterSum);

    }
}