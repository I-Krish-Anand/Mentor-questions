public class Question4
{
    public static void main(String[] args) {

        int[]arr={7,2,5,3,6,3};
        int min=arr[0],max=arr[0];

        for(int i:arr)
        {
            if(i<min)
            {
                min=i;
                max=i;
            }
            else if(i>max)
                max=i;
        }
        System.out.println(max-min);


    }
}
