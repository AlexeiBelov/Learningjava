package ex;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by Алексей on 30.12.2015.
 */
public class EchoCommand implements Command {
    @Override
    public void execute(String[] params) {
        String[] strings = Arrays.copyOfRange(params, 1, params.length);
        System.out.println(Arrays.stream(strings).collect(Collectors.joining(" ")));
        //склейка строк стримы полезны для многопоточности
    }
}

