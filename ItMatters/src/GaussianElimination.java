public class GaussianElimination {
	
	public void solve(double[][] A, double[] B)
    {
        int num = B.length;
        for (int r = 0; r < num; r++) 
        {
            int max = r;
            for (int i = r + 1; i < num; i++) {
                if (Math.abs(A[i][r]) > Math.abs(A[max][r])) {
                    max = i;
                }
            }
 
            //swapping in A matrix    
            double[] temp = A[r]; 
            A[r] = A[max]; 
            A[max] = temp;
            
            //swapping similar values
            double t = B[r]; 
            B[r] = B[max]; 
            B[max] = t;
           
            for (int i = r + 1; i < num; i++) 
            {
                double factor = A[i][r] / A[r][r];
                B[i] -= factor * B[r];
                for (int j = r; j < num; j++) {
                    A[i][j] -= factor * A[r][j];
                }
            }
        }
 
        // using back substitution
        double[] solution = new double[num];
        for (int i = num - 1; i >= 0; i--) 
        {
            double sum = 0.0;
            for (int j = i + 1; j < num; j++) {
                sum += A[i][j] * solution[j];
            }
            solution[i] = (B[i] - sum) / A[i][i];
            
        }        
        /** Print solution **/
        printSolution(solution);
    }

    public void printSolution(double[] sol)
    {
        int num = sol.length;
        System.out.println("\nSolution: ");
        for (int i = 0; i < num; i++){ 
        	if(sol[i] == -0){
        		sol [i] = 0;
        	}
        	else if(sol[i] == Double.POSITIVE_INFINITY || sol[i] == Double.NEGATIVE_INFINITY){
        		System.out.println("No Solution!");
        	}
        	else if(Double.isNaN(sol[i])){
        		System.out.println("Solution is arbitrary");
        	}       		
        	else{
        		System.out.printf("%.1f ", sol[i]);   
        	}
        }
        System.out.println();     
    }    


}
