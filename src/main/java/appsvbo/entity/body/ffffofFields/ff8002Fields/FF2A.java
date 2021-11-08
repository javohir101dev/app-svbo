package appsvbo.entity.body.ffffofFields.ff8002Fields;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * PERSON_ADDRESS_BLOCK
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FF2A {

    /**
     * Address Type:
     */
    private List<DF801E> df801e;

    /**
     * Address Line 1
     */
    private String DF8020;




}
