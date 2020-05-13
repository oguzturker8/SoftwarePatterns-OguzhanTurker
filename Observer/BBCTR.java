package Observer;

public class BBCTR extends Observer{

	public BBCTR(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update(Code code) {
		if(code.toString().equals("TR"))
		System.out.println( code.toString()+ " | BBC Yeni Haber: " + subject.getNews()); 
	}
}
