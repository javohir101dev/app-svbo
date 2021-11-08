package appsvbo.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;

public class ObjectToJsonFile {

    public static void objectToJsonFile(Object object){
        try {

            ObjectMapper mapper = new ObjectMapper();
            mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
            // Writing to a file
            String path = "src/main/resources/object.json";
            mapper.writeValue(new File(path), object );
            System.out.println("Json file is created : " + path);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
