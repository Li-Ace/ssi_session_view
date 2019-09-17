package com.elum.session.controller;

import com.elum.session.entity.AdBlacklist;
import com.elum.session.entity.AdProvinceTop3;
import com.elum.session.entity.Page;
import com.elum.session.service.AdBlacklistService;
import com.elum.session.service.AdProvinceTop3Service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
@Controller
@RequestMapping("/adProvinceTop3")
public class AdProvinceTop3Action extends BaseAction {

    @Resource
    public AdProvinceTop3Service adProvinceTop3Service;

    @RequestMapping("/selectPageUseDyc")
    @ResponseBody
    public Object selectPageUseDyc(Page<AdProvinceTop3> page, AdProvinceTop3 adProvinceTop3) throws Exception {
        page.setParamEntity(adProvinceTop3);
        Page<AdProvinceTop3> adProvinceTop3Page = adProvinceTop3Service.selectPageUseDyc(page);
        return adProvinceTop3Page.getPageMap();
    }
}