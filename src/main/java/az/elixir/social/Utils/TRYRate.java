package az.elixir.social.Utils;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class TRYRate {

    public double getTryRate(){
        double result = 0;
        try {

            String format="xml";
            String url = "https://www.cbar.az/currencies/23.07.2021.xml";
            System.out.println(url);
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            int responseCode = con.getResponseCode();
            System.out.println("Response Code : " + responseCode);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            //print in String
            // System.out.println(response.toString());
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                    .parse(new InputSource(new StringReader(response.toString())));
            NodeList errNodes = doc.getElementsByTagName("Valute");
            if (errNodes.getLength() > 0) {
                for(int i =0;i<errNodes.getLength();i++) {
                    Element err = (Element) errNodes.item(i);
                    if(err.getAttribute("Code").equals("TRY")) {
                     result =  Double.parseDouble( err.getElementsByTagName("Value").item(0).getTextContent());
                    }
                }
            } else {
                // success
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return result;
    }

}
