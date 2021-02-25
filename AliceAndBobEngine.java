

/**
 * This is a class for greeting certain users.
 *
 * @author (Ryan Hufford)
 * @version (02/24/21)
 */
public class AliceAndBobEngine
{
    String result;
    
    public AliceAndBobEngine(){
        result = "";
    }

    //HINT: LOOK AT THE TESTS TO SEE WHAT IS EXPECTED FOR DIFFERENT CONDITIONS
    public String evaluateAliceOrBob(String input) {
        if (input == "Alice") {
            result = "Hello Alice";
        }
        else if (input == "Bob") {
            result = "Hello Bob";
        }
        else {
            result = "I DON'T KNOW YOU, YOU ARE SCARY";
        }
        
        return result;
    }
}
