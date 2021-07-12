package co.yedam;

public class Student {
	// 필드
	private String studentNo;
	private String studentName;
	private int eScore;
	private int mScore;

	public Student(String studentNo, String studentName, int eScore, int mScore) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.eScore = eScore;
		this.mScore = mScore;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int geteScore() {
		return eScore;
	}

	public void seteScore(int eScore) {
		this.eScore = eScore;
	}

	public int getmScore() {
		return mScore;
	}

	public void setmScore(int mScore) {
		this.mScore = mScore;
	}

	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", studentName=" + studentName + ", eScore=" + eScore + ", mScore="
				+ mScore + "]";
	}

}
