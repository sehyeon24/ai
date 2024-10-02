package dto;

public class Job {
	private	int		jno;
	private String	jname;
	public Job(int jno, String jname) {
		this.jno = jno;
		this.jname = jname;
	}
	@Override
	public String toString() {
		return jno + "\t" + jname;
	}
	public int getJno() {
		return jno;
	}
	public void setJno(int jno) {
		this.jno = jno;
	}
	public String getJname() {
		return jname;
	}
	public void setJname(String jname) {
		this.jname = jname;
	}
	
}
