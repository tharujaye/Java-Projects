package ContinueLoop;

public class loopContinue {
    public static void main(String []args){
        int[] numbers = {5,10,15,20,25};
        for(int x : numbers){
            if(x==15);
            else if(x==20){
                continue;
            }
            System.out.println(x);
        }
    }
}
