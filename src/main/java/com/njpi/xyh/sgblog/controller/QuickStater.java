package com.njpi.xyh.sgblog.controller;

import com.njpi.xyh.sgblog.result.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: xyh
 * @create: 2022/7/29 16:09
 */
@Api(tags = "sgblog 快速开发测试接口")
@RestController
public class QuickStater {

    @GetMapping("quick")
    @ApiOperation("测试方法")
    public ResponseResult quick() {
        return ResponseResult.success();
    }

    @GetMapping("sum")
    @ApiOperation("两个数之和")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "a", value = "第一个数字", required = true,dataTypeClass = Integer.class),
                    @ApiImplicitParam(name = "b", value = "第二个数字", required = true,dataTypeClass = Integer.class)
            }
    )
    public ResponseResult sum(Integer a, Integer b) {
        return ResponseResult.success(a + b);
    }
}
