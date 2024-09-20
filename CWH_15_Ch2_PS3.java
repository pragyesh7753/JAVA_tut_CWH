public class CWH_15_Ch2_PS3 {
    public static void main(String[] args) {
        // Problem1
        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);

        // Problem2
        String text = "To Lower Case";
        text = text.replace(" ", "_");
        System.out.println(text);

        // Problem3
        String letter = "Dear <|name|>, Thanks a lot";
        letter = letter.replace("<|name|>", "Pragyesh");
        System.out.println(letter);

        // Problem4
        String myString = "This string contains   double and triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // Problem5
        String myletter = "Dear Harry,\n\tThis Java Course is nice.\nThanks";
        System.out.println(myletter);

    }
}
