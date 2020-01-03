package hibernate23;

import java.util.List;

public class Question {
	
	private int id;
	private String qname;
	private List<String> answer;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public List<String> getAnswer() {
		return answer;
	}
	public void setAnswer(List<String> answer) {
		this.answer = answer;
	}

	
	public Question(int id, String qname, List<String> answer) {
		super();
		this.id = id;
		this.qname = qname;
		this.answer = answer;
	}
	public Question(String qname, List<String> answer) {
		super();
		this.qname = qname;
		this.answer = answer;
	}
	public Question() {
		super();
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", qname=" + qname + ", answer=" + answer + "]";
	}

	
	

}
