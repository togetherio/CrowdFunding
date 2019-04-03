package com.fengbo.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class User {
    private String usId;

    private String usUsername;

    private String usPassword;

    private String usPhone;

    private String usCode;

    private String usRealname;

    private String usSex;

    private String usEntic;

    private String usBirthday;

    private String usAddress;

    private String usIdcard;

    private String usFaceImgAddr;

    private String usIdcardImgAddr;

    private Integer usSubmImgSign;

    private Integer usCheckpassSign;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date usCreateTime;
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date usUpdateTime;

    public String getUsId() {
        return usId;
    }

    public void setUsId(String usId) {
        this.usId = usId == null ? null : usId.trim();
    }

    public String getUsUsername() {
        return usUsername;
    }

    public void setUsUsername(String usUsername) {
        this.usUsername = usUsername == null ? null : usUsername.trim();
    }

    public String getUsPassword() {
        return usPassword;
    }

    public void setUsPassword(String usPassword) {
        this.usPassword = usPassword == null ? null : usPassword.trim();
    }

    public String getUsPhone() {
        return usPhone;
    }

    public void setUsPhone(String usPhone) {
        this.usPhone = usPhone == null ? null : usPhone.trim();
    }

    public String getUsCode() {
        return usCode;
    }

    public void setUsCode(String usCode) {
        this.usCode = usCode == null ? null : usCode.trim();
    }

    public String getUsRealname() {
        return usRealname;
    }

    public void setUsRealname(String usRealname) {
        this.usRealname = usRealname == null ? null : usRealname.trim();
    }

    public String getUsSex() {
        return usSex;
    }

    public void setUsSex(String usSex) {
        this.usSex = usSex == null ? null : usSex.trim();
    }

    public String getUsEntic() {
        return usEntic;
    }

    public void setUsEntic(String usEntic) {
        this.usEntic = usEntic == null ? null : usEntic.trim();
    }

    public String getUsBirthday() {
        return usBirthday;
    }

    public void setUsBirthday(String usBirthday) {
        this.usBirthday = usBirthday == null ? null : usBirthday.trim();
    }

    public String getUsAddress() {
        return usAddress;
    }

    public void setUsAddress(String usAddress) {
        this.usAddress = usAddress == null ? null : usAddress.trim();
    }

    public String getUsIdcard() {
        return usIdcard;
    }

    public void setUsIdcard(String usIdcard) {
        this.usIdcard = usIdcard == null ? null : usIdcard.trim();
    }

    public String getUsFaceImgAddr() {
        return usFaceImgAddr;
    }

    public void setUsFaceImgAddr(String usFaceImgAddr) {
        this.usFaceImgAddr = usFaceImgAddr == null ? null : usFaceImgAddr.trim();
    }

    public String getUsIdcardImgAddr() {
        return usIdcardImgAddr;
    }

    public void setUsIdcardImgAddr(String usIdcardImgAddr) {
        this.usIdcardImgAddr = usIdcardImgAddr == null ? null : usIdcardImgAddr.trim();
    }

    public Integer getUsSubmImgSign() {
        return usSubmImgSign;
    }

    public void setUsSubmImgSign(Integer usSubmImgSign) {
        this.usSubmImgSign = usSubmImgSign;
    }

    public Integer getUsCheckpassSign() {
        return usCheckpassSign;
    }

    public void setUsCheckpassSign(Integer usCheckpassSign) {
        this.usCheckpassSign = usCheckpassSign;
    }

    public Date getUsCreateTime() {
        return usCreateTime;
    }

    public void setUsCreateTime(Date usCreateTime) {
        this.usCreateTime = usCreateTime;
    }

    public Date getUsUpdateTime() {
        return usUpdateTime;
    }

    public void setUsUpdateTime(Date usUpdateTime) {
        this.usUpdateTime = usUpdateTime;
    }

	@Override
	public String toString() {
		return "User [usId=" + usId + ", usUsername=" + usUsername + ", usPassword=" + usPassword + ", usPhone="
				+ usPhone + ", usCode=" + usCode + ", usRealname=" + usRealname + ", usSex=" + usSex + ", usEntic="
				+ usEntic + ", usBirthday=" + usBirthday + ", usAddress=" + usAddress + ", usIdcard=" + usIdcard
				+ ", usFaceImgAddr=" + usFaceImgAddr + ", usIdcardImgAddr=" + usIdcardImgAddr + ", usSubmImgSign="
				+ usSubmImgSign + ", usCheckpassSign=" + usCheckpassSign + ", usCreateTime=" + usCreateTime
				+ ", usUpdateTime=" + usUpdateTime + "]";
	}
    
    
}