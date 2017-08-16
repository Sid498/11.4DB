package com.example.sid.a114db;

/**
 * Created by SID on 8/16/2017.
 */

public class Student {
    String mId;
    String mIdnum;
    String mFirstname;

    /**
     * public constructor to initialize the values
     * @param id
     * @param idnum
     * @param firstname
     * @param firstnamevalue
     * @param lastname
     * @param lastnamevalue
     */
    public Student(String id,String idnum,String firstname,String firstnamevalue,String lastname, String lastnamevalue) {
        mId = id;
        mIdnum = idnum;
        mFirstname = firstname;
        mFirstnamevalue = firstnamevalue;
        mLastname =lastname;
        mLastnamevalue = lastnamevalue;

    }
    // Getter and Setter methods to set and retrieve the data
    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public String getmIdnum() {
        return mIdnum;
    }

    public void setmIdnum(String mIdnum) {
        this.mIdnum = mIdnum;
    }

    public String getmFirstname() {
        return mFirstname;
    }

    public void setmFirstname(String mFirstname) {
        this.mFirstname = mFirstname;
    }

    public String getmLastname() {
        return mLastname;
    }

    public void setmLastname(String mLastname) {
        this.mLastname = mLastname;
    }

    public String getmFirstnamevalue() {
        return mFirstnamevalue;
    }

    public void setmFirstnamevalue(String mFirstnamevalue) {
        this.mFirstnamevalue = mFirstnamevalue;
    }

    public String getmLastnamevalue() {
        return mLastnamevalue;
    }

    public void setmLastnamevalue(String mLastnamevalue) {
        this.mLastnamevalue = mLastnamevalue;
    }

    String mLastname;
    String mFirstnamevalue;
    String mLastnamevalue;


    public Student() {

    }


}
