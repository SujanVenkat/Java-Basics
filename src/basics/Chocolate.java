package basics;
public class Chocolate{
	int barCode;
	String name;
	double weight;
	double cost;
	Chocolate(int barCode, String name, double weight, double cost){
		this.barCode=barCode;
		this.name=name;
		this.weight=weight;
		this.cost=cost;
	}
    Chocolate(){
		
	}
    public void setbarCode(int code) {
    	this.barCode=code;
    }
    public int getcode() {
    	return barCode;
    }
}