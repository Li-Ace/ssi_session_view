package com.elum.session.controller;

import com.elum.session.entity.AdBlacklist;
import com.elum.session.entity.Page;
import com.elum.session.entity.Task;
import com.elum.session.service.AdBlacklistService;
import com.elum.session.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/task")
public class TaskAction extends BaseAction {

    @Resource
    public TaskService taskService;

    @RequestMapping("/selectPageUseDyc")
    @ResponseBody
    public Object selectPageUseDyc(Page<Task> page, Task task) throws Exception {
        page.setParamEntity(task);
        Page<Task> taskPage = taskService.selectPageUseDyc(page);
        return taskPage.getPageMap();
    }
}