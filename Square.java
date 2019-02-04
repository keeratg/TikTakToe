class Square{
  private int xPos;
  private int yPos;
  private String shapernani;

  public Square(int x, int y, String shape){
    xPos = x;
    yPos = y;
    shapernani = shape;
  }
  
  public String getShape(){
      return shapernani;            
   }
   
  public void setShape(String shape){
      shapernani = shape;
   }
  
}