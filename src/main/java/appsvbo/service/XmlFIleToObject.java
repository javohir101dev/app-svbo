package appsvbo.service;

import appsvbo.entity.Dto;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XmlFIleToObject {

    public static Dto xmlToJavaObject() {

        try {
            String path = "src/main/resources/objectXmlFIle.xml";
            File xmlFile = new File(path);

            JAXBContext jaxbContext = JAXBContext.newInstance(Dto.class);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            Dto student = (Dto) unmarshaller.unmarshal(xmlFile);

            System.out.println("Xml file is unmarshalled : " + path);

            return student;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
