import java.util.*;

public class AsteriskPrinterMain {
    public static void main(String[] args) {
        Scanner keyType = new Scanner(System.in);
        AsteriskDrawer drawer = new AsteriskDrawer();
        askAndDraw(drawer, keyType);
    }

    static void askAndDraw(AsteriskDrawer drawer, Scanner keyType) {
        String input;
        while (true) {
            System.out.println("Please type in the number of the option you would like to choose.");
            AsteriskDrawer.showOptions();
            input = keyType.next();
            switch (input) {
                case "1": //Box
                    drawer.askForNumRows();
                    drawer.drawBox(keyType.nextInt());
                    break;
                case "2": //Left-aligned-triangle
                    drawer.askForNumRows();
                    drawer.drawLeftAlignedTriangle(keyType.nextInt());
                    break;
                case "3": //Right-center-triangle
                    drawer.askForNumRows();
                    drawer.drawRightAlignedTriangle(keyType.nextInt());
                    break;
                case "4": //Center triangle
                    drawer.askForNumRows();
                    drawer.drawCenterAlignedTriangle(keyType.nextInt());
                    break;
                case "5": //Box with X
                    drawer.askForNumRows();
                    drawer.drawBoxWithX(keyType.nextInt());
                    break;
                case "6": //Exit
                    return;
                default:
                    System.out.println("Not a valid option.");
                    break;
            }
            System.out.println();
            System.out.println();
        }
    }
}
