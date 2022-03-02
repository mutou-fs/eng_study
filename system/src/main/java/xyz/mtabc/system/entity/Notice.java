package xyz.mtabc.system.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 木头
 * @since 2022-02-23
 */
public class Notice implements Serializable {

    private static final long serialVersionUID = 1L;

      private Integer id;

      /**
     * 标题
     */
      private String title;

      /**
     * 内容
     */
      private String content;

      /**
     * 发布用户
     */
      private Integer user;

      /**
     * 跟随课程状态
     */
      private Integer states;

    
    public Integer getId() {
        return id;
    }

      public void setId(Integer id) {
          this.id = id;
      }
    
    public String getTitle() {
        return title;
    }

      public void setTitle(String title) {
          this.title = title;
      }
    
    public String getContent() {
        return content;
    }

      public void setContent(String content) {
          this.content = content;
      }
    
    public Integer getUser() {
        return user;
    }

      public void setUser(Integer user) {
          this.user = user;
      }
    
    public Integer getStates() {
        return states;
    }

      public void setStates(Integer states) {
          this.states = states;
      }

    @Override
    public String toString() {
        return "Notice{" +
              ", id=" + id +
                  ", title=" + title +
                  ", content=" + content +
                  ", user=" + user +
                  ", states=" + states +
              "}";
    }
}
