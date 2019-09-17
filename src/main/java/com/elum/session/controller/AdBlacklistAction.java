package com.elum.session.controller;

import com.elum.session.entity.AdBlacklist;
import com.elum.session.entity.Page;
import com.elum.session.service.AdBlacklistService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/adBlackList")
public class AdBlacklistAction extends BaseAction {

    @Resource
    public AdBlacklistService adBlackListService;

    @RequestMapping("/selectPageUseDyc")
    @ResponseBody
    public Object selectPageUseDyc(Page<AdBlacklist> page, AdBlacklist adBlacklist) throws Exception {
        page.setParamEntity(adBlacklist);
        Page<AdBlacklist> adBlacklistPage = adBlackListService.selectPageUseDyc(page);
        return adBlacklistPage.getPageMap();
    }

}
