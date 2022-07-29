package com.njpi.xyh.sgblog.controller.admin;

import com.njpi.xyh.sgblog.result.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: xyh
 * @create: 2022/7/29 20:56
 */
@Api(tags = "文章管理")
@RestController
@RequestMapping("admin/article")
public class AdminArticleController {

    @GetMapping("hello")
    @ApiOperation("测试接口")
    public ResponseResult hello(){
        return  ResponseResult.success("测试成功");
    }

}
