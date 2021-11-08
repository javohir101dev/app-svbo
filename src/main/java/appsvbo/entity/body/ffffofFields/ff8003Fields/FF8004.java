package appsvbo.entity.body.ffffofFields.ff8003Fields;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * CONTRACT_DETAILS_BLOCK
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FF8004 {

    /**
     * Default Account Number (Alphadigit field, Mandatory)
     */
    private String DF810F;

    /**
     * Account Transactions Flag (Alphadigit field, Mandatory)
     */
    private List<DF8113> df8113;

    /**
     * Legal ID Type (Alphadigit field, Mandatory)
     */
    private List<DF8114> df8114;

    /**
     * Legal Information
     */
    private String DF8115;




}
