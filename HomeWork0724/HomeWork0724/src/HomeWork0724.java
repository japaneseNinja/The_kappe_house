
public class HomeWork0724 {
public static void main(String[] args) {
	String name = "鈴村";
	KappeStopper stop = new KappeStopper();
	stop.check(name);

}
}

class KappeStopper{
	void check(String name){
		if("鈴村".equals(name)){
			try {
				throw  new SuzumuraException();
			} catch (SuzumuraException e) {
				
				e.printStackTrace();
			}
				}
		else{
			System.out.println("通行許可");
			}
	}
}
class SuzumuraException extends Exception{
	SuzumuraException(){
	System.out.println("鈴村禁止！");
}
}
