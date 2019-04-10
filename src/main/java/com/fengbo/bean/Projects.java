package com.fengbo.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Projects {
	private String psId;

	private String psUsId;

	private Integer psPstId;

	private Integer psStateId;

	private String psCheckSign;

	private String psPatientRelationship;

	private String psIllnessName;

	private String psName;

	private String psStory;

	private Double psMoney;

	private Double psGetmoney;

	private Integer psGetpeople;

	private Integer psDays;

	private Integer psIshot;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date psStarttime;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date psEndtime;

	private String paImgName;

	// projectsstate
	private String stName;

	// User
	private String usUsername;
	private String usSex;
	private String usAddress;

	// Projectstype
	private String pstName;

	public String getPstName() {
		return pstName;
	}

	public void setPstName(String pstName) {
		this.pstName = pstName;
	}

	public String getUsUsername() {
		return usUsername;
	}

	public void setUsUsername(String usUsername) {
		this.usUsername = usUsername;
	}

	public String getUsSex() {
		return usSex;
	}

	public void setUsSex(String usSex) {
		this.usSex = usSex;
	}

	public String getUsAddress() {
		return usAddress;
	}

	public void setUsAddress(String usAddress) {
		this.usAddress = usAddress;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public String getPsId() {
		return psId;
	}

	public void setPsId(String psId) {
		this.psId = psId == null ? null : psId.trim();
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

	public String getPsCheckSign() {
		return psCheckSign;
	}

	public void setPsCheckSign(String psCheckSign) {
		this.psCheckSign = psCheckSign;
	}

	public String getPsPatientRelationship() {
		return psPatientRelationship;
	}

	public void setPsPatientRelationship(String psPatientRelationship) {
		this.psPatientRelationship = psPatientRelationship == null ? null : psPatientRelationship.trim();
	}

	public String getPsIllnessName() {
		return psIllnessName;
	}

	public void setPsIllnessName(String psIllnessName) {
		this.psIllnessName = psIllnessName == null ? null : psIllnessName.trim();
	}

	public String getPsName() {
		return psName;
	}

	public void setPsName(String psName) {
		this.psName = psName == null ? null : psName.trim();
	}

	public String getPsStory() {
		return psStory;
	}

	public void setPsStory(String psStory) {
		this.psStory = psStory == null ? null : psStory.trim();
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

	public Integer getPsDays() {
		return psDays;
	}

	public void setPsDays(Integer psDays) {
		this.psDays = psDays;
	}

	public Integer getPsIshot() {
		return psIshot;
	}

	public void setPsIshot(Integer psIshot) {
		this.psIshot = psIshot;
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

	public String getPaImgName() {
		return paImgName;
	}

	public void setPaImgName(String paImgName) {
		this.paImgName = paImgName == null ? null : paImgName.trim();
	}

	@Override
	public String toString() {
		return "Projects [psId=" + psId + ", psUsId=" + psUsId + ", psPstId=" + psPstId + ", psStateId=" + psStateId
				+ ", psCheckSign=" + psCheckSign + ", psPatientRelationship=" + psPatientRelationship
				+ ", psIllnessName=" + psIllnessName + ", psName=" + psName + ", psStory=" + psStory + ", psMoney="
				+ psMoney + ", psGetmoney=" + psGetmoney + ", psGetpeople=" + psGetpeople + ", psDays=" + psDays
				+ ", psIshot=" + psIshot + ", psStarttime=" + psStarttime + ", psEndtime=" + psEndtime + ", paImgName="
				+ paImgName + ", stName=" + stName + ", usUsername=" + usUsername + ", usSex=" + usSex + ", usAddress="
				+ usAddress + ", pstName=" + pstName + "]";
	}

}