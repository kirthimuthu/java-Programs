package ArrayLearning;

public class FrequencyOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] a= {10,20,30,40,50,10,20,30,40,50,10,20,10,80};
         int[] freq = new int[a.length];
         for(int i=0;i<a.length;i++) {
        	 int no = a[i];
        	 int count = 1;
        	 for(int j=i+1;j<a.length;j++)
        	 {
             if(no==a[j])
             {
            	 count++;
            	 freq[j]=-1;
             }
        	 }
        	 if(freq[i]!=-1)
        	 freq[i] = count;
         }
	
       for(int i=0;i<a.length;i++) 
       {
    	  
    	   //System.out.print("|" +  freq[i] + " | ");
       }
       int max = Integer.MIN_VALUE;
       for(int i=0;i<freq.length ;i++)
       {
    	   if(freq[i]>max)
    	   {
    		   max = freq[i];
    	   }
       }
       System.out.println(max);
	}

	}

	



