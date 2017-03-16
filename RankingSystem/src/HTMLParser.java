import java.awt.List;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class HTMLParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document htmlFile = null;
		String title;
		try{
			htmlFile = Jsoup.connect("https://www.juniorgolfscoreboard.com/smtresultscourse.asp?TID=43404").get();
		}catch (IOException e){
			e.printStackTrace();
		}
		
		Elements names = htmlFile.getElementsByClass("NAME");
		
		//System.out.println("input html:"+htmlFile);
		
		Elements name = htmlFile.select("td");
		
		String test = name.html();
		
		System.out.println("----------------------------------------------------------------------------------------------------------");
		//System.out.print(test);
		
		Integer sizeArray = name.size();
		List allElements = new List();
		System.out.print("Size: " + sizeArray);
		for (Element element : name) {
			if(!element.ownText().equals("")){
		    allElements.add(element.ownText());
			}
		}
		for(int i = 0; i<100; i++){
			System.out.println(allElements.getItem(i));
		}
		
	}

}
