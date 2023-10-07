package PrintStringArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintStringArrays {
    public static void main(String args[]) throws IOException {
        String st[]=new String[5];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter string elements : ");
        for (int x=0;x<5;x++){
            st[x]=br.readLine();
        }
        System.out.println("The result of the string elements is : ");{
            for (int x=0; x<5;x++){
                System.out.print("\t "+st[x]);
            }
        }
    }

}
