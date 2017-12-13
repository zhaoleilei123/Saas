package com.jd.y.areaData.remote.filter;

import com.jd.jsf.gd.filter.AbstractFilter;
import com.jd.jsf.gd.msg.Invocation;
import com.jd.jsf.gd.msg.MessageBuilder;
import com.jd.jsf.gd.msg.RequestMessage;
import com.jd.jsf.gd.msg.ResponseMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * Created by hehaiquan on 2017/12/1.
 */
public class DemoFilter extends AbstractFilter {
    private final static Logger LOGGER = LoggerFactory.getLogger(DemoFilter.class);
    @Override
    public ResponseMessage invoke(RequestMessage request) {
        Map<String, Object> configContext = super.getConfigContext(); // 可以拿到一些配置里的信息
        LOGGER.info("before invoke..");  // 在getNext().invoke(request)前加的代码，将在远程方法调用前执行
        ResponseMessage response = null;

        Invocation invocation = request.getInvocationBody();
        Object obj = invocation.getAttachment("SaaSContext");


        if ("true".equals(configContext.get("mock"))) {
            response = getNext().invoke(request); // 调用链自动往下层执行
        } else {
            response = MessageBuilder.buildResponse(request); // 也可以自己构造返回对象
            response.setResponse("xxx"); // 返回结果
            // response.setException(); // 返回异常
        }
        LOGGER.info("after invoke..");  // 在getNext().invoke(request)后加的代码，将在远程方法调用后执行
        return response;
    }
}
