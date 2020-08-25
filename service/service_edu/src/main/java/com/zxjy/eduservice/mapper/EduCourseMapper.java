package com.zxjy.eduservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zxjy.eduservice.entity.EduCourse;
import com.zxjy.eduservice.entity.frontvo.CourseWebVo;
import com.zxjy.eduservice.entity.vo.CoursePublishVo;

/**
 * <p>
 * 课程 Mapper 接口
 * </p>
 *
 * @author testjava
 * @since 2020-03-02
 */
public interface EduCourseMapper extends BaseMapper<EduCourse> {

    public CoursePublishVo getPublishCourseInfo(String courseId);

    //根据课程id，编写sql语句查询课程信息
    CourseWebVo getBaseCourseInfo(String courseId);
}
