package com.knight.test;

import com.knight.base.Operation;
import com.knight.factory.OperationFactory;

/**
 * @ClassName: OperationTest.java
 * @Description: 测试
 * @author: knight
 * @date: 2016年9月10日 下午4:12:30
 * @company: sfteam
 */
public class OperationTest {

	public static void main(String[] args) {
		double operNumA = 12;
		double operNumB = 3;
		Operation operation = OperationFactory.factory("plus");
		double result = operation.getResult(operNumA, operNumB);
		System.out.println(result);
	}
}
