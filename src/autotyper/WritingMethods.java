package autotyper;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author falcu
 */
public class WritingMethods {

    public static boolean working = false;

    public void robotSwitch(String sentence) throws AWTException {
        Robot robot = new Robot();
        Thread t = new Thread() {
            @Override
            public void run() {
                while (working) {
                    for (char c : sentence.toCharArray()) {
                        switch (c) {
                            case 'a':
                                robot.keyPress(KeyEvent.VK_A);
                                break;
                            case 'A':
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_A);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                break;
                            case 'b':
                                robot.keyPress(KeyEvent.VK_B);
                                break;
                            case 'B':
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_B);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                break;
                            case 'c':
                                robot.keyPress(KeyEvent.VK_C);
                                break;
                            case 'C':
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_C);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                break;
                            case 'd':
                                robot.keyPress(KeyEvent.VK_D);
                                break;
                            case 'D':
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_D);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                break;
                            case 'e':
                                robot.keyPress(KeyEvent.VK_E);
                                break;
                            case 'E':
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_E);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                break;
                            case 'f':
                                robot.keyPress(KeyEvent.VK_F);
                                break;
                            case 'F':
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_F);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                break;
                            case 'g':
                                robot.keyPress(KeyEvent.VK_G);
                                break;
                            case 'G':
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_G);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                break;
                            case 'h':
                                robot.keyPress(KeyEvent.VK_H);
                                break;
                            case 'H':
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_H);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                break;
                            case 'i':
                                robot.keyPress(KeyEvent.VK_I);
                                break;
                            case 'I':
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_I);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                break;
                            case 'j':
                                robot.keyPress(KeyEvent.VK_J);
                                break;
                            case 'J':
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_J);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                break;
                            case 'k':
                                robot.keyPress(KeyEvent.VK_K);
                                break;
                            case 'K':
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_K);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                break;
                            case 'l':
                                robot.keyPress(KeyEvent.VK_L);
                                break;
                            case 'L':
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_L);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                break;
                            case 'm':
                                robot.keyPress(KeyEvent.VK_M);
                                break;
                            case 'M':
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_M);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                break;
                            case 'n':
                                robot.keyPress(KeyEvent.VK_N);
                                break;
                            case 'N':
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_N);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                break;
                            case 'o':
                                robot.keyPress(KeyEvent.VK_O);
                                break;
                            case 'O':
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_O);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                break;
                            case 'p':
                                robot.keyPress(KeyEvent.VK_P);
                                break;
                            case 'P':
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_P);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                break;
                            case 'q':
                                robot.keyPress(KeyEvent.VK_Q);
                                break;
                            case 'Q':
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_Q);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                break;
                            case 'r':
                                robot.keyPress(KeyEvent.VK_R);
                                break;
                            case 'R':
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_R);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                break;
                            case 's':
                                robot.keyPress(KeyEvent.VK_S);
                                break;
                            case 'S':
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_S);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                break;
                            case 't':
                                robot.keyPress(KeyEvent.VK_T);
                                break;
                            case 'T':
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_T);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                break;
                            case 'u':
                                robot.keyPress(KeyEvent.VK_U);
                                break;
                            case 'U':
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_U);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                break;
                            case 'v':
                                robot.keyPress(KeyEvent.VK_V);
                                break;
                            case 'V':
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_V);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                break;
                            case 'w':
                                robot.keyPress(KeyEvent.VK_W);
                                break;
                            case 'W':
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_W);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                break;
                            case 'x':
                                robot.keyPress(KeyEvent.VK_X);
                                break;
                            case 'X':
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_X);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                break;
                            case 'y':
                                robot.keyPress(KeyEvent.VK_Y);
                                break;
                            case 'Y':
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_Y);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                break;
                            case 'z':
                                robot.keyPress(KeyEvent.VK_Z);
                                break;
                            case 'Z':
                                robot.keyPress(KeyEvent.VK_SHIFT);
                                robot.keyPress(KeyEvent.VK_Z);
                                robot.keyRelease(KeyEvent.VK_SHIFT);
                                break;
                            case ' ':
                                robot.keyPress(KeyEvent.VK_SPACE);
                                break;
                            case ',':
                                robot.keyPress(KeyEvent.VK_COMMA);
                                break;
                            case '.':
                                robot.keyPress(KeyEvent.VK_PERIOD);
                                break;
                            case '/':
                                robot.keyPress(KeyEvent.VK_SLASH);
                                break;
                            case '\'': 
                                robot.keyPress(KeyEvent.VK_QUOTE);
                                break;
                        }
                    }
                    robot.keyPress(KeyEvent.VK_ENTER);
                    robot.keyRelease(KeyEvent.VK_ENTER);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(AutoTyper.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };

        t.start();
    }

    public void robotHardcoded() throws AWTException {
        Robot robot = new Robot();
        robot.mouseRelease(InputEvent.BUTTON1_MASK);

        Thread t = new Thread() {
            @Override
            public void run() {
                while (true) {
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_H);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.keyRelease(KeyEvent.VK_H);
                    robot.keyPress(KeyEvent.VK_E);
                    robot.keyRelease(KeyEvent.VK_E);
                    robot.keyPress(KeyEvent.VK_L);
                    robot.keyRelease(KeyEvent.VK_L);
                    robot.keyPress(KeyEvent.VK_L);
                    robot.keyRelease(KeyEvent.VK_L);
                    robot.keyPress(KeyEvent.VK_O);
                    robot.keyRelease(KeyEvent.VK_O);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_W);
                    robot.keyRelease(KeyEvent.VK_W);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_O);
                    robot.keyRelease(KeyEvent.VK_O);
                    robot.keyPress(KeyEvent.VK_R);
                    robot.keyRelease(KeyEvent.VK_R);
                    robot.keyPress(KeyEvent.VK_L);
                    robot.keyRelease(KeyEvent.VK_L);
                    robot.keyPress(KeyEvent.VK_D);
                    robot.keyRelease(KeyEvent.VK_D);
                    robot.keyPress(KeyEvent.VK_ENTER);

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(AutoTyper.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        t.start();
    }

    public void robotSimple(String sentence) throws AWTException {
        Robot robot = new Robot();
        char[] charArray = sentence.toCharArray();
        Thread t = new Thread() {

            @Override
            public void run() {
                while (working) {
                    for (char c : charArray) {
                        int code = KeyEvent.getExtendedKeyCodeForChar(c);
                        switch (c) {
                            case '!':
                                if (Locale.getDefault().getLanguage().equals("en")) {
                                    robot.keyPress(KeyEvent.VK_SHIFT);
                                    robot.keyPress(KeyEvent.VK_1);
                                    robot.keyRelease(KeyEvent.VK_1);
                                    robot.keyRelease(KeyEvent.VK_SHIFT);
                                }
                                break;
                            case '?':
                                if (Locale.getDefault().getLanguage().equals("en")) {
                                    robot.keyPress(KeyEvent.VK_SHIFT);
                                    robot.keyPress(KeyEvent.VK_SLASH);
                                    robot.keyRelease(KeyEvent.VK_SLASH);
                                    robot.keyRelease(KeyEvent.VK_SHIFT);
                                }
                                break;
                            case ' ':
                                robot.keyPress(KeyEvent.VK_SPACE);
                                robot.keyRelease(KeyEvent.VK_SPACE);
                                break;
                            default:
                                if (Character.isUpperCase(c)) {
                                    robot.keyPress(KeyEvent.VK_SHIFT);
                                }
                                robot.keyPress(code);
                                robot.keyRelease(code);
                                if (Character.isUpperCase(c)) {
                                    robot.keyRelease(KeyEvent.VK_SHIFT);
                                }
                                break;
                        }

                    }
                    robot.keyPress(KeyEvent.VK_ENTER);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(WritingMethods.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        t.start();
    }

}
