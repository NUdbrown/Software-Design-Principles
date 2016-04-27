import java.util.Scanner;

public class Controller {

    public static void main (String[] args) 
    {
    	GaussianElimination ge = new GaussianElimination();
        Scanner scan = new Scanner(System.in);
        boolean notFinished = true;
        
        while(notFinished){
        	
        	System.out.println("\nEnter number of variables:");
        	int numEntered = scan.nextInt();
        	
        	double[] B = new double[numEntered];
        	double[][] A = new double[numEntered][numEntered];
        	
        	System.out.println("\nEnter all coefficients:");
        	for (int i = 0; i < numEntered; i++){
        		for (int j = 0; j < numEntered; j++){
        			A[i][j] = scan.nextDouble();
        		}
        	}
        	
        	System.out.println("\nEnter "+ numEntered +" solutions");
        	for (int i = 0; i < numEntered; i++){
        		B[i] = scan.nextDouble();
        	}
        	ge.solve(A,B);
        	
        	if(numEntered == 0){
        		notFinished = false;
        	}
        }
 
    }

}
