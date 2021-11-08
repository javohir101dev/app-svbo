package appsvbo.entity.body.ffffofFields.ff8002Fields;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * PERSON_BLOCK
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FF22 {

    /**
     * First Name
     */
    private String DF8019;

    /**
     * Surname
     */
    private String DF801B;

    /**
     * Position
     */
    private List<DF800D> df800d;




}
