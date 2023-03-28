
//Youssef Kabbouch
//HW2 -CST3613
package homeWork;

import java.util.Random;

public class MatrixArray {
	//1. Returns true if a matrix is square
	public static boolean squareMatrix(int [][]M) {
		for (int i=0;i<M.length;i++) {
			if (M.length!=M[i].length) {
				return false;
			}
			}
		return true;
	}
	//2. Returns the dimensions of a matrix
	public static int [] demensionMatrix(int [][] M) {
		int []D = new int[2];
		D[0]=M.length;
		D[1]=M[0].length;
		
		return D;
		
	}
	//3. Prints a matrix to the console in matrix form
	public static void printMatrixTwoD(int [][] M) {
		int [] demension=demensionMatrix(M);
		
		for (int i=0;i<demension[0];i++) {
			for(int j=0;j<demension[1];j++) {
				System.out.print(M[i][j]+ " ");
			}
			System.out.println();
						
		}
	}
	//4. Returns a square integer matrix of a specified length whose elements are random integers 	between 1 and 9.
	public static int [][] randomSquare(int len){
		Random r = new Random();
		int [][]M=new int[len][len];
		for (int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				M[i][j]=r.nextInt(0, 10);
			}
		}
		return M;
	}
	//5. Returns a rectangular integer matrix with a specified dimensions whose elements are random integers between 1 and 9.
	public static int [][] randomRectangular(int len,int wid){
		Random r = new Random();
		int [][]M=new int[len][wid];
		for (int i=0;i<len;i++) {
			for(int j=0;j<wid;j++) {
				M[i][j]=r.nextInt(0, 10);
			}
		}
		return M;
	}
		//6. Returns a specified row from a matrix.
	public static int [] rowMatrix(int [][] M,int rowIndex) {
		int []D = new int[M[rowIndex].length];
		for (int i=0;i<D.length;i++) {
			D[i]=M[rowIndex-1][i];
		}
				return D;
			}
	//7. Returns a specified column from a matrix.
	public static int [] columnMatrix(int [][] M,int columnIndex) {
		int []D = new int[M.length];
		for (int i=0;i<D.length;i++) {
			D[i]=M[i][columnIndex-1];
		}
				return D;
		}
	//8. Returns the main diagonal from a square matrix.
	public static int [] diagonalMatrix(int [][] M) {
		int []D = new int[M.length];
		for (int i=0;i<D.length;i++) {
			for(int j=0;j<D.length;j++) {
				if (i==j)D[i]=M[i][j];	
			}
					}
				return D;
		}
	//9. Returns the Transpose of a matrix.
	public static int [][] transposeMatrix(int [][]M){
		int [][]D=new int[M.length][M[0].length];
		for (int i=0;i<M.length;i++) {
			for(int j=0;j<M[i].length;j++) {
				D[j][i]=M[i][j];
			}
		}
		return D;
	}
	//10.Returns the Trace of a square matrix.
	public static int traceMatrix(int [][]M){
	int []T=diagonalMatrix(M);
	int sum=0;
		for (int i=0;i<T.length;i++) {
		sum+=T[i];
		}
		return sum;
	}
	//11.Return true if two matrices are identical.
	public static boolean identicalMatrix(int [][]A,int [][]B){
		for (int i=0;i<A.length;i++) {
			for(int j=0;j<A[i].length;j++) {
				if (A[i][j]!=B[i][j]) {
					return false;
				}
			}
			}
		return true;
		}
	//12.Return true if a matrix is symmetric.
	public static boolean symmetricMatrix(int [][]A){
		int [][]B=transposeMatrix(A);
		for (int i=0;i<A.length;i++) {
			for(int j=0;j<A[i].length;j++) {
				if (A[i][j]!=B[i][j]) {
					return false;
				}
			}
			}
		return true;
		}
	// print matrix one demension
	public static void printMatrixOneD(int [] M) {
		
				for (int i=0;i<M.length;i++) {
			System.out.print(M[i]+ " ");							
		}
		System.out.println();
	}
	//Task 2-------------------------------------
	//1. Returns true if two matrices a compatible for a specified operation
	public static boolean compatibleMatrix(int [][]A,int [][]B,String operation){
		if (operation.equals("add") ||operation.equals("sub")){
		if (A.length!= B.length)return false;
		
		for (int i=0;i<A.length;i++) {
			if (A.length != A[i].length || B.length !=B[i].length)return false;
									}
		
		}else if(operation.equals("mult")){
			if(A[0].length != B.length ){
	           return false;
	            }
		}
		return true;
		}
	
	//2 Returns the matrix that results from adding two matrices.
	public static int[][] addMatrices(int[][] A, int[][] B){
		int [][]sum = new int[A.length][A[0].length];    
		if (!compatibleMatrix(A, B, "add")) {
			return sum;
		}
       
        for(int i = 0; i < A.length; i++){ 
            for(int j = 0; j < A[0].length; j++){
                sum[i][j] = A[i][j] + B[i][j];
            }
        }
        return sum;
    }
	//3.Returns the matrix that results from subtracting two matrices.
	public static int[][] subMatrices(int[][] A, int[][] B){
		int [][]sum = new int[A.length][A[0].length];    
		if (!compatibleMatrix(A, B, "sub")) {
			return sum;
		}
       
        for(int i = 0; i < A.length; i++){ 
            for(int j = 0; j < A[0].length; j++){
                sum[i][j] = A[i][j] - B[i][j];
            }
        }
        return sum;
    }
	//4.Returns the matrix that results from scaling a matrix by a specified scalar.
	public static int[][] scaleMatrix(int[][] A, int scalar){ 
        int[][] scaled = new int[A.length][A[0].length];
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[0].length; j++){
                scaled[i][j] = A[i][j] * scalar;
            }
        }
        return scaled;
    }
	//5. Returns the matrix that results from multiplying two matrices
	public static int[][] multiplyMatrices(int[][] A, int[][] B){
		  int[][] product = new int[A.length][B[0].length];  
		if (!compatibleMatrix(A, B, "mult")) {
			return product;
		}
            
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < B[0].length; j++){
                for(int k = 0; k < A[0].length; k++){
                    product[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return product;
    }
	public static void main(String[] args) {
		//Q.5 Returns a rectangular integer matrix with a specified dimensions whose elements are random integers between 1 and 9.
		int [][] R= randomRectangular(4,3);
		
		//Q.4 Returns a square integer matrix of a specified length whose elements are random integers between 1 and 9.
		int [][] S= randomSquare(4);
		
		//Q.1 Returns true if a matrix is square
		System.out.println("Is the Matrix S square :"+squareMatrix(S));
		System.out.println("Is the Matrix R square :"+squareMatrix(R));
	
		//Q.2 Returns the dimensions of a matrix.
		int [] oneD=demensionMatrix(S);
		System.out.println("the Matrix S is "+oneD[0]+"X"+oneD[1]);
		oneD=demensionMatrix(R);
		System.out.println("the Matrix R is "+oneD[0]+"X"+oneD[1]);
		
		//Q.3 Prints a matrix to the console in matrix form.
		System.out.println("the Matrix S:"); 
		printMatrixTwoD(S);
		System.out.println("the Matrix R:"); 
		printMatrixTwoD(R);
		
		//Q.6 Returns a specified row from a matrix.
		System.out.println("Returns a 2end row from a Matrix S");
		oneD=rowMatrix(S, 2);
		printMatrixOneD(oneD);
		
		//Q.7 Returns a specified column from a matrix.
		System.out.println("Returns a 1st column from a Matrix S");
		oneD=columnMatrix(S, 1);
		printMatrixOneD(oneD);
		
		//Q.8 Returns the main diagonal from a square matrix.
		System.out.println("Returns a diagonal from a Matrix S");
		oneD=diagonalMatrix(S);
		printMatrixOneD(oneD);
		
		//Q.9 Returns the Transpose of a matrix.
		System.out.println("Returns the Transpose of a matrix S");
		R=transposeMatrix(S);
			printMatrixTwoD(R);
			
		//Q.10 Returns the Trace of a square matrix.
			System.out.println("the Trace of a square matrix is :"+traceMatrix(S));
			
		//Q.11 Return true if two matrices are identical.
		int [][] S2=randomSquare(4);
		System.out.println("the Matrix S:"); 
		printMatrixTwoD(S);
		System.out.println("the Matrix S2:"); 
		printMatrixTwoD(S2);
		System.out.println("Matrices S and S2 are identical: "+ identicalMatrix(S, S2));
		
		//Q.12 Return true if matrix is symmetric.	
		System.out.println("Matrix S is symmetric: "+ symmetricMatrix(S));
		
		// Taske2--------------------------
		System.out.println("Addition of S and S2 :");
		printMatrixTwoD(addMatrices(S, S2));
		System.out.println("Substraction of S and S2 :");
		printMatrixTwoD(subMatrices(S, S2));
		System.out.println("Scale of S by 3:");
		printMatrixTwoD(scaleMatrix(S, 3));
		System.out.println("Multiplication of S and S2 :");
		printMatrixTwoD(multiplyMatrices(S, S2));
		
	}
}
