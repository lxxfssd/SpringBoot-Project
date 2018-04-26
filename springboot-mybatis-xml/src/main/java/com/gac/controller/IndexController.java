package com.gac.controller;

import com.gac.entity.Mirror;
import com.gac.service.MirrorService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {

    @Autowired
    private MirrorService mirrorService;

    @RequestMapping("/select")
    public PageInfo<Mirror> select(String name) {
        //第一个参数：第几页
        //第二个参数：每页显示条数
        Page<Mirror> obj = PageHelper.startPage(1,2);
        List<Mirror> list = mirrorService.list(name);
        PageInfo<Mirror> page = new PageInfo<Mirror>(list);
        return page;
    }
}
