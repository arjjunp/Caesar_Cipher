
public class Main {

    public static void main(String[] args) {

        String message =  "How are you doing today";

        int offset= 12;
        
        CaesarsCipher bob = new CaesarsCipher();
        
        bob.cipher(message, offset);
    }
}
