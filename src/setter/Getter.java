package setter;

public class Getter {

	public static void main(String[] args) {
		System.out.println("run from this class");
		Setter g=new Setter();
		
		g.setName("hai");
		//g.setName("h");
		String s=g.getName();
		System.out.println(s);
	}

}
