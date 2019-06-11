package com.jamezhan.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zzy
 * @version 1.0
 * @date 2019/6/11  15:32
 * @Description:  zuul 路由过滤器
 */
@Component
public class TestFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(TestFilter.class);

    /**
     *
     * @return 返回过滤的类型：
     *         pre：路由之前
     *         routing：路由之时
     *         post： 路由之后
     *         error：发送错误调用
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤器执行的顺序
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 写判断是否需要过滤的判断逻辑
     *
     * @return  true：需要过滤
     *          false：不需要过滤
     */
    @Override
    public boolean shouldFilter() {
        // 就是不管什么都走这个过滤器
        return true;
    }

    /**
     *
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        Object accessToken = request.getParameter("token");
        if(accessToken == null) {
            log.warn("token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("token is empty");
            }catch (Exception e){}

            return null;
        }
        log.info("ok");
        return null;
    }
}
