package com.wemallDubbo.exception;

import com.alibaba.dubbo.rpc.*;
import com.alibaba.dubbo.rpc.Result;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Administrator on 2017/3/20.
 */
public class ExceptionFilter implements Filter {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionFilter.class);

    @SuppressWarnings("rawtypes")
	@Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        Result result = invoker.invoke(invocation);
        if (result.hasException()){
            LOGGER.error("接口调用异常！");
            com.wemallDubbo.common.Result result1 = com.wemallDubbo.common.Result.newFailure();
            result1.setException(result.getException());
            result.getException().printStackTrace();
            return  new RpcResult(result1);
        }
        return result;
    }
}