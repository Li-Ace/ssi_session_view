package com.elum.session.service.impl;


import com.elum.session.entity.Task;

import com.elum.session.service.TaskService;
import org.springframework.stereotype.Service;


@Service("TaskService")
public class TaskServiceImpl extends BaseServiceImpl<Task> implements TaskService {
}