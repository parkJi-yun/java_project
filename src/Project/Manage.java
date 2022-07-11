package Project;

import java.util.Scanner;

public class Manage {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0; 
		int num2 = 0;
		
		// ---------- 회원가입 ----------
		
		System.out.println("-----회원 가입-----"); 
		
		System.out.println("이름 입력 : ");		// 이름 저장 
		String Name = sc.nextLine();
		
		System.out.println("소속 학과: "); 		// 소속 저장
		String belong = sc.nextLine();
		
		System.out.println("id 입력 :");		// 아이디 저장
		String id = sc.nextLine();
		
		System.out.println("pw 입력 :");		// 비밀번호 저장
		String pw = sc.nextLine(); 
		
		System.out.println("전화번호 입력");		// 전화번호 저장
		String number = sc.nextLine(); 
		
		System.out.println("-----가입 완료-----");
		// ---------- 회원가입 완료----------
		
		// ---------- 로그인 ----------
		
		boolean go0 = true;		
		
		while(go0) {			// 전체를 감싸고 있는 while문
			
			boolean go = true;
	
			System.out.println("-----로 그 인-----"); 
			System.out.println("id 입력 :");			
			
			String id_input = sc.nextLine(); 		
			
			
			while(go) { 
				if(id.equals(id_input)) { 
					
					System.out.println("pw 입력 :");	
					String pw_input = sc.nextLine();
					
					if(pw_input.equals(pw)){		// 저장되어 있는 pw 값과 입력받은 pw가 같다면
						System.out.println(id+"님 로그인 되었습니다.\n");
						go = false; 
						go0 = false;
						break;
					}else { 						// 비밀번호가 틀렸을 때
						num++; 
						System.out.println("비밀번호가 틀렸습니다.");
					} if (num == 3) {				//  비밀번호가 3회이상 틀렸을 때
						// ---------- 비밀번호 찾기 ----------
						System.out.println("-----비밀번호 찾기-----");
						System.out.println("id 입력 :"); 
						String id2 = sc.nextLine();
						
						boolean go3 = true;
						
						while(go3) { 
							if(id.equals(id2)){
								System.out.println("핸드폰번호 입력 :");
								String number2 = sc.nextLine();
								
								if(number.equals(number2)){
									System.out.println("비밀번호를 찾았습니다 ! password : " + pw);
									go = false;
									go3 = false; 
								}else { 
									num++; 
									System.out.println("비밀번호를 찾지 못하였습니다.. 다시 입력해주세요");
								} 
								// ---------- 비밀번호 찾기 완료 ----------
	
							}else { 
								System.out.println("없는 아이디 입니다. 다시 입력해주세요"); 
								
								System.out.println("id 입력 :"); 
								id2 = sc.nextLine();
							} 
							
						}	
						
					}
				}else {				// 아이디가 틀렸을 때
					num2++;
					System.out.println("없는 아이디 입니다. 다시 입력해주세요");  
					System.out.println("id 입력 :");
					id_input = sc.nextLine(); 
					
				} if (num2 == 2) {
					// ---------- 아이디 찾기 ----------
					System.out.println("-----아이디 찾기-----");
					System.out.println("pw 입력 :"); 
					String pw2 = sc.nextLine();
					
					boolean go2 = true;
					
					while(go2) { 
						if(pw.equals(pw2)){
							System.out.println("핸드폰번호 입력 :");
							String number2 = sc.nextLine();
							
							if(number.equals(number2)){
								System.out.println("아이디를 찾았습니다 ! id : " +  id);
								go2 = false; 
								go = false;
								break;
								
							}else { 
								num2++; 
								System.out.println("아이디를 찾지 못하였습니다.. 다시 입력해주세요");
							} 
	
						}else { 
							System.out.println("틀린 번호 입니다. 다시 입력해주세요"); 
							
							System.out.println("pw 입력 :"); 
							pw2 = sc.nextLine();
						} 
						// ---------- 아이디 찾기 완료 ----------
						
					}
				}
			}
		}System.out.println("----- 로그인 완료 -----");
		// ---------- 로그인 완료 ----------
		
		
		// 로그인창 완료 ---------------------------------------------------------
		

		// 접속 후 -------------------------------------------------------------
		
		System.out.println("\n이름 : "+ Name +"\n" + 
				"소속학과 : " + belong + "\n" + 
				"강의명 : 자바의 이해 \n" + 
				"");
		
		
		
	}

	
	
	// ---------- 학생관리 시작 ----------
	
} 


