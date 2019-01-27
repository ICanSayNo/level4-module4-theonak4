package _04_hospital;

public class Patient {

	boolean cared = true;
	
	public Object feelsCaredFor() {
		return cared;
	}
	
	public void checkPulse() {
		cared = true;
	}
	
}
