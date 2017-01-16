import java.util.Scanner;

/**
 * Created by Davide on 16/01/2017.
 */
public class GooseGameText {

    /*
    * Se devo fare un app basta creare gli oggetti passando i parametri giusti
    * In questo modo se devo aggiungere per esempio delte(già implmentato nella lib), basta aggiungere nel parser
    * il riconoscimento necessario e  creare il comando da ritornare.
    *
    * Domanda: GooseGame singleton, con player statici o passare ai comandi la lista dei players? Nota che non mi interessa
    * avere più games
    * */

    public static void main(String [] args) {

        Parser parser = new Parser();
        Command command;
        GooseGame gooseGame = new GooseGame();

        while(true){
            System.out.println("Gimme a command");
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();

            command = parser.getCommandFromText(input);

            gooseGame.execute(command);

            gooseGame.getState();
        }


        /*
        * Class GameEngine
        *
        * public execute(Command command){
        *   command.execute()
        * }
        *
        *
        * */

        /*  GameEngine engine = new GameEngine();
            while (true) {
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();

            //qua il client deve creare i comandi in base alla situazione


            Command c = new MoveCommand(Player, Dice) in base alla situazione mi costruisco questo command

            engine.action(c);
            //all'engine bisogna dare un command, sara lui a occuparsi di tutto
            System.out.println(engine.state());
        }*/
    }



}
