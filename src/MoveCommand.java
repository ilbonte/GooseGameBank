/**
 * Created by Davide on 16/01/2017.
 */
public class MoveCommand extends Command {


    public MoveCommand(Player player, Dice dice) {

    }

    @Override
    String execute() {
        // player
        // dices

        //player.move(dices)

        //returns state???


        //----------------


       /* Player player = getPlayerFromName(commandParser.getPlayerName());
        int diceValues[];
        if (commandParser.getDiceValue() == null) {
            diceValues = new int[]{1, 2};
        } else {
            diceValues = commandParser.getDiceValue();
        }
        player.move(diceValues[0], diceValues[1]);

        this.state = player.getName() + " tira " + diceValues[0] + ", " + diceValues[1] +
                ". " + player.getName() + " muove da " + player.getPreviousPosition() + " a " + player.getPosition() + ".";

        String lastMovesText = player.getLastMovesText();

        this.state += lastMovesText;*/
        return null;
    }
}
