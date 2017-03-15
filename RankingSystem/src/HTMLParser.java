import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class HTMLParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document htmlFile = null;
		String title;
		try{
			htmlFile = Jsoup.connect("").get();
		}catch (IOException e){
			e.printStackTrace();
		}
		
		Elements names = htmlFile.getElementsByClass("NAME");
		
		System.out.println("input html:"+htmlFile);
		
	}

}
