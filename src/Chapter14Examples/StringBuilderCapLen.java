package Chapter14Examples;

public class StringBuilderCapLen {
    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder("Hello, how are you");
        System.out.printf("buffer = %s%n length = %d%n capacity = %d%n%n",
                buffer, buffer.length(),buffer.capacity());
        buffer.ensureCapacity(75);
        System.out.printf("New capacity = %d%n",buffer.capacity());

        buffer.setLength(10);
        System.out.printf("New length = %d%n buffer = %s%n",buffer.length(), buffer);
    }
}
