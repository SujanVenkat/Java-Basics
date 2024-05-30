package basics;
public class Tester12{
    String Tester12Name;
    String area;
    String phoneNo;
    public static void main(String[] args){
        Tester12 Tester122=new Tester12("abc","xyz","pqr");
        System.out.println(Tester122.Tester12Name);
        System.out.println(Tester122.area);

    }
    Tester12(String Tester12Name,String area,String phoneNo){
        this.Tester12Name=Tester12Name;
        this.area=area;
    }
}