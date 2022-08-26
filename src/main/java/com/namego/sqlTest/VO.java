package com.namego.sqlTest;

/**
 * @author Namego
 * @date 2022/8/26 14:47
 */
public class VO {
    /**
     * work
     */
    private String workId;
    private String workName;
    private String location;
    private String startTime;
    private String endTime;
    /**
     * stu_expansion
     */
    private String stuOpenid;
    private String fullname;
    private Integer isPoor;
    private String sno;
    private String grade;
    private String major;
    private String portrait;
    private String resume;
    private String phone;
    private String wechat;
    private String cardNumber;
    private String freeTime;

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getStuOpenid() {
        return stuOpenid;
    }

    public void setStuOpenid(String stuOpenid) {
        this.stuOpenid = stuOpenid;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Integer getIsPoor() {
        return isPoor;
    }

    public void setIsPoor(Integer isPoor) {
        this.isPoor = isPoor;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getFreeTime() {
        return freeTime;
    }

    public void setFreeTime(String freeTime) {
        this.freeTime = freeTime;
    }

    @Override
    public String toString() {
        return "VO{" +
                "workId='" + workId + '\'' +
                ", workName='" + workName + '\'' +
                ", location='" + location + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", stuOpenid='" + stuOpenid + '\'' +
                ", fullname='" + fullname + '\'' +
                ", isPoor=" + isPoor +
                ", sno='" + sno + '\'' +
                ", grade='" + grade + '\'' +
                ", major='" + major + '\'' +
                ", portrait='" + portrait + '\'' +
                ", resume='" + resume + '\'' +
                ", phone='" + phone + '\'' +
                ", wechat='" + wechat + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", freeTime='" + freeTime + '\'' +
                '}';
    }
}
