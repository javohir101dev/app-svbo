package appsvbo.service;

import appsvbo.entity.Dto;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;

public class ObjectToXmlFile {

    public static void parseObjectToXmlFile(Dto dto) {
        try {
//            Marshalling

            JAXBContext jaxbContext = JAXBContext.newInstance(Dto.class);

            Marshaller marshaller = jaxbContext.createMarshaller();

            String path = "src/main/resources/xmlFiles/objectXmlFile.xml";
            File objectXMLFile = new File(path);

            marshaller.marshal(dto, objectXMLFile);
            System.out.println("XML file is created: " + path);

        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
