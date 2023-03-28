package homeWork;
//Youssef Kabbouch CST3613
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainMatrix {
//TASK #0
	public static void displayMatrix (int[][]M) {
		for(int i=0;i<M.length;i++) {
			for(int j=0;j<M[i].length;j++) {
				System.out.print(M[i][j]+" ");
			}
			System.out.println();
		}
	}
//TASK #1
	public static int[][] buildRandomMatrix () {
		int [][] BRM = new int[5][5];
		Random r = new Random();
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				BRM[i][j]=r.nextInt(1,10+1);
			}}
		return BRM;
	}
//TASK #2
		public static int diagonalProduct (int[][]M) {
			
			int A0=0,A4=0;
			if (M.length<5) {
				return 0;
							}
			for(int i=0;i<M.length;i++) {
				for(int j=0;j<M[i].length;j++) {
					if(i==j) {A0+=M[i][j];}
					if((i+j)==M.length-1) {A4+=M[i][j];}
				}}
					
			return A0*A4;
		}
//TASK #3
		public static int[] sumColumns (int[][]M) {
		int sum,j;
		int []B=new int [M.length];
		if (M.length<5) {return B;}
			for(int i=0;i<M.length;i++) {
				sum=0;
				j=0;
				while(j<M.length) {
					sum+=M[j][i];
					j++;
				}
					B[i]=sum;
				}
			
			return B;
		}
//TASK #4
		public static List<Integer>  evenOnly (int[][]M) {
		
			
			List<Integer> B = new ArrayList<>();
			if (M.length<5) {
								return B;}
			
			for(int i=0;i<M.length;i++) {
				for(int j=0;j<M[i].length;j++) {
					if (M[i][j]%2==0) {
						B.add(M[i][j]);
															}
				}
			}
			return B;	
		}
//TASK #5		
		public static int[]  convertToBinary (int[][]M) {
			int []B= new int[M.length];
			int sq;
			int sum;
			for(int i=0;i<M.length;i++) {
				sum=0;
				sq=M.length-1;
				for(int j=0;j<M[i].length;j++) {
					
					if (M[i][j]!=0) {
						sum+= (int)Math.pow(2,sq);
					}
					sq--;
				}
				B[i]=sum;
			}
			return B ;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//TASK #0
		//int [][]M= {{1,2,3},{4,5,6},{7,8,9}};
		//displayMatrix(M);
//TASK #1
		//displayMatrix(buildRandomMatrix());
//TASK #2
		//int [][]M= {{1,2,3,4,5},{6,7,8,9,1},{2,3,4,5,6},{7,8,9,1,2},{3,4,5,6,7}};
		//displayMatrix(M);
		//System.out.println("Product of the sum of the A0 and A4 is: "+ diagonalProduct(M));
	
//TASK #3
		//	int [][]M= {{1,2,3,4,5},{6,7,8,9,1},{2,3,4,5,6},{7,8,9,1,2},{3,4,5,6,7}};
		//	//displayMatrix(M);
		//	int []G=sumColumns(M);
		//	int i=0;
		//			while(i<G.length )
		//			{
		//				System.out.print(G[i]+" ");
		//				i++;
		//			}
		
//TASK #4
		//		int [][]M= {{1,2,3,4,5},{6,7,8,9,10},{12,13,14,15,16},{17,18,19,21,22},{23,24,25,26,27}};
		//		List<Integer>  B=evenOnly(M);
		//		for(int num : B) {
		//		System.out.print(num+" ");	
		//		}
//TASK #5
		int [][]M= {{0,1,1,0,1},{1,0,0,0,0},{1,1,0,1,1},{0,0,1,1,1},{1,1,1,1,1}};
		int B[]=convertToBinary(M);
		for (int num : B) {
			System.out.print(num+" ");	
		}
	}
	}
