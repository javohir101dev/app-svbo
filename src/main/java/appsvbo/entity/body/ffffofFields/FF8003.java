package appsvbo.entity.body.ffffofFields;

import appsvbo.entity.body.ffffofFields.ff8003Fields.FF8004;
import appsvbo.entity.body.ffffofFields.ff8003Fields.FF8005;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * MERCHANT_BLOCK
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FF8003 {

    /**
     * MERCHANT_LEVEL_BLOCK (Alphadigit field, Mandatory)
     */
    private FF8005 ff8005;

    /**
     *CONTRACT_DETAILS_BLOCK (Alphadigit field, Mandatory)
     */
    private FF8004 ff8004;

}
