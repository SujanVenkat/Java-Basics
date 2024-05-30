package basics;
public class strbuilder{
	public static void main(String args[]) {
		StringBuilder d1=new StringBuilder("test");
		StringBuilder sb=new StringBuilder("test");
		StringBuilder sb1=new StringBuilder(45);
		System.out.println(d1);
		System.out.println(d1.charAt(0));
		System.out.println(d1.length());
		d1.setCharAt(0,'p');
		System.out.println(d1);
		d1.insert(0, 's');
		System.out.println(d1);
		d1.delete(0, 2);
		System.out.println(d1);
		d1.append("ern");
		System.out.println(d1);
		System.out.println(sb.length());
		System.out.println(sb);
		System.out.println(sb.charAt(2));
		System.out.println(sb);
		sb.setCharAt(0,'u');
		System.out.println(sb);
		sb.insert(2,'u');
		System.out.println(sb);
		sb.append("sujan");
		System.out.println(sb);
		sb.delete(2,3);
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
		System.out.println(sb);
	}

}