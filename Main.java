import java.util.*;
class Main {
   public static void main(String[] args) {            
    Scanner keyboard = new Scanner(System.in);
    Board board = new Board(3,3);
    board.print();
    while(!(board.winXHorizontal() || board.winOHorizontal() || board.winXVertical() || board.winOVertical() || board.winXDiag() || board.winODiag())) {
      String currPlayerShape = board.currentPlayer();
      System.out.print(currPlayerShape + " enter a position(rows first enter then columns enter: ");
      board.placeMove(keyboard.nextInt(),keyboard.nextInt(),currPlayerShape);
      board.print();
    }
    
    if(board.winXHorizontal() || board.winXVertical() || board.winXDiag()){
      System.out.println("Player X has won!");
    }
    
    else{
      System.out.println("Player O has won!");
    }
  }
}