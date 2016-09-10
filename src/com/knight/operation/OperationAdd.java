package com.knight.operation;

import com.knight.base.Operation;

/**
 * @ClassName: OperationAdd.java
 * @Description: 加法
 * @author: knight
 * @date: 2016年9月10日 下午4:33:45
 * @company: sfteam
 */
public class OperationAdd implements Operation {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.knight.base.Operation#getResult(double, double)
	 */
	@Override
	public double getResult(double operNumA, double operNumB) {
		return operNumA + operNumB;
	}

}
