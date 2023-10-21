public class ReverseString {

    public void reverse() {
        String original = "Hello";
        String reversedString = "";

        for (int i = 0; i < original.length(); i++) {
            reversedString = original.charAt(i) + reversedString;
        }
        System.out.println(original);
        System.out.println(reversedString);
    }

}

