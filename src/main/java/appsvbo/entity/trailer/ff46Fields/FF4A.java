package appsvbo.entity.trailer.ff46Fields;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * File Trailer Block
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FF4A {

    /**
     * Number of records (Numeric field, Mandatory)
     */
    private String DF807E;

//    /**
//     * CRC  (Alphadigit field, Optional)
//     */
//    private String DF8060;

}
