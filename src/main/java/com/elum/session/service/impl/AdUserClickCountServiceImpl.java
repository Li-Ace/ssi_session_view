package com.elum.session.service.impl;

import com.elum.session.entity.AdBlacklist;
import com.elum.session.entity.AdUserClickCount;
import com.elum.session.service.AdBlacklistService;
import com.elum.session.service.AdUserClickCountService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
@Service("AdUserClickCountService")
public class AdUserClickCountServiceImpl  extends BaseServiceImpl<AdUserClickCount> implements AdUserClickCountService {
}