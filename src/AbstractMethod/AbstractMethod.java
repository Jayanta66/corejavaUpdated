package AbstractMethod;

abstract class Programming{
	public abstract void Developer();
//	public abstract void Rank();

}


class HTML extends Programming{
	@Override
	public void Developer() {
		System.out.println("Tim Berners Lee");
	}
//	@Override
//	public void Rank() {
//		System.out.println("3rd");
//	}
}

 class Java extends Programming{
	@Override
	public void Developer() {
		System.out.println("James Gosling");
	}
}

public class AbstractMethod {

	public static void main(String[] args) {

		Programming referrence=new HTML();
		referrence.Developer();
	//	referrence.Rank();
		
		Programming referrence2 = new Java();
		referrence2.Developer();
		
	}

}
