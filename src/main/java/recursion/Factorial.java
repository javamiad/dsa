package recursion;

public class Factorial {
    static int number =1;

    public static int getFactorial(int factorialElement)
    {


        if(factorialElement>0)
        {
            number = factorialElement*getFactorial(factorialElement-1);
        }
        return number;
    }


    public static void main(String[] args) {
        System.out.println(Factorial.getFactorial(3));
    }
}
