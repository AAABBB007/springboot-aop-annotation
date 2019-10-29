package jeeno.example.springbootaopselfannotation.pojo;

import lombok.Builder;
import lombok.Data;

/**
 * @author Jeeno
 * @version 1.0.0
 * @date 2019/10/29 23:09
 */
@Data
@Builder
public class ReturnDTO<T> {
    private T data;
    private String message;
    private Boolean status;
}
