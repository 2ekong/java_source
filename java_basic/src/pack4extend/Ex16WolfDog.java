package pack4extend;

public class Ex16WolfDog extends Ex16Dog{
	private String where = "동물원";
	
	public Ex16WolfDog(String name) {
	super(name);
	}
	
	public void show() {
		System.out.println("WolfDog 어디 사니?" + where );
	}
	
	@Override
	public void print() {
		System.out.println(getName() + "는(은)" + where + "에서 사람들 시선을 느끼며 산다");
	}
	
	public void displatPrint() {
		print();
		this.print();
		super.print();
	}
	
	
	
	
}
