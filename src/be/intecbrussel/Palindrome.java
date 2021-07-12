package be.intecbrussel;
import java.io.* ;
import java.lang.* ;
import java.net.URL;
import java.util.* ;


public class Palindrome {
        // Interact with the user
        ///////////////////////////////////
        // Ask the user for a character string
     static String Read_String(String question) {
            System.out.println(question);
            String text = "phrase";
            try {
                BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer st = new StringTokenizer(input.readLine());
                text = st.nextToken();
            }
            catch(java.io.IOException e) {
                System.out.println("Reading error");
                System.exit(0);
            }
            return text;
     }
        // Simple palindrome search function
        ///////////////////////////////////////////////
     static boolean Palindrome1 (String string) {
            int lc = string.length ();
            for (int i = 0; i < lc / 2; i++)
                if (string.charAt(i) != string.charAt(lc - i - 1))
            return false;
            return true;
     }
        // More complicated search for palindrome
        ////////////////////////////////////////////
     static boolean Est_Separator (char c){

            int NSMAX = 12;
            char[] separators = { ',', ':',' ', '.', '-', '(', ')', '{', '}', '\n', ' ', ';'} ;
            for (int i = 0; i < NSMAX; i++)
                if (c == separators[i])
                    return true;
            return false;
     }
     static boolean Palindrome2 (String string){
                int lc = string.length(), d = 0, f = lc - 1;
                while (d < f) {
                    while (d < lc && Est_Separator(string.charAt(d))) d++;
                    while (f >= 0 && Est_Separator(string.charAt(f))) f--;
                    if (d == lc || f < 0)
                        return true;
                    if (string.charAt(d) != string.charAt(f))
                    return false;
                    d++; f--;
                }
                return true;
     }

}