package xyz.mtabc.system.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author 木头
 * @since 2022-02-23
 */
public class Course implements Serializable {

    private static final long serialVersionUID = 1L;

      private Integer id;

      /**
     * 课程名
     */
      private String name;

      /**
     * 封面
     */
      private String cover;

      /**
     * 简介
     */
      private String introduce;

      /**
     * 标签
     */
      private String tag;

      /**
     * 公告
     */
      private Integer notice;

      /**
     * 创建时间
     */
      private LocalDateTime createTime;

      /**
     * 更新时间
     */
      private LocalDateTime updateTime;

      /**
     * 创建课程的用户
     */
      private Integer user;

      /**
     * 置顶
     */
      private Integer top;

      /**
     * 状态
     */
      private Integer states;

    
    public Integer getId() {
        return id;
    }

      public void setId(Integer id) {
          this.id = id;
      }
    
    public String getName() {
        return name;
    }

      public void setName(String name) {
          this.name = name;
      }
    
    public String getCover() {
        return cover;
    }

      public void setCover(String cover) {
          this.cover = cover;
      }
    
    public String getIntroduce() {
        return introduce;
    }

      public void setIntroduce(String introduce) {
          this.introduce = introduce;
      }
    
    public String getTag() {
        return tag;
    }

      public void setTag(String tag) {
          this.tag = tag;
      }
    
    public Integer getNotice() {
        return notice;
    }

      public void setNotice(Integer notice) {
          this.notice = notice;
      }
    
    public LocalDateTime getCreateTime() {
        return createTime;
    }

      public void setCreateTime(LocalDateTime createTime) {
          this.createTime = createTime;
      }
    
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

      public void setUpdateTime(LocalDateTime updateTime) {
          this.updateTime = updateTime;
      }
    
    public Integer getUser() {
        return user;
    }

      public void setUser(Integer user) {
          this.user = user;
      }
    
    public Integer getTop() {
        return top;
    }

      public void setTop(Integer top) {
          this.top = top;
      }
    
    public Integer getStates() {
        return states;
    }

      public void setStates(Integer states) {
          this.states = states;
      }

    @Override
    public String toString() {
        return "Course{" +
              ", id=" + id +
                  ", name=" + name +
                  ", cover=" + cover +
                  ", introduce=" + introduce +
                  ", tag=" + tag +
                  ", notice=" + notice +
                  ", createTime=" + createTime +
                  ", updateTime=" + updateTime +
                  ", user=" + user +
                  ", top=" + top +
                  ", states=" + states +
              "}";
    }
}
