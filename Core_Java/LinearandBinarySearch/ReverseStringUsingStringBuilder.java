public class ReverseStringUsingStringBuilder {
    public static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello")); // Output: olleh
    }
}
