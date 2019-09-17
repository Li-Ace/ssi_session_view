package com.elum.session.controller;

import com.elum.session.entity.AdBlacklist;
import com.elum.session.entity.AdClickTrend;
import com.elum.session.entity.Page;
import com.elum.session.service.AdBlacklistService;
import com.elum.session.service.AdClickTrendService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/adClickTrend")
public class AdClickTrendAction extends BaseAction {

    @Resource
    public AdClickTrendService adClickTrendService;

    @RequestMapping("/selectPageUseDyc")
    @ResponseBody
    public Object selectPageUseDyc(Page<AdClickTrend> page, AdClickTrend adClickTrend) throws Exception {
        page.setParamEntity(adClickTrend);
        Page<AdClickTrend> adClickTrendPage = adClickTrendService.selectPageUseDyc(page);
        return adClickTrendPage.getPageMap();
    }
}