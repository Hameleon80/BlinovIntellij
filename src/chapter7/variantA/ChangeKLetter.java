package chapter7.variantA;

/**
 * In the each word of the text, replaced the k-th letter with the given character.
 *
 * Ahtirskij Yuriy 13.08.2021
 */
public class ChangeKLetter {
    public static void main(String[] args) {
        String text="I've been a transatlantic avgeek for decades, regularly flying back and forth from the US to the UK.\n " +
                "I always welcome a new entrant into the arena, but many of the newcomers don't really have a strong\n" +
                " business plan and their efforts don't survive the harsh economics of the North Atlantic, particularly in the winter.";
        char ch='9';
        int numToRepl=4;

        //array of words from text
        String[] words=text.split("\\s");
        int arrSize=words.length;

        //save result of changed
        String[] result=new String[arrSize];

        //replaces
        for(int i=0; i<arrSize; i++){
            if(words[i].length()<numToRepl){
                result[i]=words[i];
                continue;
            }
            result[i]=words[i].substring(0, numToRepl-1) + ch + words[i].substring(numToRepl);
        }

        //print result
        for(String arrElement:result){
            System.out.print(arrElement + " ");
        }
    }
}
