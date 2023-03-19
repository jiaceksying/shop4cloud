package com.shop4j.cloud.common.response;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

/**
 * 统一的返回数据
 *
 * @author ksying
 * @date 2023/3/12 15:04
 */
@Slf4j
@Getter
@Setter
public class UnifiedResponse<T> implements Serializable {

	@Serial
	private static final long serialVersionUID = -5184273427222371942L;

	/**
	 * 状态码
	 */
	private String code;

	/**
	 * 信息
	 */
	private String msg;

	/**
	 * 数据
	 */
	private T data;

	public boolean isSuccess() {
		return Objects.equals(ResponseEnum.OK.value(), this.code);
	}

	@Override
	public String toString() {
		return "ServerResponseEntity{" + "code=" + code + ", msg='" + msg + '\'' + ", data=" + data + '}';
	}

	public static <T> UnifiedResponse<T> success(T data) {
		UnifiedResponse<T> serverResponseEntity = new UnifiedResponse<>();
		serverResponseEntity.setData(data);
		serverResponseEntity.setCode(ResponseEnum.OK.value());
		return serverResponseEntity;
	}

	public static <T> UnifiedResponse<T> success() {
		UnifiedResponse<T> serverResponseEntity = new UnifiedResponse<>();
		serverResponseEntity.setCode(ResponseEnum.OK.value());
		serverResponseEntity.setMsg(ResponseEnum.OK.getMsg());
		return serverResponseEntity;
	}

	/**
	 * 前端显示失败消息
	 * @param msg 失败消息
	 * @return
	 */
	public static <T> UnifiedResponse<T> showFailMsg(String msg) {
		log.error(msg);
		UnifiedResponse<T> serverResponseEntity = new UnifiedResponse<>();
		serverResponseEntity.setMsg(msg);
		serverResponseEntity.setCode(ResponseEnum.SHOW_FAIL.value());
		return serverResponseEntity;
	}

	public static <T> UnifiedResponse<T> fail(ResponseEnum responseEnum) {
		log.error(responseEnum.toString());
		UnifiedResponse<T> serverResponseEntity = new UnifiedResponse<>();
		serverResponseEntity.setMsg(responseEnum.getMsg());
		serverResponseEntity.setCode(responseEnum.value());
		return serverResponseEntity;
	}

	public static <T> UnifiedResponse<T> fail(ResponseEnum responseEnum, T data) {
		log.error(responseEnum.toString());
		UnifiedResponse<T> serverResponseEntity = new UnifiedResponse<>();
		serverResponseEntity.setMsg(responseEnum.getMsg());
		serverResponseEntity.setCode(responseEnum.value());
		serverResponseEntity.setData(data);
		return serverResponseEntity;
	}

	public static <T> UnifiedResponse<T> transform(UnifiedResponse<?> oldServerResponseEntity) {
		UnifiedResponse<T> serverResponseEntity = new UnifiedResponse<>();
		serverResponseEntity.setMsg(oldServerResponseEntity.getMsg());
		serverResponseEntity.setCode(oldServerResponseEntity.getCode());
		log.error(serverResponseEntity.toString());
		return serverResponseEntity;
	}

}
