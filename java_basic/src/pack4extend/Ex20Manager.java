package pack4extend;

public class Ex20Manager extends Ex20Regular {
	private double incentive;
	
	public Ex20Manager(String irum, int nai, int salary) {
		super(irum, nai,salary);
	}
	@Override
	public double pay() {
		if(super.pay()>=2500000) {
			incentive = super.pay() * 0.6;
		}else if(super.pay()>=200000){
			incentive = super.pay() * 0.5;
		}else {
			incentive = super.pay() * 0.4;
		}
		
		return super.pay() + incentive;
	}
	@Override
	public void print() {
		display();
		System.out.println(", 수령액 : " + pay());
	}
	
	
}
