package Observer;
import Observer.Observer.Code;
public class Observer_Main {

	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub

		 Subject subject = Subject.getInstance();
		
		 
	      new BBCTR(subject);
	      new BBCIT(subject);
	      new BBCPT(subject);
	            
	      System.out.println("Türkçe haber eklendi.");	
	      subject.setNews("Amerikan Wall Street Journal (WSJ) gazetesi “Ekonominin üzerine salgının ağırlığı çökerken, Türkiye döviz krizini önlemeye çalışıyor” başlıklı haberinde, “Ankara'nın koronavirüs krizi başlamadan aylar önce, Türk Lirası'nı güçlendirmek için döviz piyasasında milyarlarca dolar harcadığını” yazdı.", Code.TR);
	      System.out.println("Notícias em português adicionadas.");	
	      subject.setNews("Perto da Estação de Marechal Hermes da Supervia, o comerciante Ademar de Barros Moreira aproveita o sucesso de seu empreendimento No Dia Mundial da Batata Frita, celebrado nesta terça-feira (30), ele desconhece crise em um negócio que começou a empreender há 30 anos, quando investiu o equivalente a R$ 8 para comprar um saco do tubérculo para fritar, depois de várias tentativas de comércio de rua. Atualmente, Ademar chega a vender uma tonelada do produto em uma noite e tem o carrinho de batatas fritas mais famoso do Rio." , Code.PT);
	      System.out.println("Aggiunte notizie italiane.");	
	      subject.setNews("“Roma non è asismica ha una pericolosità più bassa del resto dell’Appennino, ma non ha di sicuro un’edilizia anti-sismica. Perché dal 3° si arrivi al 5° ci vuole poco, uno scarto di centimetri sul sismografo”. A dirlo sulle pagine del Corriere della Sera è il presidente dell’Istituto Nazionale di Geofisica e Vulcanologia (Ingv) Carlo Doglioni." , Code.IT);
	      
	}

}
