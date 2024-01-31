package functional.programming.practice.jan29;

import java.text.spi.BreakIteratorProvider;
import java.util.Arrays;
import java.util.List;

public class SuccessorAndRootElement {
    //    In English, we have a concept called root, which can be followed by some other word to form another longer word - let's call this word successor.
//    For example, when the root "an" is followed by the successor word "other", we can form a new word "another".
//    Given a dictionary consisting of many roots and a sentence consisting of words separated by spaces,
//    replace all the successors in the sentence with the root forming it. If a successor can be replaced by more than one root,
//    replace it with the root that has the shortest length.
//    Return the sentence after the replacement.
//
//    Example 1:
//    Input: dictionary = ["cat","bat","rat"], sentence = "the cattle was rattled by the battery"Output: "the cat was rat by the bat"
//    Example 2:
//
//    Input: dictionary = ["a","b","c"], sentence = "aadsfasf absbs bbab cadsfafs"Output: "a a b c"
//    Input in format: List<String> dictionary, String sentence
    public static void main(String[] args) {
//        String[] dictionary = {"cat", "bat", "rat"};
        List<String> dictionary = Arrays.asList("a","b","c");
        String sentence = "aadsfasf absbs bbab cadsfafs";
        System.out.println(replaceDictionaryWordInSentence(dictionary, sentence));
    }

    private static String replaceDictionaryWordInSentence(List<String> dictionary, String sentence) {
        String outputSentence = "";
        String[] inputArr = sentence.split(" ");
        for (String s : inputArr) {
            outputSentence += s + " ";
            for (String s1 : dictionary) {
                if (s.startsWith(s1)) {
                    outputSentence = outputSentence.replace(s, s1);

                }
            }
        }
        return outputSentence;
    }
}
