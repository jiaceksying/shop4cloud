package com.shop4j.cloud.common.response;

import lombok.AllArgsConstructor;

/**
 * @author ksying
 * @date 2023/3/12 14:58
 */
@AllArgsConstructor
public enum ResponseEnum {

	/**
	 * ok
	 */
	OK("00000", "ok"),

	/**
	 * 用于直接显示提示用户的错误，内容由输入内容决定
	 */
	SHOW_FAIL("A00001", ""),

	/**
	 * 服务器出了点小差
	 */
	EXCEPTION("A00005", "服务器出了点小差"),

	/**
	 * 参数错误
	 */
	ERROR_PARAM("A00006", "参数错误"),

	/**
	 * 数据异常
	 */
	DATA_ERROR("A00007", "数据异常，请刷新后重新操作");

	private final String code;

	private final String msg;

	public String value() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

	@Override
	public String toString() {
		return "ResponseEnum{" + "code='" + code + '\'' + ", msg='" + msg + '\'' + "} " + super.toString();
	}

}
