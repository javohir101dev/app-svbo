package appsvbo.service;

import org.json.JSONObject;
import org.json.XML;

import java.io.*;

public class XxmlFIleToJsonFIle {



    public static void xmlFileToJsonFile() {

        int PRETTY_FACTOR = 4;

        String jsonFileName = "src/main/resources/jsonFiles/objectCreated.json";

        try {
            File xmlFile = new File("src/main/resources/objectXmlFIle.xml");
            InputStream inputStream = new FileInputStream(xmlFile);
            StringBuilder builder = new StringBuilder();
            int ptr;
            while ((ptr = inputStream.read()) != -1) {
                builder.append((char) ptr);
            }

            String xml = builder.toString();
            JSONObject jsonObj = XML.toJSONObject(xml);
            System.out.print(jsonObj);
            FileWriter fileWriter =
                    new FileWriter(jsonFileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                    new BufferedWriter(fileWriter);
            bufferedWriter.write(jsonObj.toString(PRETTY_FACTOR));
            bufferedWriter.close();
        } catch (IOException ex) {
            System.out.println(
                    "Error writing to file '"
                            + jsonFileName + "'");
            ex.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();
            e.printStackTrace();
        }
    }

}
