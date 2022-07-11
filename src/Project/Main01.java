package Project;
import java.util.Scanner;

public class Main01 {
	
	
	public static void main(String[] args) {
		Manage mn1 = new Manage();
		mn1.main(args);
		
		studentDate sd = new studentDate();
		gradeDate gd = new gradeDate();
		
		Scanner sc = new Scanner(System.in);
		// ---------- 접속완료 ---------- 
		boolean go4 = true;

		while (go4) {

			System.out.println("1.학생관리");
			System.out.println("2.성적관리");
			System.out.println("3.종료");
			System.out.println("입력해주세요.");

			int oversee = sc.nextInt();
			
			switch(oversee) {
			case 1:
				System.out.println("학생관리를 선택하였습니다.");
				sd.main();	// 학생관리 메서드 바로가기
				go4 = false;
				break;
			case 2:
				System.out.println("성적관리를 선택하였습니다.");
				gd.main2();
				go4 = false;
				break;
			case 3:
				System.out.println("종료하기를 선택하였습니다\n프로그램을 종료합니다.");
				go4 = false;
				break;
		    default:
		    	System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			}
		} 
		
		
		
		

		
	}

}
