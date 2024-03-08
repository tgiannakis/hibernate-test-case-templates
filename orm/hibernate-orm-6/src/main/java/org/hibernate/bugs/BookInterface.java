//
// Tom Sawyer Software
// Copyright 2007-2024
// All rights reserved.
//
// www.tomsawyer.com
//

package org.hibernate.bugs;


import java.util.Collection;
import java.util.Map;
import java.util.Set;


public interface BookInterface
	extends Map<String, Object> // Comment this line to fix the tests.
{
	// Map dummy implementation.
	default int size()
	{
		return 0;
	}


	default boolean isEmpty()
	{
		return false;
	}


	default boolean containsKey(Object key)
	{
		return false;
	}


	default boolean containsValue(Object value)
	{
		return false;
	}


	default Object get(Object key)
	{
		return null;
	}


	default Object put(String key, Object value)
	{
		return null;
	}


	default Object remove(Object key)
	{
		return null;
	}


	default void putAll(Map<? extends String, ?> m)
	{

	}

	default void clear()
	{

	}


	default Set<String> keySet()
	{
		return null;
	}


	default Collection<Object> values()
	{
		return null;
	}


	default Set<Map.Entry<String, Object>> entrySet()
	{
		return null;
	}
}
