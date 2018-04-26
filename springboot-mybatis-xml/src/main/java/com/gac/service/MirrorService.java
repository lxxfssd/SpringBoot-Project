package com.gac.service;

import com.gac.entity.Mirror;
import com.gac.mapper.MirrorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MirrorService {

    @Autowired
    private MirrorDao mirrorDao;

    public Mirror findById(Long id){
        return mirrorDao.findById(id);
    }

    public List<Mirror> list(String name) {
        return mirrorDao.list(name);
    }

}
