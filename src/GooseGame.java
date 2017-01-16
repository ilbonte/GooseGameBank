import java.util.ArrayList;
import java.util.List;

/**
 * Created by Davide on 16/01/2017.
 */
public class GooseGame {

    List<Player> players = new ArrayList<>();
    private String state;

    public void execute(Command command) {
        this.state=command.execute();
    }

    public String getState(){
        return  state;
    }
}
