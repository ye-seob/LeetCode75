package week1;
import java.util.Scanner;

public class week1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        
        char[] str3 = new char[str1.length()+str2.length()];

        int j=0;
        int i =0;
        if(str1.length() == str2.length()){
            for( i =0; i< str1.length(); i++){
                str3[j] = str1.charAt(i);
                j++;
                str3[j] = str2.charAt(i);
                j++;
            }
        }
        else if(str1.length() < str2.length()){
            for( i =0; i< str1.length(); i++){
                str3[j] = str1.charAt(i);
                j++;
                str3[j] = str2.charAt(i);
                j++;
            }
            for(int k = i; k< str2.length(); k++){
                str3[j] = str2.charAt(k);
                j++;
            }
        }
        else{
            for( i =0; i< str2.length(); i++){
                str3[j] = str1.charAt(i);
                j++;
                str3[j] = str2.charAt(i);
                j++;
            }
            for(int k = i; k< str1.length(); k++){
                str3[j] = str1.charAt(k);
                j++;
            }
        }
        System.out.println(str3);
        sc.close(); 
    }
}
