package jeeno.example.springbootaopselfannotation.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Jeeno
 * @version 1.0.0
 * @date 2019/10/29 23:09
 */
@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserDO {
    private String name;
    private Integer age;
}
