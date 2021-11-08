package appsvbo.entity.header;

import appsvbo.entity.header.ff45Fields.FF49;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Application File Header
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class FF45 {

    /**
     * File Header Block (Alphadigit field, Mandatory)
     */
    private FF49 ff49;

}
