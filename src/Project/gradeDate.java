package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class gradeDate {

	 Scanner sc = new Scanner(System.in);
	 // ArrayList 선언 
	 
	 ArrayList<grade> list2 = new ArrayList<grade>();
	 
	 public void main2() {
		   do {
			  
			Gradename(); // 성적관리 메서드 바로가기
		    String input = sc.next();
		    if (input.equals("1")) {
		    	Data2();
		    }
		    if (input.equals("2")) {
		    	check();
		    	if (list2.isEmpty()) {
					System.out.println("찾는학생이 없습니다.");
				}
		    }
		    
		    if (input.equals("3")) {
		    	updategrade();
		    }
		    if (input.equals("4")) {
		    	deletegrade();
		    }
		    if (input.equals("5")) {
		    	 System.out.println("프로그램을 종료합니다.");
			     break;
			}
		   
		   } while (true);
		 }
	 
	 // ---------- 성적관리 ---------- 
	 
	 public static void Gradename() {
		 // menu
		 System.out.println("1.등록");
		 System.out.println("2.조회");
		 System.out.println("3.수정");
		 System.out.println("4.삭제");
		 System.out.println("5.종료");
		 System.out.println("입력>>");
	 }
	 
	 // END -----------------------
	 
	 // ---------- 정보등록 ---------- 
	 public void Data2() {
		 System.out.println("이름을 입력하세요 : ");
		 String name = sc.next();
		  
		 System.out.println("학번을 입력하세요 : ");
		 String studentNum = sc.next();
		 
		 System.out.println("전공을 입력하세요 : ");
		 String major = sc.next();
		 
		 System.out.println("A점수를 입력하세요 : ");
		 int programmingA = sc.nextInt();
		 
		 System.out.println("B점수를 입력하세요 : ");
		 int programmingB = sc.nextInt();
		 
		 System.out.println("C점수를 입력하세요 : ");
		 int programmingC = sc.nextInt();
		 
	
		 grade g = new grade(name, studentNum, major, programmingA, programmingB, programmingC);
		 list2.add(g); // list.add(); 값 추가
	 }
	 // END -----------------------
	 
	 // ---------- 조회 ---------- 
	 
	 public void check() {
		 System.out.println("이름 : ");
		 String na = sc.next();
		 
		 System.out.println("학번 : ");
		 String sn = sc.next();
		 
		 for (int i = 0; i < list2.size(); i++) {
			 if (list2.get(i).getName().equals(na)
					 && list2.get(i).getStudentNum().equals(sn)) {
				System.out.println("찾은 학생 : ");
				System.out.println(
						"학번:" + list2.get(i).getStudentNum() 	+ "ㅣ"
						+ "이름:" + list2.get(i).getName()		+ "ㅣ"
						+ "전공: " + list2.get(i).getMajor() 		+ "ㅣ"
						+ "A:" + list2.get(i).getProgrammingA() + "ㅣ" 
						+ "B:" + list2.get(i).getProgrammingB() + "ㅣ" 
						+ "C:" + list2.get(i).getProgrammingC() + "ㅣ" 
						+ "총합:" + list2.get(i).getTotal() 		+ "ㅣ" 
						+ "평균:" + list2.get(i).getAvg() 		+ "ㅣ"
						+ "학점:" + list2.get(i).getScore()
						);
			 }else {
				 System.out.println("찾는학생이 없습니다.");
			 }
		  } 
	 }
	 
	 // END -----------------------
	 
	 // ---------- 수정 ---------- 
	 public void updategrade() {
		 System.out.println("이름");
		 String name = sc.next();
		 
		 System.out.println("학번");
		 String sn = sc.next();
		 
		 for (int i = 0; i < list2.size(); i++) {
			 if (list2.get(i).getName().equals(name) &&
					 list2.get(i).getStudentNum().equals(sn)) {
				 
				 System.out.println("전공 수정");
				 String major = sc.next();
				 
				 System.out.println("A점수 수정");
				 int programmingA = sc.nextInt();
				 
				 System.out.println("B점수 수정");
				 int programmingB = sc.nextInt();
				 
				 System.out.println("C점수 수정");
				 int programmingC = sc.nextInt();
				 
				 list2.get(i).setMajor(major);
				 list2.get(i).setProgrammingA(programmingA);
				 list2.get(i).setProgrammingB(programmingB);
				 list2.get(i).setProgrammingC(programmingC);
				 
				 System.out.println( list2.get(i).getName() 
				    		+ "님 정보가 변경되었습니다.");
				 
			 }
		 }
		 
		 
	 }
	 
	 // END ----------------------
	 
	 // ---------- 삭제 ---------- 
	 
	 	public void deletegrade() {
	 		System.out.println("이름");
			 String name = sc.next();

			 for (int i = 0; i < list2.size(); i++) {
				 if (list2.get(i).getName().equals(name)) {
					 System.out.println(list2.get(i).getName() + "삭제되었습니다.");
					 list2.remove(i); // 삭제하기
					 break;
				 }
			 }
	 	}
	  
	 // END ----------------------
	 
}
