package functional.programming.practice;

public class DistanceBetweenTwoWords {
    //    Input two words returns the shortest distance between their two midpoints in number of characters
//    Words can appear multiple times in any order and should be case insensitive.
//            E.g. for the document="Example we just made up" shortestDistance( document, "we", "just" ) == 4
    public static void main(String[] args) {
        String doc = "Example we just made up";
        System.out.println(shortestDistanceBetweenTwoWords(doc,"we","just"));
    }

    private static double shortestDistanceBetweenTwoWords(String mainDoc, String firstWord, String secondWord) {
        final String[] words = mainDoc.split("[,. ]");

        int wordCount = 0;
        double wordOneCount = 0;
        double wordTwoCount = 0;
        double shortestDistance = Double.MAX_VALUE;
        for (String word : words) {
            if (word.equalsIgnoreCase(firstWord)){
                wordOneCount = wordCount + (word.length() / 2d);
            }
            else if (word.equalsIgnoreCase(secondWord)) {
                wordTwoCount = wordCount + (word.length() / 2d);
            }

            if (wordOneCount > 0 && wordTwoCount > 0) {
                shortestDistance = Math.min(shortestDistance, Math.abs(wordTwoCount - wordOneCount));
            }

            wordCount += word.length() + 1;
        }

        System.out.println(String.format("firstWord : %s, secondWord: %s, distance: %s", firstWord, secondWord, shortestDistance));

        return shortestDistance;
    }
}
