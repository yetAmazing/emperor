package info.bonian.emperor.server.controller;

import info.bonian.emperor.server.exception.LeafServerException;
import info.bonian.emperor.server.service.SegmentService;
import info.bonian.emperor.server.service.SnowflakeService;
import info.bonian.emperpr.core.pojo.Result;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author here
 * @date 2021/1/28 2:11 下午
 */
@RestController
@RequestMapping("/generator")
public class LeafController {

    private final SegmentService segmentService;

    private final SnowflakeService snowflakeService;

    public LeafController(SegmentService segmentService, SnowflakeService snowflakeService) {
        this.segmentService = segmentService;
        this.snowflakeService = snowflakeService;
    }

    @RequestMapping(value = "/segment/get/key")
    public Result getSegmentId(@PathVariable("key") String key) {
        return get(key, segmentService.getId(key));
    }

    @RequestMapping(value = "/snowflake/get/key")
    public Result getSnowflakeId(@PathVariable("key") String key) {
        return get(key, snowflakeService.getId(key));
    }

    private Result get(@PathVariable("key") String key, Result result) {
        if (key == null || key.isEmpty()) {
            return Result.fail("【 key 】不能为空");
        }

        if (!result.isSuccess()) {
            throw new LeafServerException(result.toString());
        }
        return result;
    }
}
