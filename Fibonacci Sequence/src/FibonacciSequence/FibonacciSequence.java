package FibonacciSequence;

public class FibonacciSequence {
    public static void main(String args[]){
        int w=0,x=1,y,z,count=10;
        System.out.println("The result of the fibonacci sequence is : ");
        System.out.print(w+" "+x);

        for (z=2;z<count;z++){
            y=w+x;
            System.out.print(" "+y);
            w=x;
            x=y;
        }
    }
}
