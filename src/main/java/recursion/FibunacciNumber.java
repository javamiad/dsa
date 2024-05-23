package recursion;

public class FibunacciNumber {
    int sum=1;
    int iter=0;
    int oldsum=1;
    public int num(int n)
    {
        if(iter<=n)
        {
            oldsum=sum;
            sum=sum+num(oldsum);
            iter++;
        }


        return sum;
    }

    public static void main(String[] args) {
        FibunacciNumber f = new FibunacciNumber();
        f.num(3);
    }

}
