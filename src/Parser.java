import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Davide on 16/01/2017.
 */
public class Parser {

    private Command command;

    private static final String ADD_PLAYER_COMMAND = "aggiungi giocatore \\w+";
    private static final String MOVE_PLAYER_COMMAND = "muovi (\\w+).*";
    private static final String MOVE_PLAYER_EXPLICIT_COMMAND = "muovi (\\w+) (\\d+), (\\d+)";
    private String parsedName;
    private Dice dice;

    Parser(){

    }

    public Command getCommandFromText(String input) {
        if (input.matches(ADD_PLAYER_COMMAND)) {
            this.parsedName = input.replace("aggiungi giocatore ", "");

            return new AddCommand(new Player(this.parsedName));
        }

        if (input.matches(MOVE_PLAYER_COMMAND)) {
            this.parsedName = parseNameFromMoveCommand(input);
            this.dice = parseDiceFromMoveCommand(input);
            return new MoveCommand(new Player(this.parsedName), dice);
        }

        return command;
    }

    private Dice parseDiceFromMoveCommand(String input) {
        Pattern p = Pattern.compile(MOVE_PLAYER_EXPLICIT_COMMAND);
        Matcher m = p.matcher(input);
        if(m.find()) {
            return new Dice(m.group(1),m.group(2));
        } else {
            return null;
        }
    }

    private String parseNameFromMoveCommand(String input) {
        Pattern p = Pattern.compile(MOVE_PLAYER_COMMAND);
        Matcher m = p.matcher(input);
        m.find();
        return m.group(1);
    }
}
