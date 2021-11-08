package appsvbo.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ObjectToJson<T> {

    public  void toObjectMethod(T object){
        GsonBuilder gsonBuilder=new GsonBuilder();
        Gson gson=gsonBuilder.setPrettyPrinting().create();

        String dtoJson =gson.toJson(object);
        System.out.println(dtoJson);
    }

}
