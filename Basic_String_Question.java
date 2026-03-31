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
    public static void string_builder(){
        StringBuilder sb=new StringBuilder("");
        for(char ch='A';ch<='Z';ch++){
            sb.append(ch);
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
    public static String upperCase(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == ' '&& i<str.length()-1 ){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
        return sb.toString();
        
    }
    public static String compression(String str){
     StringBuilder sb=new StringBuilder("");
     for (int i = 0; i < str.length(); i++) {
        Integer count=1;
        while(i<str.length()-1 && str.charAt(i)== str.charAt(i+1) ){
            count++;
            i++;
        }
        sb.append(str.charAt(i));
        if(count >1){
            sb.append(count);
        }
     }  
     return sb.toString(); 
    }
    public static void main(String args[]){
        String str="WNEENESENNNN";
        String str2="hello World";
        System.out.println(shortestPath(str));
        System.out.println(palindrome_check(str));
        System.out.println(substring(str2, 3, 7));
        String fruits[]={"apple","mango","banana"};
        largest(fruits);
        string_builder();
        upperCase("hi, i am tony bhaiya  ");
        String repeat="aaabbcddd";
        System.out.println(compression(repeat));


    }
}
