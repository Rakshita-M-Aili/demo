package board;

public class Board {
   public int size;
  public  char matrix[][];

   public Board(int size,char deafulsymbol){
    this.size=size;
    matrix=new char[size][size];

    for(int i=0;i<size;i++){
        for(int j=0;j<size;j++){
            matrix[i][j]= deafulsymbol;
        }
    }
   }
   public void setDefaultSymbol(char symbol){
    for(int i=0;i<size;i++){
        for(int j=0;j<size;j++){
            matrix[i][j]= symbol;
        }
    }
   }
