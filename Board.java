class Board{
  
  private Square[][] board;   
  private boolean moveX;

  public Board(int row, int column){
    board = new Square[row][column];
    moveX = true;
    for(int i = 0; i < row; i++){
       for(int j = 0; j < column; j++){
            board[i][j] = new Square(i, j, "*");                         
       }        
    }
  }
  
  public String currentPlayer(){        
    if(moveX){
        moveX = false;    
        return "X";
    }
    else{
        moveX = true;  
        return "O";
    }    
  }
  
  public void placeMove(int x, int y, String shape){
    if(board[x-1][y-1].getShape().equals("*")){
        board[x-1][y-1].setShape(shape);
    }    
  }
  
  public boolean winXHorizontal(){ 
    int j = 0;
    for(int i = 0;  i < board.length ; i++){        
        if(board[i][j].getShape().equals("X") && board[i][j+1].getShape().equals("X") && board[i][j+2].getShape().equals("X")){
            return true;                               
        }      
    }
    return false;
  }

  public boolean winOHorizontal(){
    int j = 0;
    for(int i = 0;  i < board.length ; i++){        
        if(board[i][j].getShape().equals("O") && board[i][j+1].getShape().equals("O") && board[i][j+2].getShape().equals("O")){
            return true;                               
        }      
    }
    return false;
  }
  
  public boolean winXVertical(){
    int i = 0;
    for(int j = 0;  j < board[0].length ; j++){        
        if(board[i][j].getShape().equals("X") && board[i+1][j].getShape().equals("X") && board[i+2][j].getShape().equals("X")){
            return true;                               
        }      
    }
    return false;
  }

  public boolean winOVertical(){
     int i = 0;
    for(int j = 0;  j < board[0].length ; j++){        
        if(board[i][j].getShape().equals("O") && board[i+1][j].getShape().equals("O") && board[i+2][j].getShape().equals("O")){
            return true;                               
        }      
    }
    return false;
  }

  public boolean winXDiag(){
    if(board[0][0].getShape().equals("X") && board[1][1].getShape().equals("X") && board[2][2].getShape().equals("X")){
      return true;
    }
    if(board[0][2].getShape().equals("X") && board[1][1].getShape().equals("X") && board[2][0].getShape().equals("X")){
      return true;
    }
    return false;
  }
  
 public boolean winODiag(){
    if(board[0][0].getShape().equals("O") && board[1][1].getShape().equals("O") && board[2][2].getShape().equals("O")){
      return true;
    }
    if(board[0][2].getShape().equals("O") && board[1][1].getShape().equals("O") && board[2][0].getShape().equals("O")){
      return true;
    }
    return false;
  }
  

  public void print(){
    System.out.println("#####");
    for(int i = 0; i < board.length; i++) {
      System.out.print(i+1);
      for(int j = 0; j < board[0].length; j++) {
        System.out.print(board[i][j].getShape());
      }
      System.out.println("#");
    }
    System.out.println("#####");
    System.out.println(" 123 ");                          
  }
}