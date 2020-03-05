
interface Test {

	public int add(int a,int b);
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test t1=(a,b)->{return (a+b);};

System.out.println(t1.add(10,20));
	}

}
