public class Assignment05 {
	public static void main(String[] args) {
		int n=30;
	for(int i = 0; i < n; i++) {    
        for(int j = 0; j < n; j++) {  
            if(i==0 ||i==n-1||j==0 
            		||i+j<=(n-1)/2
            		||i-j>=(n-1)/2){  
                System.out.printf("* ");    
                }else {  
                System.out.printf("");  
            } 
	        
        }  
        System.out.printf("\n");  
	}
    
	}}


