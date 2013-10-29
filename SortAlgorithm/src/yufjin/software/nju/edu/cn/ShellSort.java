package yufjin.software.nju.edu.cn;

public class ShellSort implements SortArray {

	@Override
	public int[] sort(int[] b) {
		// TODO Auto-generated method stub
		
		 for(int d=5;d>0;d=d-2){
	            for(int c=0;c<b.length-d;c++){
	                for(int i=c;i<b.length;i=i+d){
	                    for(int j=i;j>0;j=j-d){
	                        if(j<d)
	                            break;
	                        if(b[j]<b[j-d]){
	                            int tmp;
	                            tmp=b[j];
	                            b[j]=b[j-d];
	                            b[j-d]=tmp;

	                        }
	                    }
	                }
	                
	            }
	        }
		 return b;
		}
	
	
}
