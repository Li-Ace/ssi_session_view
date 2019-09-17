package com.elum.session.service.impl;

import com.elum.session.entity.AdBlacklist;
import com.elum.session.entity.Top10Category;
import com.elum.session.service.AdBlacklistService;
import com.elum.session.service.Top10CategoryService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
@Service("Top10CategoryService")
public class Top10CategoryServiceImpl extends BaseServiceImpl<Top10Category> implements Top10CategoryService {
}