package problem.solving;
public class Problem{
	public static void main(String args[]) {
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		int r=0;
		int g=0;
		int p=0;
		int o=0;
		int q=0;
		int w=0;
		int m=0;
		char [] name= {'b','o','o','k'};
		char [] alpha= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		for(int i=0;i<name.length;i++) {
			for(int j=0;j<alpha.length;j++) {
                     if(name[i]==alpha[j]) {
                    	 switch(i) {
                    	 case 0:
                    		a=j;
                    	 case 1:
                    		b=j;
                    	 case 2:
                    		 c=j;
                    	 case 3:
                    		 d=j;
                    	 }
                    	 
                     }
			}
		}
		int [] array= {a,b,c,d};
		for(int i=0;i<array.length;i++) {
			if(i==array.length-1) {
				o=array[i];
				continue;
			}
		
			if(array[i]!=array[i+1]) {
				switch(i) {
           	 case 0:
           		r=array[i];
           	 case 1:
           		g=array[i];//nothing
           	 case 2:
           		p=array[i];
           	 case 3:
           	 }
			}
			
		}
	int [] array1= {r,p,o};
	for(int i=0;i<array1.length;i++) {
		for(int j=0;j<array.length;j++) {
			if(array1[i]==array[j]) {
				switch(i) {
	           	 case 0:
	           		 q++;
	           		System.out.println(alpha[array[i]]+""+q);
	           		break;
	           	 case 1:
	           		 w++;
	           		System.out.println(alpha[array[i]]+""+w);
	           		break;
	           	 case 2:
	           		 m++;
	           		System.out.println(alpha[array[i]]+""+m);
	           		break;
			}
				
			}
			System.out.println("out");
		}
	
	}
}
}