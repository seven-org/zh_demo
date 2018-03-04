package code.seven.zh_project.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the t_plastic_img database table.
 * 
 */
@Entity
@Table(name="t_plastic_img")
@NamedQuery(name="PlasticImg.findAll", query="SELECT p FROM PlasticImg p")
public class PlasticImg extends DefaultDomain implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="img_id")
	private String imgId;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="img_state")
	private String imgState;

	@Column(name="img_url")
	private String imgUrl;

	private String remark;

	@Column(name="series_one")
	private String seriesOne;

	@Column(name="series_three")
	private String seriesThree;

	@Column(name="series_two")
	private String seriesTwo;

	@Column(name="set_top")
	private String setTop;

	private String state;

	private String type;

	public PlasticImg() {
	}

	public String getImgId() {
		return this.imgId;
	}

	public void setImgId(String imgId) {
		this.imgId = imgId;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public String getImgState() {
		return this.imgState;
	}

	public void setImgState(String imgState) {
		this.imgState = imgState;
	}

	public String getImgUrl() {
		return this.imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSeriesOne() {
		return this.seriesOne;
	}

	public void setSeriesOne(String seriesOne) {
		this.seriesOne = seriesOne;
	}

	public String getSeriesThree() {
		return this.seriesThree;
	}

	public void setSeriesThree(String seriesThree) {
		this.seriesThree = seriesThree;
	}

	public String getSeriesTwo() {
		return this.seriesTwo;
	}

	public void setSeriesTwo(String seriesTwo) {
		this.seriesTwo = seriesTwo;
	}

	public String getSetTop() {
		return this.setTop;
	}

	public void setSetTop(String setTop) {
		this.setTop = setTop;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}