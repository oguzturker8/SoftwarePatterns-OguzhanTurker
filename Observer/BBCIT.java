package Observer;


public class BBCIT extends Observer{
	
	public BBCIT(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update(Code code) {
		if(code.toString().equals("IT"))
		System.out.println( code.toString()+ " | BBC nuove notizie " + subject.getNews()); 
	}
	
}
