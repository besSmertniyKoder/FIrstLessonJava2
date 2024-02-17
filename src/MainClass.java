import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        int a = 10;
        char c = 'a';
        boolean b = false;
        float f = 10.5F;
        String s = "hello world";
        String hello = "world!";
        String s1 = new String("test");
        System.out.println(b);
        System.out.println(c);
        Scanner scanner = new Scanner(System.in);
//        System.out.println("print text here:");
//        String input = scanner.nextLine();
//        System.out.println(input);

        int[] intArray = {1,4,6,3, 6,6,6,5,65,5,3,2,4,6};

        int[] blankArray = new int[1000];
        blankArray[10] = 7;
//        System.out.println(intArray.length);
        System.out.println(intArray[3]);

        for (int i = 0;i < intArray.length ; i++){
            if(intArray[i]==34){
                System.out.println("we found 34, exit");
                break;
            }

            System.out.print(intArray[i] + " ");

        }




    }


}
