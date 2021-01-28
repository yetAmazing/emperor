package info.bonian.emperor.server.generator;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author here
 * @date 2021/1/28 1:26 下午
 */
@Data
@Component
public class LeafProperty {

    @Value("${leaf.name}")
    private String name;

    @Value("${leaf.segment.enable}")
    private boolean segmentEnable;

    @Value("${leaf.segment.url}")
    private String url;

    @Value("${leaf.segment.password}")
    private String password;

    @Value("${leaf.snowflake.enable}")
    private boolean snowflakeEnable;

    @Value("${leaf.snowflake.zk.address}")
    private String zkAddress;

    @Value("${leaf.snowflake.port}")
    private String port;
}
