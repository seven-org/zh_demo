package code.seven.zh_project.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the t_img_url database table.
 * 
 */
@Entity
@Table(name="t_img_url")
@NamedQuery(name="ImgUrl.findAll", query="SELECT i FROM ImgUrl i")
public class ImgUrl extends DefaultDomain implements Serializable {
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

	@Column(name="relate_id")
	private String relateId;

	private String remark;

	@Column(name="set_top")
	private String setTop;

	private String state;

	private String type;

	public ImgUrl() {
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

	public String getRelateId() {
		return this.relateId;
	}

	public void setRelateId(String relateId) {
		this.relateId = relateId;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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