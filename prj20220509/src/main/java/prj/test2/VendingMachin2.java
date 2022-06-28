package prj.test2;

public class VendingMachin2 {

	public static void main(String[] args) {
		VendingMachin1 vm =new VendingMachin1();
		boolean start = vm.inputMoney();
		
		if(start == true) {
			vm.Menu();
			vm.purchase();
			
		}
	}

}
