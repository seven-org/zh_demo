package code.seven.zh_project.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the t_plastic_template database table.
 * 
 */
@Entity
@Table(name="t_plastic_template")
@NamedQuery(name="PlasticTemplate.findAll", query="SELECT p FROM PlasticTemplate p")
public class PlasticTemplate extends DefaultDomain implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String color;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="create_user")
	private String createUser;

	@Column(name="has_physical")
	private String hasPhysical;

	private String name;

	private String purpose;

	private String remark;

	@Column(name="review_date")
	private Timestamp reviewDate;

	@Column(name="review_state")
	private String reviewState;

	@Column(name="spec_long")
	private String specLong;

	@Column(name="spec_thick")
	private String specThick;

	@Column(name="spec_wide")
	private String specWide;

	@Column(name="template_img")
	private String templateImg;

	@Column(name="template_state")
	private String templateState;

	@Column(name="update_date")
	private Timestamp updateDate;

	public PlasticTemplate() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getHasPhysical() {
		return this.hasPhysical;
	}

	public void setHasPhysical(String hasPhysical) {
		this.hasPhysical = hasPhysical;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPurpose() {
		return this.purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Timestamp getReviewDate() {
		return this.reviewDate;
	}

	public void setReviewDate(Timestamp reviewDate) {
		this.reviewDate = reviewDate;
	}

	public String getReviewState() {
		return this.reviewState;
	}

	public void setReviewState(String reviewState) {
		this.reviewState = reviewState;
	}

	public String getSpecLong() {
		return this.specLong;
	}

	public void setSpecLong(String specLong) {
		this.specLong = specLong;
	}

	public String getSpecThick() {
		return this.specThick;
	}

	public void setSpecThick(String specThick) {
		this.specThick = specThick;
	}

	public String getSpecWide() {
		return this.specWide;
	}

	public void setSpecWide(String specWide) {
		this.specWide = specWide;
	}

	public String getTemplateImg() {
		return this.templateImg;
	}

	public void setTemplateImg(String templateImg) {
		this.templateImg = templateImg;
	}

	public String getTemplateState() {
		return this.templateState;
	}

	public void setTemplateState(String templateState) {
		this.templateState = templateState;
	}

	public Timestamp getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

}