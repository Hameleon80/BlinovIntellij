package chapter7.variantA;

/**
 * Replaces each letter in the text with its ordinal number in the alphabet.
 * By printing in first line prints letter with two spaces, in second line its ordinal number in the alphabets.
 *
 * Ahtirskij Yuriy 13.08.2021
 */
public class ReplaceCharToNumber {
    public static void main(String[] args) {
        String text="I've been a transatlantic avgeek for decades, regularly flying back and forth from the US to the UK.";
        String textNumbers=text.toLowerCase();
        System.out.println(textNumbers);
        char[] array=new char[text.length()];
        char replaceFrom='a';
        char replaceTo='1';

        for(int i=0; i<26; i++, replaceFrom++, replaceTo++){
            textNumbers=textNumbers.replace(replaceFrom, replaceTo);
        }
        System.out.println(textNumbers);
    }
}
