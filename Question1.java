import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] tens = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety",};
        String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String number = String.valueOf(n);
        String numberInWords = "";
        boolean flag = false;

        if (n == 0) {
            System.out.println("Zero");
            return;
        }
        for (int i = 0; i < number.length(); i++) {

            if (number.length() - 1 - i == 2)
                numberInWords += ones[number.charAt(i) - '0'] + " hundred ";
            else if (number.length() - 1 - i == 1) {

                if (number.charAt(i) == '1')
                    flag = true;
                else if(number.length()==3 && (number.charAt(i)!='0' || number.charAt(i+1)!='0'))
                    numberInWords +="and "+tens[number.charAt(i) - '0'] + " ";
                else
                numberInWords += tens[number.charAt(i) - '0'] + " ";

            } else {

                if (flag)
                    numberInWords += teens[number.charAt(i) - '0'];
                else
                    numberInWords += ones[number.charAt(i) - '0'];
            }
        }
        System.out.println(numberInWords);
    }
}
