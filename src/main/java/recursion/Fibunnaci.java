package recursion;

public class Fibunnaci {

    static int counter=1;

    static int sum=0;

    static int lastNum=0;
    static int newSum = 1;

    static int getFibunacciNumberAtIndex(int n)
    {   //1,2,3,4,5,6,7
        //0,1,1,2,3,5,8
        if(counter<n)
        {
            lastNum = newSum+sum;
            sum=lastNum+getFibunacciNumberAtIndex(sum);

            //1 -> 0
            //2 -> 1
            //3 -> 1
            //4 -> 2
            //5 -> 3
            //6 -> 5
            //7 -> 8
            //8 ->
            counter++;
        }

        return sum;
    }


}
