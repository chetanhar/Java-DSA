package Arrays;

public class Main
{
    static String originalString="abcabc";

    private static int operationCount(String word, int input1,int input2){
        int turns = 0;
        String currentString = word;
        do {
            currentString = performTurn(currentString, input1, input2);
            turns++;
        } while (!isOriginalString(word, currentString));
        return turns;
    }
    private static String performTurn(String str, int input1, int input2) {
        String removedFromEnd = str.substring(str.length() - input1);
        String modifiedString = removedFromEnd + str.substring(0, str.length() - input1);
        removedFromEnd = modifiedString.substring(modifiedString.length() - input2);
        return removedFromEnd + modifiedString.substring(0, modifiedString.length() - input2);
    }
    private static boolean isOriginalString(String original, String current) {
        return original.equals(current);
    }

    // arguments are passed using the text field below this editor
    public static void main(String[] args)
    {
        //originalString=args[0];
        System.out.println(operationCount("AbcDef",1,2));
    }
}
