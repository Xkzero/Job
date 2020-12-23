package web.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathController {
	
    /**
	 * 访问index.jsp
	 *控制器方法作用：请求路径显示对应的jsp页面
	 */
	@RequestMapping("{page}")
	public String path(@PathVariable String page) {
		return page;
	}
}
