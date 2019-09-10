package com.elum.session.dao;



import com.elum.session.entity.Page;

import java.util.List;

public interface BaseMapper<T> {

    /**
     * 添加单个对象
     */
    public int insert(T t);

    /**
     * 修改单个对象
     */
    public int update(T t);

    /**
     * 删除单个对象
     */
    public int delete(T t);

    /**
     * 查询单个对象
     */
    public T select(T t);

    /**
     * 分页查询，关键字，列表
     */
    public List<T> selectPageList(Page<T> page);

    /**
     * 分页查询，总记录数，整数
     */
    public int selectPageCount(Page<T> page);

    /**
     * 分页查询，多条件，列表
     */
    public List<T> selectPageListUseDyc(Page<T> page);

    /**
     * 分页查询，多条件，整数
     */
    public int selectPageCountUseDyc(Page<T> page);

    /**
     * 删除List
     */
    public int deleteList(String[] pks);

}
