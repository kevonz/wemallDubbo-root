package com.wemallDubbo.service;



import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.wemallDubbo.common.PageBean;
import com.wemallDubbo.common.RemoteObject;




public interface BaseMyBatisService<T> {

    public abstract int insert(T paramT);

    public abstract void insertBatch(List<T> paramList);

    public abstract int update(T paramT);

    public abstract int delete(Serializable paramSerializable);

    public abstract int remove(Serializable paramSerializable);

    public abstract int count(Map<String, Object> paramMap);

    public abstract List<T> findAll();

   // public abstract List<T> findAll(Object paramObject);

    public abstract List<T> findAll(Map<String, Object> paramMap);

    public abstract List<T> findPageInfo(int[] paramArrayOfInt, Serializable paramSerializable);

    public abstract List<T> findPageInfo(int[] paramArrayOfInt, Map<String, Object> paramMap, Object[] paramArrayOfObject);

    public abstract List<T> findPageInfo(int[] paramArrayOfInt, Map<String, Object> paramMap);

    public abstract T findByNamedParam(Map<String, Object> paramMap);

    public abstract List<T> findByNamedParamList(Map<String, Object> paramMap);

    //public abstract T findByNamedParam(Serializable paramSerializable);

   // public abstract List<T> findByNamedParamList(Serializable paramSerializable);

    public abstract T selectByPrimaryKey(Serializable paramSerializable);


    public abstract T selectByPrimaryKeyForUpdate(Serializable paramSerializable);

    public abstract <E> RemoteObject<E> selectPageInfoSpecial(int[] paramArrayOfInt, Map<String, Object> paramMap, Object[] paramArrayOfObject);

    public abstract RemoteObject<T> selectPageInfo(int[] paramArrayOfInt, Map<String, Object> paramMap);

    public abstract RemoteObject<T> selectPageInfo(int[] paramArrayOfInt, Map<String, Object> paramMap, Object[] paramArrayOfObject);

    public abstract PageBean<T> findPageBean(Integer paramInt1, Integer paramInt2, Map<String, Object> paramMap);

    public abstract PageBean<T> findPageBean(Integer paramInt1, Integer paramInt2, Map<String, Object> paramMap, String paramString1, String paramString2);
    /**用户范围内的删除*/
    public abstract int delete(Serializable paramSerializable, long userId);
    public abstract int insert(T paramT, long userId);
    public abstract void insertBatch(List<T> paramList, long userId);
    public abstract int update(T paramT, long userId, Long id);
    public abstract int remove(Serializable paramSerializable, long userId);
}
