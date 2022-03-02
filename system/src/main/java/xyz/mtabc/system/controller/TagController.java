package xyz.mtabc.system.controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.lang.NonNull;
import org.springframework.lang.NonNullApi;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import xyz.mtabc.system.entity.Tag;
import xyz.mtabc.system.service.ITagService;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 标签库 前端控制器
 * </p>
 *
 * @author 木头
 * @since 2022-02-05
 */
@Controller
@RequestMapping("/tag")
public class TagController {

    @Resource
    private ITagService tagService;

    @PostMapping("addTag")
    public String addTag(@RequestParam("name") String name, @RequestParam(value = "parent",required = false) Integer parent){
        Tag tag = new Tag();
        if(StringUtils.hasText(name)) tag.setName(name);
        if(parent!=null) tag.setParent(parent);
        tagService.save(tag);
        return "redirect:/system/tag/addTag.html";
    }

    @GetMapping("addTag.html")
    public String addTag(Model model){
        List<Tag> tagList = tagService.list();
        model.addAttribute("tagList",tagList);
        return "addTag";
    }
}

