import com.selam.Palindrome;
import org.junit.After;
        import org.junit.Before;
        import org.junit.Test;

        import static org.junit.Assert.*;

public class PalindromeTest {

    private Palindrome palindrome;
    private String input;

    //..............................................................................................
    @Test
    public void punctuationMark() throws Exception {
        Palindrome palindrome =new Palindrome();
        input = "Eva, can I see bees in a cave?";

        assertFalse(palindrome.isPalindrome(input));
        System.out.println("...");

    }

    @Test
    public void WhiteSpace() throws Exception {
        Palindrome palindrome =new Palindrome();
        input = "A   Santa         at Nasa";

        assertTrue(palindrome.isPalindrome(input));

    }

    @Test
    public void emptyString() throws Exception {
        Palindrome palindrome =new Palindrome();

        input = "";

        assertTrue(palindrome.isPalindrome(input));

    }
    @Test
    public void singleLetter() throws Exception {
        Palindrome palindrome =new Palindrome();

        input = "H";

        assertTrue(palindrome.isPalindrome(input));

    }

    @Test
    public void invalidPalindromeTest() throws Exception {
        Palindrome palindrome =new Palindrome();

        input = "I am a tester";

        assertFalse(palindrome.isPalindrome(input));
    }
}

//..................................................................................................













