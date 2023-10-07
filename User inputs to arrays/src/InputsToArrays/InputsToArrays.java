package InputsToArrays;

import java.io.*;

public class InputsToArrays {
    public static void main(String args[]) throws NumberFormatException, IOException{
        int x[]=new int[5];
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Insert numbers : ");
        for (int y=0;y<5;y++){
            x[y]=Integer.parseInt(br.readLine());
        }
        for (int y=0;y<x.length;y++){
            System.out.print("\t"+x[y]);
        }
    }
}
