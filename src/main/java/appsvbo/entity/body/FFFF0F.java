package appsvbo.entity.body;

import appsvbo.entity.body.ffffofFields.FF26;
import appsvbo.entity.body.ffffofFields.FF2E;
import appsvbo.entity.body.ffffofFields.FF8002;
import appsvbo.entity.body.ffffofFields.FF8003;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Merchant Application BTRT51
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class FFFF0F {

    /**
     * MAIN_BLOCK (Alphadigit field, Mandatory)
     */
    private FF2E ff2e;

    /**
     * MERCHANT_BLOCK
     */
    private FF8003 ff8003;

    /**
     * CONTACT_INFORMATION_BLOCK
     */
    private FF8002 ff8002;

    /**
     * ACCOUNT_BLOCK
     */
    private FF26 ff26;




}
