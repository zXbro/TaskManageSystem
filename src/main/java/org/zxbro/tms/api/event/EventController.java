package org.zxbro.tms.api.event;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zxbro.tms.api.model.Result;

/**
 * @author : yu.zhang
 * @date : 2022/10/20 7:41 PM
 * Email : zephyrjung@126.com
 **/
@RestController
@RequestMapping("/event")
public class EventController {
    @GetMapping("/list")
    public Result eventList() {
        return null;
    }

    @GetMapping("/query")
    public Result eventQuery() {
        return null;
    }

    @PostMapping("/add")
    public Result eventAdd() {
        return null;
    }

    @PostMapping("/edit")
    public Result eventEdit() {
        return null;
    }
}
