package com.yiguo.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * User实体类
 * 
 * @author liyue
 * @date 2018-01-23
 */
public class User implements Serializable {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column user.id
	 *
	 * @mbggenerated
	 */
	private Integer id;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column user.name
	 *
	 * @mbggenerated
	 */
	private String name;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column user.username
	 *
	 * @mbggenerated
	 */
	private String username;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column user.password
	 *
	 * @mbggenerated
	 */
	private String password;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column user.sex
	 *
	 * @mbggenerated
	 */
	private Integer sex;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column user.email
	 *
	 * @mbggenerated
	 */
	private String email;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column user.phone
	 *
	 * @mbggenerated
	 */
	private String phone;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column user.school_id
	 *
	 * @mbggenerated
	 */
	private Integer schoolId;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column user.major_id
	 *
	 * @mbggenerated
	 */
	private Integer majorId;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column user.education
	 *
	 * @mbggenerated
	 */
	private Integer education;
	private Integer age;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column user.create_time
	 *
	 * @mbggenerated
	 */
	private Date createTime;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column user.update_time
	 *
	 * @mbggenerated
	 */
	private Date updateTime;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database table user
	 *
	 * @mbggenerated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column user.id
	 *
	 * @return the value of user.id
	 *
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column user.id
	 *
	 * @param id
	 *            the value for user.id
	 *
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column user.name
	 *
	 * @return the value of user.name
	 *
	 * @mbggenerated
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column user.name
	 *
	 * @param name
	 *            the value for user.name
	 *
	 * @mbggenerated
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column user.username
	 *
	 * @return the value of user.username
	 *
	 * @mbggenerated
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column user.username
	 *
	 * @param username
	 *            the value for user.username
	 *
	 * @mbggenerated
	 */
	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column user.password
	 *
	 * @return the value of user.password
	 *
	 * @mbggenerated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column user.password
	 *
	 * @param password
	 *            the value for user.password
	 *
	 * @mbggenerated
	 */
	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column user.sex
	 *
	 * @return the value of user.sex
	 *
	 * @mbggenerated
	 */
	public Integer getSex() {
		return sex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column user.sex
	 *
	 * @param sex
	 *            the value for user.sex
	 *
	 * @mbggenerated
	 */
	public void setSex(Integer sex) {
		this.sex = sex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column user.email
	 *
	 * @return the value of user.email
	 *
	 * @mbggenerated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column user.email
	 *
	 * @param email
	 *            the value for user.email
	 *
	 * @mbggenerated
	 */
	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column user.phone
	 *
	 * @return the value of user.phone
	 *
	 * @mbggenerated
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column user.phone
	 *
	 * @param phone
	 *            the value for user.phone
	 *
	 * @mbggenerated
	 */
	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column user.school_id
	 *
	 * @return the value of user.school_id
	 *
	 * @mbggenerated
	 */
	public Integer getSchoolId() {
		return schoolId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column user.school_id
	 *
	 * @param schoolId
	 *            the value for user.school_id
	 *
	 * @mbggenerated
	 */
	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column user.major_id
	 *
	 * @return the value of user.major_id
	 *
	 * @mbggenerated
	 */
	public Integer getMajorId() {
		return majorId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column user.major_id
	 *
	 * @param majorId
	 *            the value for user.major_id
	 *
	 * @mbggenerated
	 */
	public void setMajorId(Integer majorId) {
		this.majorId = majorId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column user.education
	 *
	 * @return the value of user.education
	 *
	 * @mbggenerated
	 */
	public Integer getEducation() {
		return education;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column user.education
	 *
	 * @param education
	 *            the value for user.education
	 *
	 * @mbggenerated
	 */
	public void setEducation(Integer education) {
		this.education = education;
	}
	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age= age;
	}
	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column user.create_time
	 *
	 * @return the value of user.create_time
	 *
	 * @mbggenerated
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column user.create_time
	 *
	 * @param createTime
	 *            the value for user.create_time
	 *
	 * @mbggenerated
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column user.update_time
	 *
	 * @return the value of user.update_time
	 *
	 * @mbggenerated
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column user.update_time
	 *
	 * @param updateTime
	 *            the value for user.update_time
	 *
	 * @mbggenerated
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table user
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
		User other = (User) that;
		return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
				&& (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
				&& (this.getUsername() == null ? other.getUsername() == null
						: this.getUsername().equals(other.getUsername()))
				&& (this.getPassword() == null ? other.getPassword() == null
						: this.getPassword().equals(other.getPassword()))
				&& (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
				&& (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
				&& (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
				&& (this.getSchoolId() == null ? other.getSchoolId() == null
						: this.getSchoolId().equals(other.getSchoolId()))
				&& (this.getMajorId() == null ? other.getMajorId() == null
						: this.getMajorId().equals(other.getMajorId()))
				&& (this.getEducation() == null ? other.getEducation() == null
						: this.getEducation().equals(other.getEducation()))
				&& (this.getCreateTime() == null ? other.getCreateTime() == null
						: this.getCreateTime().equals(other.getCreateTime()))
				&& (this.getUpdateTime() == null ? other.getUpdateTime() == null
						: this.getUpdateTime().equals(other.getUpdateTime()));
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table user
	 *
	 * @mbggenerated
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
		result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
		result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
		result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
		result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
		result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
		result = prime * result + ((getSchoolId() == null) ? 0 : getSchoolId().hashCode());
		result = prime * result + ((getMajorId() == null) ? 0 : getMajorId().hashCode());
		result = prime * result + ((getEducation() == null) ? 0 : getEducation().hashCode());
		result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
		result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
		return result;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table user
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
		sb.append(", name=").append(name);
		sb.append(", username=").append(username);
		sb.append(", password=").append(password);
		sb.append(", sex=").append(sex);
		sb.append(", email=").append(email);
		sb.append(", phone=").append(phone);
		sb.append(", schoolId=").append(schoolId);
		sb.append(", majorId=").append(majorId);
		sb.append(", education=").append(education);
		sb.append(", createTime=").append(createTime);
		sb.append(", updateTime=").append(updateTime);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}