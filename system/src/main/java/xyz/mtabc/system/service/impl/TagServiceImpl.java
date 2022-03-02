package xyz.mtabc.system.service.impl;

import xyz.mtabc.system.entity.Tag;
import xyz.mtabc.system.mapper.TagMapper;
import xyz.mtabc.system.service.ITagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 标签库 服务实现类
 * </p>
 *
 * @author 木头
 * @since 2022-02-05
 */
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements ITagService {

}
