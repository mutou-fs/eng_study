package xyz.mtabc.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.mtabc.system.entity.Tag;
import xyz.mtabc.system.service.ITagService;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 根页面控制器
 */
@Controller
@RequestMapping("/")
public class RootController {
    @Resource
    private ITagService tagService;

    @GetMapping(value = {"/","/index"})
    public String index(Model model) {
        Map map = new HashMap();
        map.put("parent",null);
        List<Tag> topTagList = tagService.listByMap(map);
        model.addAttribute("topTagList",topTagList);
        return "index";
    }
}
