package com.namego.sqlTest;

/**
 * @author Namego
 * @date 2022/8/17 23:37
 */

public class StuWorkHourVO {
    /**
     * stu_work_hour
     */
    private Long stuWorkHourId;
    /**
     * stu_expansion
     */
    private String fullName;
    private String sno;
    private String portrait;
    /**
     * work
     */
    private String workName;
    private Integer workHour;
    private Integer workMinute;
    private Integer workHourAlready;
    private Integer workMinuteAlready;
    private Integer workHourUnissued;
    private Integer workMinuteUnissued;
    private Integer workHourTchDetermine;
    private Integer workMinuteTchDetermine;
    private Integer workHourAdminDetermine;
    private Integer workMinuteAdminDetermine;
    /**
     * stu_expansion
     */
    private Integer isPoor;
    private Integer state;
}
