
package Interview_basic.dsa;

import java.util.Arrays;

public class BacktrackingWithTracing {

	public static void main(String[] args) {
		boolean [][] maze= {
				{true,true,true},
				{true,true,true},
				{true,true,true}
				
		          };
		System.out.println("Started from maze[0][0]:");
		System.out.println(" Trusted Paths are:\n");

		
		int[][]path=new int[maze.length][maze[0].length];
		
		         pathWithoutObstacles(" ",maze,0,0,path,1);

	}
	
	
	
	
static void pathWithoutObstacles(String p,boolean [][] maze, int r,int c,int [][]path,int steps) {
		
		if(r==maze.length-1 &&  c==maze[0].length-1) {
 		path[r][c]=steps;
 		System.out.println(p);
			for(int[] arr:path) {
				System.out.println(Arrays.toString(arr));
			}
			
			
			System.out.println();
			return;
			
		}
//		it means 
		if(!maze[r][c]) {
			return ;
		}
		maze[r][c]=false;
		path[r][c]=steps;
		
		if(r<maze.length-1) {
			
			pathWithoutObstacles(p+"D",maze,r+1,c,path,steps+1);
		}
       if(c<maze[0].length-1) {
			
			pathWithoutObstacles(p+"R",maze,r,c+1,path,steps+1);
		}
       if(r>0) {
			
			pathWithoutObstacles(p+"U",maze,r-1,c,path,steps+1);
		}
       if(c>0) {
			
			pathWithoutObstacles(p+"L",maze,r,c-1,path,steps+1);
		}
       
       maze[r][c]=true; 
       path[r][c]=0;
}

}
