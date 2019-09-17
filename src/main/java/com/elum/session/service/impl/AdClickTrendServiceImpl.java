package com.elum.session.service.impl;

import com.elum.session.entity.AdBlacklist;
import com.elum.session.entity.AdClickTrend;
import com.elum.session.service.AdBlacklistService;
import com.elum.session.service.AdClickTrendService;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service("AdClickTrendService")
public class AdClickTrendServiceImpl  extends BaseServiceImpl<AdClickTrend> implements AdClickTrendService {
}