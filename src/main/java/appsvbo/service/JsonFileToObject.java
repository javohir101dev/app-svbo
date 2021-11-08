package appsvbo.service;

import appsvbo.entity.Dto;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class JsonFileToObject {

    public static Dto fromJsonFileToObject() {

        try {
            ObjectMapper mapper = new ObjectMapper();

            String path = "src/main/resources/object.json";
            Dto dto = mapper.readValue(new File(path), Dto.class);
            return dto;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }

}
