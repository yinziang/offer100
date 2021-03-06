package com.yiguo.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * Major的实体类
 * 
 * @author liyue
 * @date 2018-01-23
 */
public class Major implements Serializable {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column major.id
	 *
	 * @mbggenerated
	 */
	private Integer id;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column major.classify_1
	 *
	 * @mbggenerated
	 */
	private String classify1;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column major.classify_2
	 *
	 * @mbggenerated
	 */
	private String classify2;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column major.code
	 *
	 * @mbggenerated
	 */
	private String code;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column major.name
	 *
	 * @mbggenerated
	 */
	private String name;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column major.institute
	 *
	 * @mbggenerated
	 */
	private String institute;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column major.school_id
	 *
	 * @mbggenerated
	 */
	private Integer schoolId;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column major.create_time
	 *
	 * @mbggenerated
	 */
	private Date createTime;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database column major.update_time
	 *
	 * @mbggenerated
	 */
	private Date updateTime;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the
	 * database table major
	 *
	 * @mbggenerated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column major.id
	 *
	 * @return the value of major.id
	 *
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column major.id
	 *
	 * @param id
	 *            the value for major.id
	 *
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column major.classify_1
	 *
	 * @return the value of major.classify_1
	 *
	 * @mbggenerated
	 */
	public String getClassify1() {
		return classify1;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column major.classify_1
	 *
	 * @param classify1
	 *            the value for major.classify_1
	 *
	 * @mbggenerated
	 */
	public void setClassify1(String classify1) {
		this.classify1 = classify1 == null ? null : classify1.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column major.classify_2
	 *
	 * @return the value of major.classify_2
	 *
	 * @mbggenerated
	 */
	public String getClassify2() {
		return classify2;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column major.classify_2
	 *
	 * @param classify2
	 *            the value for major.classify_2
	 *
	 * @mbggenerated
	 */
	public void setClassify2(String classify2) {
		this.classify2 = classify2 == null ? null : classify2.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column major.code
	 *
	 * @return the value of major.code
	 *
	 * @mbggenerated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column major.code
	 *
	 * @param code
	 *            the value for major.code
	 *
	 * @mbggenerated
	 */
	public void setCode(String code) {
		this.code = code == null ? null : code.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column major.name
	 *
	 * @return the value of major.name
	 *
	 * @mbggenerated
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column major.name
	 *
	 * @param name
	 *            the value for major.name
	 *
	 * @mbggenerated
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column major.institute
	 *
	 * @return the value of major.institute
	 *
	 * @mbggenerated
	 */
	public String getInstitute() {
		return institute;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column major.institute
	 *
	 * @param institute
	 *            the value for major.institute
	 *
	 * @mbggenerated
	 */
	public void setInstitute(String institute) {
		this.institute = institute == null ? null : institute.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column major.school_id
	 *
	 * @return the value of major.school_id
	 *
	 * @mbggenerated
	 */
	public Integer getSchoolId() {
		return schoolId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column major.school_id
	 *
	 * @param schoolId
	 *            the value for major.school_id
	 *
	 * @mbggenerated
	 */
	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column major.create_time
	 *
	 * @return the value of major.create_time
	 *
	 * @mbggenerated
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column major.create_time
	 *
	 * @param createTime
	 *            the value for major.create_time
	 *
	 * @mbggenerated
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value
	 * of the database column major.update_time
	 *
	 * @return the value of major.update_time
	 *
	 * @mbggenerated
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of
	 * the database column major.update_time
	 *
	 * @param updateTime
	 *            the value for major.update_time
	 *
	 * @mbggenerated
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table major
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
		Major other = (Major) that;
		return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
				&& (this.getClassify1() == null ? other.getClassify1() == null
						: this.getClassify1().equals(other.getClassify1()))
				&& (this.getClassify2() == null ? other.getClassify2() == null
						: this.getClassify2().equals(other.getClassify2()))
				&& (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
				&& (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
				&& (this.getInstitute() == null ? other.getInstitute() == null
						: this.getInstitute().equals(other.getInstitute()))
				&& (this.getSchoolId() == null ? other.getSchoolId() == null
						: this.getSchoolId().equals(other.getSchoolId()))
				&& (this.getCreateTime() == null ? other.getCreateTime() == null
						: this.getCreateTime().equals(other.getCreateTime()))
				&& (this.getUpdateTime() == null ? other.getUpdateTime() == null
						: this.getUpdateTime().equals(other.getUpdateTime()));
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table major
	 *
	 * @mbggenerated
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result + ((getClassify1() == null) ? 0 : getClassify1().hashCode());
		result = prime * result + ((getClassify2() == null) ? 0 : getClassify2().hashCode());
		result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
		result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
		result = prime * result + ((getInstitute() == null) ? 0 : getInstitute().hashCode());
		result = prime * result + ((getSchoolId() == null) ? 0 : getSchoolId().hashCode());
		result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
		result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
		return result;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table major
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
		sb.append(", classify1=").append(classify1);
		sb.append(", classify2=").append(classify2);
		sb.append(", code=").append(code);
		sb.append(", name=").append(name);
		sb.append(", institute=").append(institute);
		sb.append(", schoolId=").append(schoolId);
		sb.append(", createTime=").append(createTime);
		sb.append(", updateTime=").append(updateTime);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}