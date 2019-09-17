package com.elum.session.service.impl;

import com.elum.session.entity.AdBlacklist;
import com.elum.session.entity.CityInfo;
import com.elum.session.service.AdBlacklistService;
import com.elum.session.service.CityInfoService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
@Service("CityInfoService")
public class CityInfoServiceImpl  extends BaseServiceImpl<CityInfo> implements CityInfoService {
}