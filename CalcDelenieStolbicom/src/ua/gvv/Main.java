package ua.gvv;
import java.util.Scanner;

public class Main {
	
	private static int chislitel, znamenatel;
	private static boolean on_off= true;// will be changed accordingly to user input
	public static final String DEVIDEND = "Vvedite chislitel:";
	public static final String DEVISOR = "Vvedite znamenatel:";
	public static final String WISH = "Vu hotite esho zhtoto podelit'?";
	
	public static void main(String[] args) {
		
		//Scanner sn = new Scanner (System.in);
		
		for (;on_off;){
			//System.out.println("Vvedite chislitel:");
			chislitel = scannerIntInput(DEVIDEND); //sn.nextInt();
			//System.out.println("Vvedite znamenatel:");
			znamenatel = scannerIntInput(DEVISOR); //sn.nextInt();
			CalcDelenieStolbikom cds = new CalcDelenieStolbikom(chislitel,znamenatel);
			//System.out.println("Vu hotite esho zhtoto podelit'?");
			String userWish = scannerStringInput(WISH).toLowerCase();
			if (userWish.equals("yes") || userWish.equals("y")){
				on_off = true;
			}
			else if (userWish.equals("n")||userWish.equals("no")){
				on_off = false;
			}
			else{
				System.out.println("I don't understand what you want. Bye-bye");
				on_off = false;
			}

		}
		
		System.out.println("Konez");
	}

}
