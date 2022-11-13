package org.zxbro.tms.api.task;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zxbro.tms.api.model.Result;

/**
 * @author : yu.zhang
 * @date : 2022/10/20 7:42 PM
 * Email : zephyrjung@126.com
 **/
@RestController
@RequestMapping("/task")
public class TaskController {
    @PostMapping("/update")
    public Result taskUpdate() {
        return null;
    }
}
