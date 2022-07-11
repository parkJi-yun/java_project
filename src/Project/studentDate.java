package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class studentDate {

	
	 Scanner sc = new Scanner(System.in);
	 
	 // ArrayList 선언
	 ArrayList<student> list = new ArrayList<student>();
	 

	 public void main() {
		   do {
			  
			Datename(); // 학생관리 메서드 바로가기
		    String input = sc.next();
		    if (input.equals("1")) {
		    	Data();
		    }
		    if (input.equals("2")) {
		    	searchName();
		    	if (list.isEmpty()) {
					System.out.println("찾는학생이 없습니다.");
				}
		    }
		    
		    if (input.equals("3")) {
		    	updateName();
		    }
		    if (input.equals("4")) {
		    	deleteName();
		    }
		    if (input.equals("5")) {
		    	 System.out.println("프로그램을 종료합니다.");
			     break;
			}
		   
		   } while (true);
		 }
	 
	
	 // ---------- 학생관리 ---------- 
	 public static void Datename() {
		 // menu
		  System.out.println("1.등록");
		  System.out.println("2.조회");
		  System.out.println("3.수정");
		  System.out.println("4.삭제");
		  System.out.println("5.종료");
		  System.out.println("입력>>");
	 }
	 // END -----------------------
	
	 // ---------- 학생등록 ---------- 
	 public void Data() { 
		  System.out.println("이름을 입력하세요 : ");
		  String name = sc.next();
		  
		  System.out.println("학번을 입력하세요 : ");
		  int studentNum = sc.nextInt();
	
		  System.out.println("전공을 입력하세요 : ");
		  String major = sc.next();
		  
		  System.out.println("번호를 입력하세요 :");
		  String phone = sc.next();
	
		  student s = new student(name, studentNum, major, phone);
		  list.add(s); // list.add(); 값 추가
	 }
	 // END -----------------------
	
	 // ---------- 학생조회 ---------- 
	 public void searchName(){ 
		  System.out.println("이름 : ");
		  String name = sc.next();
		  
		  // list.get(); 값 가져오기
		  for (int i = 0; i < list.size(); i++) {
			 if (list.get(i).getName().equals(name)) {
				System.out.println("찾은 학생 : ");
				System.out.println(
						  list.get(i).getStudentNum() + "번 "
						+ list.get(i).getName() 	+ "학생 " 
						+ list.get(i).getMajor() 	+ "전공 " 
						+ list.get(i).getPhone() 	+ " ");
			 }else {
				 System.out.println("찾는학생이 없습니다.");
			 }
		  } 
	 }
	 // END ----------------------
	 
	 
	// ---------- 학생수정 ---------- 
	 public void updateName() {
		 System.out.println("이름 : ");
		 String name = sc.next();
		 
		 for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(name)) {
				
				System.out.println("전공 수정");
				String major = sc.next();
				
				System.out.println("번호 수정");
				String phone = sc.next();
				
				list.get(i).setMajor(major);
			    list.get(i).setPhone(phone);
			    
			    System.out.println( list.get(i).getName() 
			    		+ "님 정보가 변경되었습니다.");
				
			}
		}
	 }
	 // END -----------------------
	 
	 // ---------- 학생삭제 ---------- 
	 public void deleteName() {
		 System.out.println("이름 : ");
		 String name = sc.next();
		 
		 for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(name)) {
				System.out.println(list.get(i).getName() + "삭제되었습니다.");
				list.remove(i); // 삭제하기
				break;
			}
		}
	 }
	 // END -----------------------
	 
	 
	 

}













