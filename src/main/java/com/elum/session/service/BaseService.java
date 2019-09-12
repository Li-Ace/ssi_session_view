package com.elum.session.service;


import com.elum.session.entity.Page;

public interface BaseService<T> {

    /**
     * 添加单个对象
     */
    public int insert(T t) throws Exception;

    /**
     * 修改单个对象
     */
    public int update(T t) throws Exception;

    /**
     * 删除单个对象
     */
    public int delete(T t) throws Exception;

    /**
     * 查询单个对象
     */
    public T select(T t) throws Exception;

    /**
     * 分页设计 关键字
     * @param page
     * @return
     * @throws Exception
     */
    public Page<T> selectPage(Page<T> page) throws Exception;

    /**
     * 分页设计 多条件
     * @param page
     * @return
     * @throws Exception
     */
    public Page<T> selectPageUseDyc(Page<T> page) throws Exception;


    /**
     *
     * @param pks
     * @return
     */
    public int deleteList(String[] pks) throws Exception;

}
