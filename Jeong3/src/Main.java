import com.lx.house.House;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	House house = House.addHouse();
    	
    	/// 1. 'Main' 클래스에서 직접 설정하는 방식
        // Scanner scanner = new Scanner(System.in);
        // House house = new House();
        // System.out.println("집의 이름을 입력하세요: ");
        // house.setName(scanner.nextLine());
 
        while (true) {
        	
            house.addDogdetail();
            
            System.out.println("다른 강아지를 추가하시겠습니까? (y/n): ");
            String continueInput = scanner.nextLine();
            
            if (continueInput.equalsIgnoreCase("n")) {
                break;
            }
        }
        
        house.allDog();
        
        house.lastDog();
        
        scanner.close();
        
    }
}