import java.util.Scanner;
public class Solution {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int noOfProblems=scan.nextInt();
		
		int canDo=0;
		for(int i=0;i<noOfProblems;i++){
			int x=0;
			for(int j=0;j<3;j++){
				if (scan.nextInt()==1){
					x++;
				}
			}
			if(x>=2){
				canDo++;
			}
		}
		System.out.println(canDo);
	}
}