package switchcase3;

public class SwitchCase3 {

	public static void main(String[] args) {
		String floor = "gym";
		int elevator = 5;
		
		switch(elevator){
		case 1 : floor = "drugstore";
		break;
		case 2 : floor = "Orthopedics";
		break;
		case 3: floor = "Dentist";
		break;
		case 4 : floor = "Dermatology";
		break;
		case 5 : floor = "gym";
		break;
		}
		System.out.println(elevator + "인 경우는" +floor + "입니다" );
		}
}
		
	

		
		
		
