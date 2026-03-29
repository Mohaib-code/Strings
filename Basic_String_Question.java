public class Basic_String_Question {
    public static boolean palindrome_check(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static float shortestPath(String str){
        int x=0,y=0;
        for (int i = 0; i < str.length(); i++) {
            int d=str.charAt(i);
            //North
            if(d=='N'){
                y++;
            }
            //South
            else if(d=='S'){
                y--;
            }
            //West
            else if(d=='W'){
                x--;
            }
            else {
                x++;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static String substring(String str,int si,int ei){
        String substring="";
        for(int i=si;i<ei;i++){
            substring=substring+str.charAt(i);
        }
        return substring;
    }
    public static void largest(String fruits[]){
        String largest=fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            if(largest.compareToIgnoreCase(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String args[]){
        String str="WNEENESENNNN";
        String str2="hello World";
        // System.out.println(shortestPath(str));
        // System.out.println(palindrome_check(str));
        System.out.println(substring(str2, 3, 7));
        String fruits[]={"apple","mango","banana"};
        largest(fruits);

    }
}
