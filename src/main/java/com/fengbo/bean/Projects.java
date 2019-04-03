package com.fengbo.bean;

import java.util.Date;
import java.util.List;

public class Projects {
    private Integer psId;

    private String psUsId;

    private Integer psPstId;

    private Integer psStateId;

    private String psName;

    private String psPictureaddress;

    private Double psMoney;

    private Double psGetmoney;

    private Integer psGetpeople;

    private Integer psIshot;

    private Date psDate;

    private String psAddress;

    private String psGoal;

    private Integer psDays;

    private String psVideo;

    private String psStory;

    private String psSupport;

    private String psRepay;

    private String psAboutme;

    private Date psStarttime;

    private Date psEndtime;
    
    private String stName;
    
	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public Integer getPsId() {
        return psId;
    }

    public void setPsId(Integer psId) {
        this.psId = psId;
    }

    public String getPsUsId() {
        return psUsId;
    }

    public void setPsUsId(String psUsId) {
        this.psUsId = psUsId == null ? null : psUsId.trim();
    }

    public Integer getPsPstId() {
        return psPstId;
    }

    public void setPsPstId(Integer psPstId) {
        this.psPstId = psPstId;
    }

    public Integer getPsStateId() {
        return psStateId;
    }

    public void setPsStateId(Integer psStateId) {
        this.psStateId = psStateId;
    }

    public String getPsName() {
        return psName;
    }

    public void setPsName(String psName) {
        this.psName = psName == null ? null : psName.trim();
    }

    public String getPsPictureaddress() {
        return psPictureaddress;
    }

    public void setPsPictureaddress(String psPictureaddress) {
        this.psPictureaddress = psPictureaddress == null ? null : psPictureaddress.trim();
    }

    public Double getPsMoney() {
        return psMoney;
    }

    public void setPsMoney(Double psMoney) {
        this.psMoney = psMoney;
    }

    public Double getPsGetmoney() {
        return psGetmoney;
    }

    public void setPsGetmoney(Double psGetmoney) {
        this.psGetmoney = psGetmoney;
    }

    public Integer getPsGetpeople() {
        return psGetpeople;
    }

    public void setPsGetpeople(Integer psGetpeople) {
        this.psGetpeople = psGetpeople;
    }

    public Integer getPsIshot() {
        return psIshot;
    }

    public void setPsIshot(Integer psIshot) {
        this.psIshot = psIshot;
    }

    public Date getPsDate() {
        return psDate;
    }

    public void setPsDate(Date psDate) {
        this.psDate = psDate;
    }

    public String getPsAddress() {
        return psAddress;
    }

    public void setPsAddress(String psAddress) {
        this.psAddress = psAddress == null ? null : psAddress.trim();
    }

    public String getPsGoal() {
        return psGoal;
    }

    public void setPsGoal(String psGoal) {
        this.psGoal = psGoal == null ? null : psGoal.trim();
    }

    public Integer getPsDays() {
        return psDays;
    }

    public void setPsDays(Integer psDays) {
        this.psDays = psDays;
    }

    public String getPsVideo() {
        return psVideo;
    }

    public void setPsVideo(String psVideo) {
        this.psVideo = psVideo == null ? null : psVideo.trim();
    }

    public String getPsStory() {
        return psStory;
    }

    public void setPsStory(String psStory) {
        this.psStory = psStory == null ? null : psStory.trim();
    }

    public String getPsSupport() {
        return psSupport;
    }

    public void setPsSupport(String psSupport) {
        this.psSupport = psSupport == null ? null : psSupport.trim();
    }

    public String getPsRepay() {
        return psRepay;
    }

    public void setPsRepay(String psRepay) {
        this.psRepay = psRepay == null ? null : psRepay.trim();
    }

    public String getPsAboutme() {
        return psAboutme;
    }

    public void setPsAboutme(String psAboutme) {
        this.psAboutme = psAboutme == null ? null : psAboutme.trim();
    }

    public Date getPsStarttime() {
        return psStarttime;
    }

    public void setPsStarttime(Date psStarttime) {
        this.psStarttime = psStarttime;
    }

    public Date getPsEndtime() {
        return psEndtime;
    }

    public void setPsEndtime(Date psEndtime) {
        this.psEndtime = psEndtime;
    }
}