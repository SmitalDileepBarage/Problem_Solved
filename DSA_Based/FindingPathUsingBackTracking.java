//not added

package Interview_basic.dsa;

public class FindingPathUsingBackTracking {

	public static void main(String[] args) {
		boolean [][] maze= {
				{true,true,true},
				{true,true,true},
				{true,true,true}
				
		          };
		System.out.println("Started from maze[0][0]:");
		System.out.println(" Trusted Paths are:\n");

		         pathWithoutObstacles(" ",maze,0,0);

	}
	
static void pathWithoutObstacles(String p,boolean [][] maze, int r,int c) {
		
		if(r==maze.length-1 &&  c==maze[0].length-1) {
			System.out.println(p);
			return;
			
		}
//		it means 
		if(!maze[r][c]) {
			return ;
		}
		maze[r][c]=false;
		
		
		if(r<maze.length-1) {
			
			pathWithoutObstacles(p+"D",maze,r+1,c);
		}
       if(c<maze[0].length-1) {
			
			pathWithoutObstacles(p+"R",maze,r,c+1);
		}
       if(r>0) {
			
			pathWithoutObstacles(p+"U",maze,r-1,c);
		}
       if(c>0) {
			
			pathWithoutObstacles(p+"L",maze,r,c-1);
		}
       
       maze[r][c]=true; 
}
}