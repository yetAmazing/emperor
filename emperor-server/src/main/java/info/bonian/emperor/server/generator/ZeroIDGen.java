package info.bonian.emperor.server.generator;

import info.bonian.emperpr.core.pojo.Result;

/**
 * @author here
 * @date 2021/1/28 2:30 下午
 */
public class ZeroIDGen implements IDGen{

    @Override
    public Result get(String key) {
        return Result.ok();
    }

    @Override
    public boolean init() {
        return true;
    }
}
