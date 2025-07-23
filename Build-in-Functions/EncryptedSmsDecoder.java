
import java.util.Scanner;

// 1. Encrypted SMS Decoder
// In a secret agency, all messages are encrypted by reversing the string and converting all vowels to *.
// Input: hello world
// Output: dlr*w *ll*h

class EncryptedSmsDecoder{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Message to Encrypt: ");
        String str = sc.nextLine();
        StringBuilder arr = new StringBuilder(str);
        for(int i = 0; i < str.length(); i++){
            char ch = arr.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                arr.setCharAt(i, '*');
                arr.insert(i+1, '-');
            }
        }
        sc.close();
        arr.reverse();       
        System.out.print("Encrypted Message is: " + arr.toString());
       
    }
}