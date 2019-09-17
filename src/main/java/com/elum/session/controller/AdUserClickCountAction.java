package com.elum.session.controller;

import com.elum.session.entity.AdBlacklist;
import com.elum.session.entity.AdUserClickCount;
import com.elum.session.entity.Page;
import com.elum.session.service.AdBlacklistService;
import com.elum.session.service.AdUserClickCountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/adBlackList")
public class AdUserClickCountAction extends BaseAction {

    @Resource
    public AdUserClickCountService adUserClickCountService;

    @RequestMapping("/selectPageUseDyc")
    @ResponseBody
    public Object selectPageUseDyc(Page<AdUserClickCount> page, AdUserClickCount adUserClickCount) throws Exception {
        page.setParamEntity(adUserClickCount);
        Page<AdUserClickCount> adUserClickCountPage = adUserClickCountService.selectPageUseDyc(page);
        return adUserClickCountPage.getPageMap();
    }
}