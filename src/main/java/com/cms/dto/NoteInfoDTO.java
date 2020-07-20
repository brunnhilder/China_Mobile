package com.cms.dto;

/**
 * 作者：王宇
 * 创建时间：2020/7/9 0009 10:27
 * 描述：
 */
public class NoteInfoDTO {

    /**
     * 给哪个人发送的短信
     */
    private String phoneNum;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_note_info.cms_note_id
     *
     * @mbg.generated
     */
    private Integer cmsNoteId;

    /**
     * Database Column Remarks:
     *   0:????
     *               1:???
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_note_info.type
     *
     * @mbg.generated
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_note_info.from_time
     *
     * @mbg.generated
     */
    private String fromTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_note_info.to_time
     *
     * @mbg.generated
     */
    private String toTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_note_info.note_text
     *
     * @mbg.generated
     */
    private String noteText;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_note_info.from_id
     *
     * @mbg.generated
     */
    private Integer fromId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_note_info.to_id
     *
     * @mbg.generated
     */
    private Integer toId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cms_note_info
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_note_info.cms_note_id
     *
     * @return the value of cms_note_info.cms_note_id
     *
     * @mbg.generated
     */
    public Integer getCmsNoteId() {
        return cmsNoteId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_note_info.cms_note_id
     *
     * @param cmsNoteId the value for cms_note_info.cms_note_id
     *
     * @mbg.generated
     */
    public void setCmsNoteId(Integer cmsNoteId) {
        this.cmsNoteId = cmsNoteId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_note_info.type
     *
     * @return the value of cms_note_info.type
     *
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_note_info.type
     *
     * @param type the value for cms_note_info.type
     *
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_note_info.from_time
     *
     * @return the value of cms_note_info.from_time
     *
     * @mbg.generated
     */
    public String getFromTime() {
        return fromTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_note_info.from_time
     *
     * @param fromTime the value for cms_note_info.from_time
     *
     * @mbg.generated
     */
    public void setFromTime(String fromTime) {
        this.fromTime = fromTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_note_info.to_time
     *
     * @return the value of cms_note_info.to_time
     *
     * @mbg.generated
     */
    public String getToTime() {
        return toTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_note_info.to_time
     *
     * @param toTime the value for cms_note_info.to_time
     *
     * @mbg.generated
     */
    public void setToTime(String toTime) {
        this.toTime = toTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_note_info.note_text
     *
     * @return the value of cms_note_info.note_text
     *
     * @mbg.generated
     */
    public String getNoteText() {
        return noteText;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_note_info.note_text
     *
     * @param noteText the value for cms_note_info.note_text
     *
     * @mbg.generated
     */
    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_note_info.from_id
     *
     * @return the value of cms_note_info.from_id
     *
     * @mbg.generated
     */
    public Integer getFromId() {
        return fromId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_note_info.from_id
     *
     * @param fromId the value for cms_note_info.from_id
     *
     * @mbg.generated
     */
    public void setFromId(Integer fromId) {
        this.fromId = fromId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_note_info.to_id
     *
     * @return the value of cms_note_info.to_id
     *
     * @mbg.generated
     */
    public Integer getToId() {
        return toId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_note_info.to_id
     *
     * @param toId the value for cms_note_info.to_id
     *
     * @mbg.generated
     */
    public void setToId(Integer toId) {
        this.toId = toId;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}

