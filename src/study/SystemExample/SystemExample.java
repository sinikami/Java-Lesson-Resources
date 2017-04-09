package study.SystemExample;


import java.util.Properties;
import java.util.StringTokenizer;

/**
 * Created by ikocos on 11/03/2017.
 */
public class SystemExample {

    public static void main(String[] args) {

       /* InputStreamReader inputStreamReader =new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try{
            while(true){

                char ch =(char) inputStreamReader.read();
                System.out.println(ch);
                if(ch=='.'){
                    break;
                }
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

       // BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
       // System.out.println(inputStreamReader.toString());
        try{
           // System.out.println("1");
            System.out.println("Line: "+bufferedReader.readLine());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
*/
        int arr1[] = {77, 82, 99, 100, -27, 0, 42, -35, 60, 72};
        int arr2[] = {7, 0, 3, 0, -1, 2, 11, 5, 0, 9};

        for (int i = 0; i < arr1.length; i++) {
            try {
                int result = arr1[i] / arr2[i];
                System.out.println(result);

            } catch (java.lang.ArithmeticException e) {
                System.err.println(e.getMessage() + " Index: " + i);
            }

        }

        try {
            String str = System.getenv("PATH");

            System.out.println(System.getenv());
            System.out.println("");
            System.out.println("");
            StringTokenizer stringTokenizer = new StringTokenizer(str, ":");

            // System.out.println(stringTokenizer);
            while (stringTokenizer.hasMoreTokens()) {
                System.out.println(stringTokenizer.nextToken());
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.printf("%n%n");

        Properties properties = System.getProperties();

        //properties.list(System.out);

        System.out.printf("%n%n");
        System.out.println(System.getProperty("user.dir"));


        if (args.length != 2) {
            System.out.println("Usage: Java systemExample: <Integer> <Integer>");
            System.exit(1);
        }
        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int sum = num1 + num2;

            System.out.println(sum);

            //System.exit(2);


        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
            System.exit(3);
        }

        ResourceUser resourceUser = new ResourceUser();

        resourceUser.use();
        resourceUser=null;
        System.gc();

        int[] arr={1,2,3,4,5,6,7,8,9,10};

        System.arraycopy(arr,1,arr,5 ,3);

        for (int i : arr){
            System.out.println(i);
        }
    }
}
