import java.util.Arrays;
public class reverse {
    public static void main(String[] args) {
    String [] myArray = {"it", "academy", "lesson", "java"};
        for (int i = 0; i < myArray.length / 2; i++){
            String temp = myArray[i];
            myArray[i] = myArray[myArray.length - i - 1];
            myArray[myArray.length - i - 1] = temp;
        }
        for (int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }



    }
}
