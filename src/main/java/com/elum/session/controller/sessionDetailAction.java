package com.elum.session.controller;


import com.elum.session.entity.Page;
import com.elum.session.entity.SessionDetail;
import com.elum.session.service.SessionDetailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/sessionDetail")
public class sessionDetailAction extends BaseAction {

    @Resource
    public SessionDetailService  sessionDetailService;

    @RequestMapping("/selectPageUseDyc")
    @ResponseBody
    public Object selectPageUseDyc(Page<SessionDetail> page, SessionDetail sessionDetail) throws Exception {
        page.setParamEntity(sessionDetail);
        Page<SessionDetail> sessionDetailPage = sessionDetailService.selectPageUseDyc(page);
        return sessionDetailPage.getPageMap();
    }


}
