public class NullPointerExceptionDemo {

    static void generateNullPointerException() {
        String text = null;
        System.out.println("Text length: " + text.length());
    }

    // Method to handle NullPointerException
    static void handleNullPointerException() {
        String text = null;
        try {
            System.out.println("Text length inside try: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        generateNullPointerException();
        handleNullPointerException();
    }
}
