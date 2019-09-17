package com.elum.session.controller;

import com.elum.session.entity.AdBlacklist;
import com.elum.session.entity.Page;
import com.elum.session.entity.SessionRandomExtract;
import com.elum.session.service.AdBlacklistService;
import com.elum.session.service.SessionRandomExtractService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/sessionRandomExtract")
public class SessionRandomExtractAction extends BaseAction {

    @Resource
    public SessionRandomExtractService sessionRandomExtractService;

    @RequestMapping("/selectPageUseDyc")
    @ResponseBody
    public Object selectPageUseDyc(Page<SessionRandomExtract> page, SessionRandomExtract sessionRandomExtract) throws Exception {
        page.setParamEntity(sessionRandomExtract);
        Page<SessionRandomExtract> sessionRandomExtractPage = sessionRandomExtractService.selectPageUseDyc(page);
        return sessionRandomExtractPage.getPageMap();
    }
}