package appsvbo.entity;

import appsvbo.entity.body.FFFF0F;
import appsvbo.entity.header.FF45;
import appsvbo.entity.trailer.FF46;
import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement
public class Dto {

    private FFFF0F body;

    private FF45 header;

    private FF46 trailer;

}
