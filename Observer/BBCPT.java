package Observer;

public class BBCPT extends Observer{
	
	public BBCPT(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update(Code code) {
		if(code.toString().equals("PT"))
		System.out.println( code.toString()+ " | BBC Novas Notícias: " + subject.getNews()); 
	}

}
