package bySam;

public class Pally {
    public String reversal(String inputstring) {
        String outputstring = "";

        for (int i = inputstring.length() -1; i >= 0; i--)
        {
            outputstring += inputstring.charAt(i);
        }

        return outputstring;
    }

    public boolean isPalindromeSimple(String term){
        String backwardsterm = reversal(term);
        Boolean isSame = term.equals(backwardsterm);
        return isSame;

    }
}
