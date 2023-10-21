import java.util.Scanner;

public class CountingWords {

    public void wordsCount() {
        String sentence = "Awais Talseem is a 23 year old man";
        int countWords = sentence.split("\\s").length;

        System.out.println("Number of words is - " + countWords);
    }

    public void userInWords() {
        String userInputWords;

        Scanner readLine = new Scanner(System.in);

        System.out.println("Enter some words");

        userInputWords = readLine.nextLine();

        int countWordsFromUser = userInputWords.split("\\s").length;

        System.out.println("Number of words is " + countWordsFromUser);
        readLine.close();

    }

}
