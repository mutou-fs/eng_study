package xyz.mtabc.system.service.impl;

import xyz.mtabc.system.entity.Notice;
import xyz.mtabc.system.mapper.NoticeMapper;
import xyz.mtabc.system.service.INoticeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 木头
 * @since 2022-02-23
 */
@Service
public class NoticeServiceImpl extends ServiceImpl<NoticeMapper, Notice> implements INoticeService {

}
