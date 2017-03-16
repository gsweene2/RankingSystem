import java.awt.List;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class HTMLParser {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document htmlFile = null;
		String title;
		try{
			htmlFile = Jsoup.connect("https://www.juniorgolfscoreboard.com/smtresultscourse.asp?TID=43404").get();
		}catch (IOException e){
			e.printStackTrace();
		}
		
		//Elements names = htmlFile.getElementsByClass("NAME");
		
		//System.out.println("input html:"+htmlFile);
		
		//Elements name = htmlFile.select("body");
		
		//String test = name.html();
		
		System.out.println("----------------------------------------------------------------------------------------------------------");
		//System.out.print(test);
		
		/*
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
		*/
		
		String entireDoc = htmlFile.toString();
		entireDoc = entireDoc.replaceAll("<span style=\"color:red\">","");
		entireDoc = entireDoc.replaceAll("</span>","");
		entireDoc = entireDoc.replaceAll("data-title=\"NAME\">","V- ");
		entireDoc = entireDoc.replaceAll("data-title=\"CITY/STATE\" class=\"numeric\">","V- ");
		entireDoc = entireDoc.replaceAll("data-title=\"COUNTRY\" class=\"hidden\">","V- ");
		entireDoc = entireDoc.replaceAll("data-title=\"GRADYR\" class=\"numeric\" align=\"right\">","V- ");
		entireDoc = entireDoc.replaceAll("align=\"right\" data-title=\"SCORES\" class=\"numeric\">","V- ");
		entireDoc = entireDoc.replaceAll("align=\"right\" data-title=\"TOTAL\" class=\"numeric\">","V- ");
		entireDoc = entireDoc.replaceAll("align=\"center\" data-title=\"PLACE\" class=\"numeric\">","V- ");
		entireDoc = entireDoc.replaceAll("</td>","");
		entireDoc = entireDoc.replaceAll("<td","");
		entireDoc = entireDoc.replaceAll("<tr bgcolor=\"#e5e2e2\">", "");
		entireDoc = entireDoc.replaceAll("<tr bgcolor=\"#ffffff\">", "");
		entireDoc = entireDoc.replaceAll("</tr>", "");
		entireDoc = entireDoc.replaceAll("&nbsp;","|");
		entireDoc = entireDoc.replaceAll("colspan=\"7\"><h5 style=\"color:#000000\">","V- ");
		entireDoc = entireDoc.replaceAll("colspan=\"5\" class=\"top\"><h3 class=\"red\">","V- ");
		entireDoc = entireDoc.replaceAll("2016","2016 V- ");
		entireDoc = entireDoc.replaceAll("</h3> <h4 class=\"green\">","|");
		entireDoc = entireDoc.replaceAll("</h4> <h4 class=\"green\">", "|");
		entireDoc = entireDoc.replaceAll("</h4><br> <b>","");
		entireDoc = entireDoc.replaceAll("</h5>","");
		//System.out.println(entireDoc);
		String[] splitData = entireDoc.split("\n");
		
		for(int n=0; n<splitData.length; n++){
			//System.out.println(splitData[n]);
		}
			
		
		System.out.println("Total Length: "+ splitData.length);
		List condensedData = new List();
		//if(splitData[j].contains(" T ") || !(splitData[j].contains("<") || splitData[j].contains(">")) || splitData[j].contains("Boys Age") || splitData[j].contains("Girls Age") || splitData[j].contains("h3")){
		
		for(int j=0; j<splitData.length; j++){
			if(splitData[j].contains("V- ")){
				if(!splitData[j].trim().equals("")){
					condensedData.add(splitData[j].trim());
				
				
				//System.out.println("PASS: "+splitData[j].trim());
				}
			}else{
				//System.out.println("FAIL: "+splitData[j]);
			}
		}
		//System.out.println("Hey");
		//System.out.println("Condensed Count: " + condensedData.getItemCount());
		
		//now were going to go through data and create an object for every player appearance
		
		//afterward, we will use objects to load data into the db. 
		
		
		
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String database = 
              "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=RankingSystem.mdb;";
            Connection conn = DriverManager.getConnection(database, "", "");
            Statement s = conn.createStatement();
		}catch(Exception ex){
			System.out.println("D'OH - DATABASE CONNECTION DID NOT WORK");
		}
	}
}
