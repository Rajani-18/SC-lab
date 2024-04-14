import java.util.*;
public class VC{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter plain tedxt");
        String pt=sc.nextLine();
        System.out.println("enter key");
        String key=sc.nextLine();
        if(pt.length()!=key.length()){
            System.out.println("Key ==plain text");
            return;
        }
        StringBuilder ct=new StringBuilder();
        for(int i=0;i<pt.length();i++){
            char c=(char)(pt.charAt(i)^key.charAt(i));
        ct.append(c);        }
   
    System.out.println("Encrypted text");
    for(int i=0;i<ct.length();i++){
        System.out.println(Integer.toBinaryString((int) ct.charAt(i))+" ");
    }
    StringBuilder dt=new StringBuilder();
    for(int i=0;i<ct.length();i++){
        char dc=(char)(ct.charAt(i)^key.charAt(i));
        dt.append(dc);
    }
    System.out.println("decrypted text"+dt.toString());
}
}
