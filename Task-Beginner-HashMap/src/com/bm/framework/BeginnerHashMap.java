/**
 * 
 */
package com.bm.framework;
import java.util.*;
/**
 * @author Balamurugan
 *
 */
public class BeginnerHashMap 
{
	public void checkNull(Object obj) throws BMapException
	{
		if(obj == null)
		{
			throw new BMapException("Value should not be Null");
		}
	}
	public int getMapSize(Map m) throws BMapException
	{
		checkNull(m);
		return m.size();
	}
	public void addEntry(Map map,Object key,Object value) throws BMapException
	{
		checkNull(map);
		map.put(key, value);
	}
	public boolean checkKey(Map map,Object key,boolean value) throws BMapException
	{
		checkNull(map);
		if(value)
		{
			return map.containsValue(key);
		}
		return map.containsKey(key);
	}
	public Object getValue(Map map,Object key) throws BMapException
	{
		checkNull(map);
		return map.get(key);
	}
	public Object getValue(Map map,Object key,Object dValue) throws BMapException
	{
		checkNull(map);
		return map.getOrDefault(key,dValue);
	}
	public Object removeKey(Map map,Object key) throws BMapException
	{
		checkNull(map);
		return map.remove(key);
	}
	public Object removeEntry(Map map,Object key,Object value) throws BMapException
	{
		checkNull(map);
		return map.remove(key, value);
	}
	public Object replaceValues(Map map,Object key,Object value) throws BMapException
	{
		checkNull(map);
		return map.replace(key, value);
	}
	public Object replaceValues(Map map,Object key,Object value,Object oldValue) throws BMapException
	{
		checkNull(map);
		return map.replace(key, oldValue, value);
	}
	public void removeAll(Map map) throws BMapException
	{
		checkNull(map);
		map.clear();
	}
}
