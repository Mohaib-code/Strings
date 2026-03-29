import java.util.Scanner;

public class strings{
    public static void printLetters(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+ "-");
        }
    }
    public static void main (String args[]){
        String str="hello world";
        String str2=new String("yo guys1234@#");
        System.out.println(str);
        System.out.println(str2);
        Scanner sc=new Scanner(System.in);
        String str3=sc.nextLine();
        System.out.println(str3);
        int arr[]={1,2,3,4};
        System.out.println(arr.length);
        String firstName="Swastik";
        String lastName="Kuanr";
        String fullName=firstName+" "+lastName;
        System.out.println(fullName);
        System.out.println(fullName.charAt(3));
        printLetters(fullName);

    }
}