package appsvbo.entity.body.ffffofFields;

import appsvbo.entity.body.ffffofFields.ff2eFields.DF8000;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * MAIN_BLOCK
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FF2E {

//    /**
//     * Application ID (Numeric field, Optional)
//     */
//    private long DF8041;

    /**
     * List<Application Type> DB Field app_type
     */
    private List<DF8000> df8000;
//    private String DF8000;

//    /**
//     * Record Number (Alphadigit field, Optional)
//     */
//    private String DF8001;

    /**
     * Contract ID (Alphadigit field, Mandatory)
     */
    private String DF8002;


//    /**
//     * List<Reject Code> DB Field app_type
//     */
//    private List<DF803D> df803d;

//    /**
//     * List<Application Source> (Alphadigit field, Optional) DB Field app_type
//     */
//    private List<DF803E> df803e;

    /**
     * Officer ID (Alphadigit field, Mandatory)
     */
    private String DF803F;

//    /**
//     * Application Letter Scheme (Alphadigit field, Optional)
//     */
//    private String DF8040;

}
