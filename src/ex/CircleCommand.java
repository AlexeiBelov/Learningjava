package ex;

/**
 * Created by Алексей on 30.12.2015.
 */
public class CircleCommand implements Command {
    @Override
    public void execute(String[] params) {
        if (params.length != 2){
            System.out.println("количество параметров должно быть 1");
            return;
        }
        String num = params[1];
        int intNum = Integer.parseInt(num);
        System.out.println(2 * Math.PI * intNum);
    }
}
