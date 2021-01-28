package info.bonian.emperor.server.generator;

import info.bonian.emperpr.core.pojo.Result;

/**
 * @author here
 * @date 2021/1/28 2:08 下午
 */
public interface IDGen {

    /**
     * 获取ID
     * @param key 传递参数
     * @return 获取结果
     */
    Result get(String key);

    /**
     * 进行初始化，并判断是否成功
     * @return 初始化结果
     */
    boolean init();
}
