import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Test{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a character: ");
        char input = (char) reader.read();

        System.out.println("You entered: " + input);

        reader.close();
    }
}
