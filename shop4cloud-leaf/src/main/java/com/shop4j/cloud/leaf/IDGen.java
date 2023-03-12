package com.shop4j.cloud.leaf;

import com.shop4j.cloud.leaf.common.Result;

/**
 * @author leaf
 */
public interface IDGen {

	/**
	 * get
	 * @param key key
	 * @return Result
	 */
	Result get(String key);

	/**
	 * init
	 * @return inited
	 */
	boolean init();

}
