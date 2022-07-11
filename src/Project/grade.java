package Project;

//성적관리 시작------------------------------------

public class grade {
	// 초기화
	private String name;		// 이름
	private String studentNum;	// 학번
	private String major;		// 전공
	private int programmingA;	// A점수
	private int programmingB;	// B점수
	private int programmingC;	// C점수
	
	public grade(String name, String studentNum, String major, int programmingA, int programmingB, int programmingC) {
		super();
		this.name = name;
		this.studentNum = studentNum;
		this.major = major;
		this.programmingA = programmingA;
		this.programmingB = programmingB;
		this.programmingC = programmingC;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getProgrammingA() {
		return programmingA;
	}

	public void setProgrammingA(int programmingA) {
		this.programmingA = programmingA;
	}

	public int getProgrammingB() {
		return programmingB;
	}

	public void setProgrammingB(int programmingB) {
		this.programmingB = programmingB;
	}

	public int getProgrammingC() {
		return programmingC;
	}

	public void setProgrammingC(int programmingC) {
		this.programmingC = programmingC;
	}
	
	public int getTotal() {
		return (programmingA + programmingB + programmingC);
	}
	public int getAvg() {
		return (getTotal())/3;
	}
	
	public String getScore() {
		String gra;
		char plus = '+';

		
		switch(getAvg()/10){ 
		   case 10:
			   gra = "A+"; break;
		   case  9:
			   gra = "A"; break;
		   case  8:
			   gra = "B"; break;
		   case  7: 
			   gra = "C"; break;
		   case  6: 
			   gra = "D"; break;
		   default:
			   gra = "F";
		}
		plus=(((getAvg()+5)/10-getAvg()/10)==1)?'+':' ';
		
		if (getAvg() <= 69) {
			return (gra);
		} else {
			return (gra+plus);
		}


	}
	

	@Override
	public String toString() {
		return "grade [name=" + name 
				+ ", studentNum=" + studentNum 
				+ ", programmingA=" + programmingA
				+ ", programmingB=" + programmingB 
				+ ", programmingC=" + programmingC + "]";
	}
	
	
	
	
	
}
