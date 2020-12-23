package web.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathController {
	
    /**
	 * ����index.jsp
	 *�������������ã�����·����ʾ��Ӧ��jspҳ��
	 */
	@RequestMapping("{page}")
	public String path(@PathVariable String page) {
		return page;
	}
}
