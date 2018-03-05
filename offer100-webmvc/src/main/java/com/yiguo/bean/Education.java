package com.yiguo.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * Education的实体类
 * 
 * @author liyue
 * @date 2018-01-23
 */
public class Education implements Serializable {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column education.id
	 *
	 * @mbggenerated
	 */
	private Integer id;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column education.user_id
	 *
	 * @mbggenerated
	 */
	private Integer userId;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column education.user_name
	 *
	 * @mbggenerated
	 */
	private String userName;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column education.start_time
	 *
	 * @mbggenerated
	 */
	private Date startTime;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column education.end_time
	 *
	 * @mbggenerated
	 */
	private Date endTime;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column education.school_title
	 *
	 * @mbggenerated
	 */
	private String schoolTitle;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column education.creat_time
	 *
	 * @mbggenerated
	 */
	private Date creatTime;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column education.update_time
	 *
	 * @mbggenerated
	 */
	private Date updateTime;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database table education
	 *
	 * @mbggenerated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column education.id
	 *
	 * @return the value of education.id
	 *
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column education.id
	 *
	 * @param id
	 *            the value for education.id
	 *
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column education.user_id
	 *
	 * @return the value of education.user_id
	 *
	 * @mbggenerated
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column education.user_id
	 *
	 * @param userId
	 *            the value for education.user_id
	 *
	 * @mbggenerated
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column education.user_name
	 *
	 * @return the value of education.user_name
	 *
	 * @mbggenerated
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column education.user_name
	 *
	 * @param userName
	 *            the value for education.user_name
	 *
	 * @mbggenerated
	 */
	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column education.start_time
	 *
	 * @return the value of education.start_time
	 *
	 * @mbggenerated
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column education.start_time
	 *
	 * @param startTime
	 *            the value for education.start_time
	 *
	 * @mbggenerated
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column education.end_time
	 *
	 * @return the value of education.end_time
	 *
	 * @mbggenerated
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column education.end_time
	 *
	 * @param endTime
	 *            the value for education.end_time
	 *
	 * @mbggenerated
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column education.school_title
	 *
	 * @return the value of education.school_title
	 *
	 * @mbggenerated
	 */
	public String getSchoolTitle() {
		return schoolTitle;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column education.school_title
	 *
	 * @param schoolTitle
	 *            the value for education.school_title
	 *
	 * @mbggenerated
	 */
	public void setSchoolTitle(String schoolTitle) {
		this.schoolTitle = schoolTitle == null ? null : schoolTitle.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column education.creat_time
	 *
	 * @return the value of education.creat_time
	 *
	 * @mbggenerated
	 */
	public Date getCreatTime() {
		return creatTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column education.creat_time
	 *
	 * @param creatTime
	 *            the value for education.creat_time
	 *
	 * @mbggenerated
	 */
	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column education.update_time
	 *
	 * @return the value of education.update_time
	 *
	 * @mbggenerated
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column education.update_time
	 *
	 * @param updateTime
	 *            the value for education.update_time
	 *
	 * @mbggenerated
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table education
	 *
	 * @mbggenerated
	 */
	@Override
	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}
		if (that == null) {
			return false;
		}
		if (getClass() != that.getClass()) {
			return false;
		}
		Education other = (Education) that;
		return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
				&& (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
				&& (this.getUserName() == null ? other.getUserName() == null
						: this.getUserName().equals(other.getUserName()))
				&& (this.getStartTime() == null ? other.getStartTime() == null
						: this.getStartTime().equals(other.getStartTime()))
				&& (this.getEndTime() == null ? other.getEndTime() == null
						: this.getEndTime().equals(other.getEndTime()))
				&& (this.getSchoolTitle() == null ? other.getSchoolTitle() == null
						: this.getSchoolTitle().equals(other.getSchoolTitle()))
				&& (this.getCreatTime() == null ? other.getCreatTime() == null
						: this.getCreatTime().equals(other.getCreatTime()))
				&& (this.getUpdateTime() == null ? other.getUpdateTime() == null
						: this.getUpdateTime().equals(other.getUpdateTime()));
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table education
	 *
	 * @mbggenerated
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
		result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
		result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
		result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
		result = prime * result + ((getSchoolTitle() == null) ? 0 : getSchoolTitle().hashCode());
		result = prime * result + ((getCreatTime() == null) ? 0 : getCreatTime().hashCode());
		result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
		return result;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table education
	 *
	 * @mbggenerated
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", userId=").append(userId);
		sb.append(", userName=").append(userName);
		sb.append(", startTime=").append(startTime);
		sb.append(", endTime=").append(endTime);
		sb.append(", schoolTitle=").append(schoolTitle);
		sb.append(", creatTime=").append(creatTime);
		sb.append(", updateTime=").append(updateTime);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}