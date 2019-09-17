package com.elum.session.controller;

import com.elum.session.entity.AdBlacklist;
import com.elum.session.entity.AdStat;
import com.elum.session.entity.Page;
import com.elum.session.service.AdBlacklistService;
import com.elum.session.service.AdStatService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/adStat")
public class AdStatAction extends BaseAction {

    @Resource
    public AdStatService adStatService;

    @RequestMapping("/selectPageUseDyc")
    @ResponseBody
    public Object selectPageUseDyc(Page<AdStat> page, AdStat adStat) throws Exception {
        page.setParamEntity(adStat);
        Page<AdStat> adStatPage = adStatService.selectPageUseDyc(page);
        return adStatPage.getPageMap();
    }
}