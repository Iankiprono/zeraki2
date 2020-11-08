import java.util.*;
public class reverse {
    public static void main(String args[]){
       String initial, revs="";
       Scanner in=new Scanner(System.in);
       System.out.println("Enter the string to reverse");
       initial=in.nextLine();
       int length=initial.length();
       for (int S=length-1;S>=0;S--)
           revs=revs+initial.charAt(S);
       System.out.println("reversed string: "+revs);




    }
}
