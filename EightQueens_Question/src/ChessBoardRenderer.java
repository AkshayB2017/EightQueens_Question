public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {
        int counter=0,flag=0; int number = 1; 
		System.out.println(square);
        
        for(int i=0;i<8;i++)
        {
        	for(int j=0;j<8;j++) {
        		if((i+(8*j))==square && ((i%2==0)==(j%2==0)))
        		{
        			return true;
        		}
        	}
        }
        return false;
        
	}
}
