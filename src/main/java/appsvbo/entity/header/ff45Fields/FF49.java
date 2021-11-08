package appsvbo.entity.header.ff45Fields;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * File Header Block
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FF49 {

    /**
     * File Type (Alphadigit field, Mandatory)
     */
    private String DF807D;

    /**
     * File Date (Alphadigit field, Mandatory)
     */
    private String DF807C;

    /**
     * Institution Number (Alphadigit field, Mandatory)
     */
    private String DF8079;

    /**
     * Agent Code (Alphadigit field, Mandatory)
     */
    private String DF807A;

}