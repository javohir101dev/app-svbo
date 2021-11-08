package appsvbo;

import appsvbo.entity.Dto;
import appsvbo.entity.body.FFFF0F;
import appsvbo.entity.body.ffffofFields.FF26;
import appsvbo.entity.body.ffffofFields.FF2E;
import appsvbo.entity.body.ffffofFields.FF8002;
import appsvbo.entity.body.ffffofFields.FF8003;
import appsvbo.entity.body.ffffofFields.ff26Fields.DF8035;
import appsvbo.entity.body.ffffofFields.ff26Fields.FF36;
import appsvbo.entity.body.ffffofFields.ff26Fields.FF37;
import appsvbo.entity.body.ffffofFields.ff2eFields.DF8000;
import appsvbo.entity.body.ffffofFields.ff8002Fields.DF800D;
import appsvbo.entity.body.ffffofFields.ff8002Fields.DF801E;
import appsvbo.entity.body.ffffofFields.ff8002Fields.FF22;
import appsvbo.entity.body.ffffofFields.ff8002Fields.FF2A;
import appsvbo.entity.body.ffffofFields.ff8003Fields.DF8113;
import appsvbo.entity.body.ffffofFields.ff8003Fields.DF8114;
import appsvbo.entity.body.ffffofFields.ff8003Fields.FF8004;
import appsvbo.entity.body.ffffofFields.ff8003Fields.FF8005;
import appsvbo.entity.header.FF45;
import appsvbo.entity.header.ff45Fields.FF49;
import appsvbo.entity.trailer.FF46;
import appsvbo.entity.trailer.ff46Fields.FF4A;
import appsvbo.service.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class AppSvboApplication {

    public static void main(String[] args) {

        SpringApplication.run(AppSvboApplication.class, args);

        Map<String, Dto> dataFlow = new HashMap<>();
        Dto dto = new Dto();
        dataFlow.put("1", dto);

//        todo  Header fields setting

        FF45 header = new FF45();
        dto.setHeader(header);


//        File Header Block
        FF49 ff49 = new FF49();
        header.setFf49(ff49);

//        File Type
        ff49.setDF807D("FTYPIIA");

//        File Date
        ff49.setDF807C("01.02.2021_17:25:57");

//        Institution Number
        ff49.setDF8079("9051");

//        Agent Code
        ff49.setDF807A("0981");



//        todo trailer fields setting
        FF46 trailer = new FF46();
        dto.setTrailer(trailer);

//        File Trailer Block
        FF4A ff4A = new FF4A();
        trailer.setFf4a(ff4A);

//        Number of records
        ff4A.setDF807E("2");



//        todo set body fields
        FFFF0F body = new FFFF0F();
        dto.setBody(body);

//        MAIN_BLOCK
        FF2E ff2E = new FF2E();
        body.setFf2e(ff2E);

//        List<Application Type> DB Field app_type
        ff2E.setDf8000(List.of(new DF8000("BTRT51")));


//        Contract ID
        ff2E.setDF8002("9051");

//        Officer ID
        ff2E.setDF803F("BANK29");

//        MERCHANT_BLOCK
        FF8003 ff8003 = new FF8003();
        body.setFf8003(ff8003);


//        MERCHANT_LEVEL_BLOCK
        FF8005 ff8005 = new FF8005();
        ff8003.setFf8005(ff8005);

//        Merchant Entity ID
        ff8005.setDF8117("90510014147");

//        Merchant Registered Name
        ff8005.setDF8118("MCHJ MUBINA AL BARAKA BIZN");

//        Merchant Trading Name
        ff8005.setDF8119("MCHJ MUBINA AL BARAKA BIZN");

//        MCC Code
        ff8005.setDF811A("5995");

//        CONTRACT_DETAILS_BLOCK
        FF8004 ff8004 = new FF8004();
        ff8003.setFf8004(ff8004);

//        Default Account Number
        ff8004.setDF810F("0098120208000905335456001");

//        Account Transactions Flag
        ff8004.setDf8113(List.of(new DF8113("503401")));

//        Legal ID Type
        ff8004.setDf8114(List.of(new DF8114("500601")));

//        Legal Information
        ff8004.setDF8115("Unknown");

//        CONTACT_INFORMATION_BLOCK
        FF8002 ff8002 = new FF8002();
        body.setFf8002(ff8002);

//        PERSON_BLOCK
        FF22 ff22 = new FF22();
        ff8002.setFf22(ff22);

//        First Name
        ff22.setDF8019("MUXABBAT");

//        Surname
        ff22.setDF801B("ERGASHEVA");

//        Position
        ff22.setDf800d(List.of(new DF800D("120800")));

//        PERSON_ADDRESS_BLOCK
        FF2A ff2A = new FF2A();
        ff8002.setFf2a(ff2A);

//        Address Type:
        ff2A.setDf801e(List.of(new DF801E("ADDR0")));

//        Address Line 1
        ff2A.setDF8020("Address Line 1");


//        ACCOUNT_BLOCK
        FF26 ff26 = new FF26();
        body.setFf26(ff26);

//        ACCOUNT_BLOCK
        FF36 ff36 = new FF36();
        ff26.setFf36(ff36);

//        Account number
        ff36.setDF8033("0098120208000905335456001");

//        Account Type
        ff36.setDf8035(List.of(new DF8035("502401")));

//        Currency Code (List of Values)
        ff36.setDF8034("860");

//        ACCOUNT_DATA_BLOCK
        FF37 ff37 = new FF37();
        ff26.setFf37(ff37);


//       new ObjectToJson<>().toObjectMethod(dto);

//        ObjectToXmlFile.parseObjectToXmlFile(dto);
//
//        Dto dto1 = XmlFIleToObject.xmlToJavaObject();

//        System.out.println(dto1);
//        System.out.println(dto);
//
//        ObjectToJsonFile.objectToJsonFile(dto);

//        Dto dto1 = JsonFileToObject.fromJsonFileToObject();
//        System.out.println(dto);
//        System.out.println(dto1);
//        System.out.println(dto.equals(dto1));

//        XxmlFIleToJsonFIle.xmlFileToJsonFile();

    }




}
