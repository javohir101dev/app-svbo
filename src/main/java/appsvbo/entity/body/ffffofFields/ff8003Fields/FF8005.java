package appsvbo.entity.body.ffffofFields.ff8003Fields;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * MERCHANT_LEVEL_BLOCK
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FF8005 {

    /**
     * Merchant Entity ID (Alphadigit field, Mandatory)
     */
    private String DF8117;

    /**
     * Merchant Registered Name (Alphadigit field, Mandatory)
     */
    private String DF8118;

    /**
     * Merchant Trading Name (Alphadigit field, Mandatory)
     */
    private String DF8119;

    /**
     * MCC Code (List of Values)
     */
    private String DF811A;

}

