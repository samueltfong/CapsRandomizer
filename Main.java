import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variables
        String inString = "";
        String outString = "";
        int chance = 55;

        Scanner scanner = new Scanner(System.in);
        StringSelection selection;
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

        System.out.println("Enter the phrase you would like to be capitalized randomly.\n" +
                "The finished phrase will be automatically copied to your clipboard.");

        inString = scanner.nextLine().toLowerCase();

        for (int i = 0; i < inString.length(); i++) {
            if ((int)(Math.random() * 100) < chance) {
                outString += inString.toUpperCase().charAt(i);
            }
            else {
                outString += inString.charAt(i);
            }
        }

        selection = new StringSelection(outString);
        clipboard.setContents(selection, selection);
        System.out.println(outString);
    }
}
