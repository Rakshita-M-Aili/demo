import board.Board;
import player.Player;
import game.Game;


public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        System.out.println("first project-->Tic Tac Toe");

        Board b=new Board(3,'-');
       // b.printBoardConfig();
      
        Player p1=new Player();
        p1.setPlayernameandsymbol("sony",'x');
        p1.getPlayernameandsymbol();
    
        Player p2= new Player();
        p2.setPlayernameandsymbol("rashmi",'0');
        p2.getPlayernameandsymbol();

        Game game = new Game(new Player[] {p1,p2},b);
        game.play();
    }
}
