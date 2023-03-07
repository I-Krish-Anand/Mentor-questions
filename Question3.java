import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int n=num;
        int res=0;

//        String number=""+n;
//        for(int i=number.length()-1;i>=0;i--){
//
//            if(number.charAt(i)=='1'|| number.charAt(i)=='1'|| number.charAt(i)=='0')
//                res+=number.charAt(i);
//            else if(number.charAt(i)=='6')
//                res+="9";
//            else if(number.charAt(i)=='9')
//                res+="6";
//            else{
//                System.out.println("Invalid");
//                return;
//            }
//
//        }

        while (n>0){

            res*=10;
            int temp=n%10;
            if(temp==1||temp==8||temp==0)
                res+=temp;
            else if(temp==6)
                res+=9;
            else if(temp==9)
                res+=6;
            else
                System.out.println("Invalid");
            n/=10;
        }
        if(num==res)
            System.out.println(res);
        else
            System.out.println(res+" != "+num);
    }
}
