package com.pojo;

import java.util.Date;

public class User {
    //第九次本地修改
	/**
     * 主键
     */
    private Long id;

    //第一次修改
    /**
     * 所属商户
     */
    private String mchNo;

    /**
     * 用户名
     */
    private String account;

    /**
     * 用户密码
     */
    private String pwd;

    /**
     * 盐
     */
    private String salt;

    /**
     * 手机号码
     */
    private String telphone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 状态
     */
    private Byte status;

    /**
     * 状态说明
     */
    private String statusMsg;

    /**
     * 重置密码类型
     */
    private Byte modifyPwd;

    /**
     * 更改密码时间
     */
    private Date modifedPwdTime;

    /**
     * 字符扩展字段1
     */
    private String fldS1;

    /**
     * 字符扩展字段2
     */
    private String fldS2;

    /**
     * 数字扩展字段1
     */
    private Long fldN1;

    /**
     * 数字扩展字段2
     */
    private Long fldN2;

    /**
     * 日期扩展字段1
     */
    private Date fldD2;

    /**
     * 是否删除
     */
    private Byte isDeleted;

    /**
     * 创建用户id
     */
    private Long createUserId;

    /**
     * 创建用户名称
     */
    private String createUserName;

    /**
     * 修改用户id
     */
    private Long modifedUserId;

    /**
     * 修改用户名称
     */
    private String modifedUserName;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date modifedTime;

    /**
     * 主键
     * @return id 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 所属商户
     * @return mch_no 所属商户
     */
    public String getMchNo() {
        return mchNo;
    }

    /**
     * 所属商户
     * @param mchNo 所属商户
     */
    public void setMchNo(String mchNo) {
        this.mchNo = mchNo == null ? null : mchNo.trim();
    }

    /**
     * 用户名
     * @return account 用户名
     */
    public String getAccount() {
        return account;
    }

    /**
     * 用户名
     * @param account 用户名
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * 用户密码
     * @return pwd 用户密码
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * 用户密码
     * @param pwd 用户密码
     */
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    /**
     * 盐
     * @return salt 盐
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 盐
     * @param salt 盐
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * 手机号码
     * @return telphone 手机号码
     */
    public String getTelphone() {
        return telphone;
    }

    /**
     * 手机号码
     * @param telphone 手机号码
     */
    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    /**
     * 邮箱
     * @return email 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 邮箱
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 状态
     * @return status 状态
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 状态
     * @param status 状态
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 状态说明
     * @return status_msg 状态说明
     */
    public String getStatusMsg() {
        return statusMsg;
    }

    /**
     * 状态说明
     * @param statusMsg 状态说明
     */
    public void setStatusMsg(String statusMsg) {
        this.statusMsg = statusMsg == null ? null : statusMsg.trim();
    }

    /**
     * 重置密码类型
     * @return modify_pwd 重置密码类型
     */
    public Byte getModifyPwd() {
        return modifyPwd;
    }

    /**
     * 重置密码类型
     * @param modifyPwd 重置密码类型
     */
    public void setModifyPwd(Byte modifyPwd) {
        this.modifyPwd = modifyPwd;
    }

    /**
     * 更改密码时间
     * @return modifed_pwd_time 更改密码时间
     */
    public Date getModifedPwdTime() {
        return modifedPwdTime;
    }

    /**
     * 更改密码时间
     * @param modifedPwdTime 更改密码时间
     */
    public void setModifedPwdTime(Date modifedPwdTime) {
        this.modifedPwdTime = modifedPwdTime;
    }

    /**
     * 字符扩展字段1
     * @return fld_s1 字符扩展字段1
     */
    public String getFldS1() {
        return fldS1;
    }

    /**
     * 字符扩展字段1
     * @param fldS1 字符扩展字段1
     */
    public void setFldS1(String fldS1) {
        this.fldS1 = fldS1 == null ? null : fldS1.trim();
    }

    /**
     * 字符扩展字段2
     * @return fld_s2 字符扩展字段2
     */
    public String getFldS2() {
        return fldS2;
    }

    /**
     * 字符扩展字段2
     * @param fldS2 字符扩展字段2
     */
    public void setFldS2(String fldS2) {
        this.fldS2 = fldS2 == null ? null : fldS2.trim();
    }

    /**
     * 数字扩展字段1
     * @return fld_n1 数字扩展字段1
     */
    public Long getFldN1() {
        return fldN1;
    }

    /**
     * 数字扩展字段1
     * @param fldN1 数字扩展字段1
     */
    public void setFldN1(Long fldN1) {
        this.fldN1 = fldN1;
    }

    /**
     * 数字扩展字段2
     * @return fld_n2 数字扩展字段2
     */
    public Long getFldN2() {
        return fldN2;
    }

    /**
     * 数字扩展字段2
     * @param fldN2 数字扩展字段2
     */
    public void setFldN2(Long fldN2) {
        this.fldN2 = fldN2;
    }

    /**
     * 日期扩展字段1
     * @return fld_d2 日期扩展字段1
     */
    public Date getFldD2() {
        return fldD2;
    }

    /**
     * 日期扩展字段1
     * @param fldD2 日期扩展字段1
     */
    public void setFldD2(Date fldD2) {
        this.fldD2 = fldD2;
    }

    /**
     * 是否删除
     * @return is_deleted 是否删除
     */
    public Byte getIsDeleted() {
        return isDeleted;
    }

    /**
     * 是否删除
     * @param isDeleted 是否删除
     */
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * 创建用户id
     * @return create_user_id 创建用户id
     */
    public Long getCreateUserId() {
        return createUserId;
    }

    /**
     * 创建用户id
     * @param createUserId 创建用户id
     */
    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 创建用户名称
     * @return create_user_name 创建用户名称
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**
     * 创建用户名称
     * @param createUserName 创建用户名称
     */
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    /**
     * 修改用户id
     * @return modifed_user_id 修改用户id
     */
    public Long getModifedUserId() {
        return modifedUserId;
    }

    /**
     * 修改用户id
     * @param modifedUserId 修改用户id
     */
    public void setModifedUserId(Long modifedUserId) {
        this.modifedUserId = modifedUserId;
    }

    /**
     * 修改用户名称
     * @return modifed_user_name 修改用户名称
     */
    public String getModifedUserName() {
        return modifedUserName;
    }

    /**
     * 修改用户名称
     * @param modifedUserName 修改用户名称
     */
    public void setModifedUserName(String modifedUserName) {
        this.modifedUserName = modifedUserName == null ? null : modifedUserName.trim();
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     * @return modifed_time 更新时间
     */
    public Date getModifedTime() {
        return modifedTime;
    }

    /**
     * 更新时间
     * @param modifedTime 更新时间
     */
    public void setModifedTime(Date modifedTime) {
        this.modifedTime = modifedTime;
    }
}