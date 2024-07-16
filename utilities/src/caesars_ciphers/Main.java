// package caesars_cipher;

public class Main {
    public static void main(String[] args) {

   
        String message =  "How are you doing today";

        int offset= 2;
        
        CaesarsCipher bob = new CaesarsCipher();
        
        bob.cipher(message, offset);

        System.out.println(message);
        System.out.println( bob.cipher(message, offset));
    }
}
