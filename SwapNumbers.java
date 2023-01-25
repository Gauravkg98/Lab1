public class SwapNumbers {

public void Swap(int n1 ,int n2) {
	System.out.println("Before swap  "+n1 +"  "+n2);
	int temp =0;
	temp =n1;
	n1 =n2;
	n2 =temp;
	System.out.println("After swap "+n1+"  "+n2);
	}

	public static void main(String[] args) {
		SwapNumbers s =new SwapNumbers();
		s.Swap(10,20);
	
	}
}
