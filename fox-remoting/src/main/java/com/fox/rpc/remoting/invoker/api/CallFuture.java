package com.fox.rpc.remoting.invoker.api;

import com.fox.rpc.common.bean.InvokeRequest;
import com.fox.rpc.common.bean.InvokeResponse;

import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Created by wenbo2018 on 2016/8/26.
 */
public class CallFuture implements Future {

    private InvokeResponse invokeResponse;

    private InvokeRequest invokeRequest;

    public CallFuture(InvokeRequest invokeRequest) {
        this.invokeRequest=invokeRequest;
    }

    public InvokeResponse getInvokeResponse() {
        return this.invokeResponse;
    }


    public void processResponse(InvokeResponse invokeResponse) {
        System.out.println("处理回调："+invokeResponse);
        this.invokeResponse=invokeResponse;
    }


    @Override
    public boolean cancel(boolean mayInterruptIfRunning) {
        return false;
    }

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public boolean isDone() {
        return false;
    }

    @Override
    public Objects get() throws InterruptedException, ExecutionException {
        return null;
    }

    @Override
    public Objects get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }
}
