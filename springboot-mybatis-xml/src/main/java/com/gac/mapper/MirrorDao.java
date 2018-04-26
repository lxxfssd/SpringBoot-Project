package com.gac.mapper;

import com.gac.entity.Mirror;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MirrorDao {

    public void add(Mirror mirror);

    public Mirror findById(@Param(value="id") long id);

    public void delete(@Param(value="id")long id);

    public void update(Mirror mirror);

    public List<Mirror> list(@Param(value="name")String name);

}
