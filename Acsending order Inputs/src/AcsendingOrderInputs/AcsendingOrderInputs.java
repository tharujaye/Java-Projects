package AcsendingOrderInputs;
import java.io.*;
public class AcsendingOrderInputs {
    public static void main(String args[]) throws IOException {
        int num1=0, num2[]=new int[5],x,y;
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter 5 number elements : ");
        for (x=0;x<5;x++){
            num2[x]=Integer.parseInt(br.readLine());
        }
        for (x=0;x<num2.length;x++){
            for (y=x+1;y<num2.length;y++){
                if (num2[x]>num2[y]){
                    num1=num2[x];
                    num2[x]=num2[y];
                    num2[y]=num1;
                }
            }
        }
        System.out.println("Number elements in acsending order : ");
        for (x=0;x<5;x++){
            System.out.print("\t"+num2[x]);
        }
    }
}
