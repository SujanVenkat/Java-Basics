package basics;
public class ValidParenthesis{
	public String s="(){}[]";
	public String p="";
	public boolean isValid(String str) {
		if(str.length()%2==0) {
			for(int i=0;i<str.length();i+=2) {
				char q=str.charAt(i);
				int w=s.indexOf(q);
				String e=Character.toString(str.charAt(i+1));
				String r=Character.toString(s.charAt(q+1));
				if(e.equals(r)) {
					for(int j=0;j<str.length();j++) {
						if(j==i||j==i+1) {
							continue;
						}else {
						p=p+str.charAt(j);
						System.out.println(p);
						}		
					}
					p="";
				}
			}
			str=p;
			boolean b=str.equals("");
			return b;
		}
			return false;
	}
	public static void main(String args[]) {
		ValidParenthesis object=new ValidParenthesis();
	 System.out.println(object.isValid("()[]{}"));
	}
}