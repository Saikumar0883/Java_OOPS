import java.util.*;

class totalCharCount{
   public static void main(String[] args) {
   Scanner cin=new Scanner(System.in);
    String a=cin.nextLine();
    char c=cin.next().charAt(0);

    // a.replace('a', 'n')
    int ct=0;
    int index=a.indexOf(c);
    while (index!=-1) {
        ct++;
        index=a.indexOf(c,index+1);
    }
    System.out.println(ct);

}
}