import java.util.Date;
import java.util.Scanner;

public class DateFormatEx {
    public static void main(String[] args) {
        Date date = new Date();
        String tmpTime = date.toString();
        String time = "time";
        String square = "square";
        String circle = "circle";
        String echo = "echo";
        boolean isContain, isContain2, isContain3;
        String tmpEcho = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter on of the words time, circle, echo or square");
        String str = scanner.next();
        isContain = str.contains("square");
        isContain2 = str.contains("circle");
        isContain3 = str.contains("echo");
        int tmp = 0;
        float tmpCircle = 0;

        if (str.equals(time)) {
            System.out.println("you entered - time");
        } else if (isContain) {//слово square найдено
            System.out.println("you entered - square");
            tmp = Integer.parseInt(scanner.next());
            str = square;
        } else if (isContain2) {
            System.out.println("you entered - circle");
            tmp = Integer.parseInt(scanner.next());
            tmpCircle = (float) (3.14 * tmp + tmp);
            str = circle;
        } else if (isContain3) {
            System.out.println("you entered - echo");
            tmpEcho = str.substring(4);
            str = echo;
        } else {
            System.out.println("Unknown command");
        }
        switch (str) {
            case ("echo"): {
                System.out.println(tmpEcho);
                break;
            }
            case ("circle"): {
                System.out.println(tmpCircle);
                break;
            }
            case ("square"): {
                System.out.println(tmp * tmp);
                break;
            }
            case ("time"): {
                System.out.println(tmpTime);
                break;
            }
        }
    }
}
