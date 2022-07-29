package com.njpi.xyh.sgblog.controller.blog;

import com.njpi.xyh.sgblog.result.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 前端 文章接口
 * @author: xyh
 * @create: 2022/7/29 20:35
 */
@Api(tags = "文章管理")
@RestController
@RequestMapping("blog/article")
public class BlogArticleController {

    @ApiOperation("测试接口")
    @GetMapping("hello")
    public ResponseResult hello(){
        return  ResponseResult.success("测试成功");
    }

}
