package info.bonian.emperpr.core.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author here
 * @date 2021/1/28 1:10 下午
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CheckVO implements Serializable {

    private long timestamp;

    private int workID;
}
