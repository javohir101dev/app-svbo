package appsvbo.entity.body.ffffofFields.ff26Fields;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * ACCOUNT_INIT_BLOCK
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FF36 {

    /**
     * Account number
     */
    private String DF8033;

    /**
     * Account Type
     */
    private List<DF8035> df8035;

    /**
     * Currency Code (List of Values)
     */
    private String DF8034;

}
