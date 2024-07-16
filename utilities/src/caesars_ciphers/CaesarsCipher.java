// package caesars_cipher;

public class CaesarsCipher {
    
    private static final char LETTER_A = 'a';
    private static final char LETTER_Z = 'z';
    private static final int ALPHABET_SIZE = 26;

    private void offsetBy(char[] character, int offset){
        // 
        for(int i=0;i<character.length; ++i){
            character[i] = offsetChar(character[i], offset, LETTER_A, LETTER_Z);
        }   
        
    }

    private char offsetChar(char c, int offset, char letterA, char letterZ){
        c +=offset;
        if(c<letterA){
            return (char) (c+ ALPHABET_SIZE);
        }

        if(c<letterZ){ // right shift
            return (char) (c - ALPHABET_SIZE);
        }
        return c;
    }

    public String cipher(String message, int offset){
        offset %= ALPHABET_SIZE;
        char[] character = message.toCharArray();
        offsetBy(character,offset);
        return new String(character);
    }

    
}
