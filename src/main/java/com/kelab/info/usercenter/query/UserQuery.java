package com.kelab.info.usercenter.query;

import com.kelab.info.base.query.BaseQuery;

public class UserQuery extends BaseQuery {

    private Integer roleId;

    private String studentId;

    private String username;

    private String realName;

    private boolean isLikeUsername = true;

    private boolean sortByAcNum = false;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public boolean isLikeUsername() {
        return isLikeUsername;
    }

    public void setLikeUsername(boolean likeUsername) {
        isLikeUsername = likeUsername;
    }

    public boolean isSortByAcNum() {
        return sortByAcNum;
    }

    public void setSortByAcNum(boolean sortByAcNum) {
        this.sortByAcNum = sortByAcNum;
    }
}
