package info.bonian.emperor.server.service;

import info.bonian.emperor.server.generator.IDGen;
import info.bonian.emperpr.core.pojo.Result;
import org.springframework.stereotype.Service;

/**
 * @author here
 * @date 2021/1/28 2:46 下午
 */
@Service("SnowflakeService")
public class SnowflakeService {

    private IDGen idGen;

    public Result getId(String key){
        return idGen.get(key);
    }
}
