package problem.solving;
public class ValidParenthensis{
	public static boolean isValid(String s){
		String str="(){}[]";
		if(s.length()%2==0) {
			for(int i=0;i<s.length();i+=2) {
				String y=Character.toString(s.charAt(i));
                int r=str.indexOf(y);
                String h=Character.toString(s.charAt(i+1));
                String o=Character.toString(str.charAt(r+1));
                if(h.equals(o)) {
                	continue;
                }
                else {
                	return false;
                }
			} 
			return true;
		     }
		    return false;
		}
	public static void main(String args[]) {
		System.out.println(isValid("{[]}"));
	}
}