package ex;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map<String, Command> commands = new HashMap<String, Command>();
        commands.put("time", new TimeCommand());
        commands.put("square", new SquareCommand());
        commands.put("circle", new CircleCommand());
        commands.put("echo", new EchoCommand());
        commands.put("exit", new ExitCommand());
      //  commands.put("exit", params -> System.exit(0));

        Scanner scanner = new Scanner(System.in);

        for (; ; ) {
            String str = scanner.nextLine();
            String[] split = str.split(" ");
            Command command = commands.getOrDefault(split[0], params -> System.out.println("unknownCommand"));//здесь анонимный класс или лямбда
            command.execute(split);
        }
    }
    private final static class ExitCommand implements Command{

        @Override
        public void execute(String[] params) {
            System.exit(0);
        }
    }
}
