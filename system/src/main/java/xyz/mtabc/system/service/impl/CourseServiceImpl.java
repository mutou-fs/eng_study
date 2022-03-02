package xyz.mtabc.system.service.impl;

import xyz.mtabc.system.entity.Course;
import xyz.mtabc.system.mapper.CourseMapper;
import xyz.mtabc.system.service.ICourseService;
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
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements ICourseService {

}
