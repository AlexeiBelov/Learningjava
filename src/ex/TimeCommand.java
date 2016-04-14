package ex;

import java.util.Date;

/**
 * Created by Алексей on 30.12.2015.
 */
public class TimeCommand implements Command {
    @Override
    public void execute(String[] params) {
        System.out.println(new Date());
    }
}
