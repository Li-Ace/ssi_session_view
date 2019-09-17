package com.elum.session.service.impl;

import com.elum.session.entity.AdBlacklist;
import com.elum.session.entity.AdStat;
import com.elum.session.service.AdBlacklistService;
import com.elum.session.service.AdStatService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
@Service("AdStatService")
public class AdStatServiceImpl  extends BaseServiceImpl<AdStat> implements AdStatService {
}