package com.宝贝.作业;

public class Student {
    private int sNo;
    private String sNmae;
    private String sSex;
    private int sAge;
    private double sJava;

    public Student() {
    }

    public Student(int sNo, String sNmae, String sSex, int sAge, double sJava) {
        this.sNo = sNo;
        this.sNmae = sNmae;
        this.sSex = sSex;
        this.sAge = sAge;
        this.sJava = sJava;
    }

    /**
     * 获取
     * @return sNo
     */
    public int getSNo() {
        return sNo;
    }

    /**
     * 设置
     * @param sNo
     */
    public void setSNo(int sNo) {
        this.sNo = sNo;
    }

    /**
     * 获取
     * @return sNmae
     */
    public String getSNmae() {
        return sNmae;
    }

    /**
     * 设置
     * @param sNmae
     */
    public void setSNmae(String sNmae) {
        this.sNmae = sNmae;
    }

    /**
     * 获取
     * @return sSex
     */
    public String getSSex() {
        return sSex;
    }

    /**
     * 设置
     * @param sSex
     */
    public void setSSex(String sSex) {
        this.sSex = sSex;
    }

    /**
     * 获取
     * @return sAge
     */
    public int getSAge() {
        return sAge;
    }

    /**
     * 设置
     * @param sAge
     */
    public void setSAge(int sAge) {
        this.sAge = sAge;
    }

    /**
     * 获取
     * @return sJava
     */
    public double getSJava() {
        return sJava;
    }

    /**
     * 设置
     * @param sJava
     */
    public void setSJava(double sJava) {
        this.sJava = sJava;
    }

    public String toString() {
        return "Student{sNo = " + sNo + ", sNmae = " + sNmae + ", sSex = " + sSex + ", sAge = " + sAge + ", sJava = " + sJava + "}";
    }
}
