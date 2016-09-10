package com.knight.factory;

import com.knight.base.Operation;
import com.knight.operation.OperationAdd;

/**
 * @ClassName: OperationFactory.java
 * @Description: 算法工厂类
 * @author: knight
 * @date: 2016年9月10日 下午4:13:34
 * @company: sfteam
 */
public class OperationFactory {

	public static Operation factory(String type) {
		if (type.equals("plus")) {
			return new OperationAdd();
		} else {
			return null;
		}
	}
}
