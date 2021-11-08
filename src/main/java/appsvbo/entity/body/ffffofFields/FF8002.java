package appsvbo.entity.body.ffffofFields;

import appsvbo.entity.body.ffffofFields.ff8002Fields.FF22;
import appsvbo.entity.body.ffffofFields.ff8002Fields.FF2A;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * CONTACT_INFORMATION_BLOCK
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FF8002 {

    /**
     * PERSON_BLOCK
     */
    private FF22 ff22;

    /**
     *PERSON_ADDRESS_BLOCK
     */
    private FF2A ff2a;




}
