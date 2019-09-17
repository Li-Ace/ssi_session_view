package com.elum.session.controller;

import com.elum.session.entity.AdBlacklist;
import com.elum.session.entity.Page;
import com.elum.session.entity.Top10Session;
import com.elum.session.service.AdBlacklistService;
import com.elum.session.service.Top10SessionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/top10Session")
public class Top10SessionAction extends BaseAction {

    @Resource
    public Top10SessionService top10SessionService;

    @RequestMapping("/selectPageUseDyc")
    @ResponseBody
    public Object selectPageUseDyc(Page<Top10Session> page, Top10Session top10Session) throws Exception {
        page.setParamEntity(top10Session);
        Page<Top10Session> top10SessionPage = top10SessionService.selectPageUseDyc(page);
        return top10SessionPage.getPageMap();
    }

}