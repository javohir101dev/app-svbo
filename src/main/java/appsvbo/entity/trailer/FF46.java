package appsvbo.entity.trailer;

import appsvbo.entity.trailer.ff46Fields.FF4A;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Application File Trailer
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class FF46 {

    /**
     * File Trailer Block (Numeric field, Mandatory)
     */
    private FF4A ff4a;

}
