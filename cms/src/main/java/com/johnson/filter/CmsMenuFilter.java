package com.johnson.filter;

import com.johnson.model.dto.CmsMenuDto;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
@Order(1)
public class CmsMenuFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;

        List<CmsMenuDto> menuList = new ArrayList<>();
        menuList.add(new CmsMenuDto("主页", "home", "/home"));
        menuList.add(new CmsMenuDto("文章分类", "article_category","/article_category"));
        menuList.add(new CmsMenuDto("文章", "article","/article"));
        request.getSession().setAttribute("cms_menu", menuList);

        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
