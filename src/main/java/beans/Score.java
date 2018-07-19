package beans;

public class Score {
	private String studentId;
	private String courseId;
	private int grade;
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public Score() {
		
	}
	public Score(String studentId, String courseId, int grade) {
		super();
		this.studentId = studentId;
		this.courseId = courseId;
		this.grade = grade;
	}
	

}
