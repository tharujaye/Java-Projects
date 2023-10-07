package Arrays;

public class Arrays {
    public static void main(String args[]) {
        int num[] = {100, 200, -99, 345, 678};
        System.out.println("<>This is number list<>");
        for (int y = 0; y < num.length; y++){
            System.out.print("\t"+num[y]+" ");
        }

        System.out.print("\n");
        System.out.print("\n");

        String names[] = {"Kettle", "Pot", "Cup", "Jug"};
        System.out.println("<>This is name list<>");
        for (int y=0;y< names.length;y++) {
            System.out.print("\t" + names[y]+" ");
        }
    }
}
