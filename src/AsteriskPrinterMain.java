import java.util.*;

public class AsteriskPrinterMain {
    public static void main(String[] args) {
        Scanner keyType = new Scanner(System.in);
        askAndDraw(keyType);
    }

    static void askAndDraw(Scanner keyType) {
        while (true) {
            System.out.println("Please type in the number of the option you would like to choose.");
            AsteriskDrawer.displayOptions();
            switch (keyType.nextInt()) {
                case 1: //Box
                    AsteriskDrawer.askForNumRows();
                    AsteriskDrawer.drawBox(keyType.nextInt());
                    break;
                case 2: //Left-aligned-triangle
                    AsteriskDrawer.askForNumRows();
                    AsteriskDrawer.drawLeftAlignedTriangle(keyType.nextInt());
                    break;
                case 3: //Right-center-triangle
                    AsteriskDrawer.askForNumRows();
                    AsteriskDrawer.drawRightAlignedTriangle(keyType.nextInt());
                    break;
                case 4: //Center triangle
                    AsteriskDrawer.askForNumRows();
                    AsteriskDrawer.drawCenterAlignedTriangle(keyType.nextInt());
                    break;
                case 5: //Box with X
                    AsteriskDrawer.askForNumRows();
                    AsteriskDrawer.drawBoxWithX(keyType.nextInt());
                    break;
                case 6: //Exit
                    return;
                default:
                    System.out.println("Not a valid option.");
                    break;
            }
            System.out.println();
        }
    }
}
