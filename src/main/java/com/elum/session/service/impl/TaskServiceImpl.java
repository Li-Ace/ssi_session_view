package com.elum.session.service.impl;

import com.elum.session.entity.AdBlacklist;
import com.elum.session.entity.Task;
import com.elum.session.service.AdBlacklistService;
import com.elum.session.service.TaskService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
@Service("TaskService")
public class TaskServiceImpl extends BaseServiceImpl<Task> implements TaskService {
}