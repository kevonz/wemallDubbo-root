package com.wemallDubbo.common;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/**
 *远程传输对象
 * @author yangyang
 *
 * @param <T>
 */
public class RemoteObject<T> implements Serializable
{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private int start;
    private int end;
    private int size;
    private List<T> list;
    private boolean result;

    public boolean isResult()
    {
        return result;
    }

    public void setResult(boolean result)
    {
        this.result = result;
    }

    private HashMap<String, Object> hashMap;

    public HashMap<String, Object> getHashMap()
    {
        return hashMap;
    }

    public void setHashMap(HashMap<String, Object> hashMap)
    {
        this.hashMap = hashMap;
    }

    public int getStart()
    {
        return start;
    }

    public void setStart(int start)
    {
        this.start = start;
    }

    public int getEnd()
    {
        return end;
    }

    public void setEnd(int end)
    {
        this.end = end;
    }

    public int getSize()
    {
        return size;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public List<T> getList()
    {
        return list;
    }

    public void setList(List<T> list)
    {
        this.list = list;
    }

}
