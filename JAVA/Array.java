import java.utl.Arrays;
public class Array {
    public static void main(String[] args){
        int[] marks = new int[3];

        //boolean[] marks = new boolean[3];
        marks[0]=97;
        marks[1]=99;
        marks[2]=95;
        //System.out.println(marks[2]);

        //LENGTH
        //System.out.println(marks.length);

        //SORT
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

    }
    
}
