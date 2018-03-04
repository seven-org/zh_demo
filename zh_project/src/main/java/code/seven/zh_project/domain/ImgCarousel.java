package code.seven.zh_project.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the t_img_carousel database table.
 * 
 */
@Entity
@Table(name="t_img_carousel")
@NamedQuery(name="ImgCarousel.findAll", query="SELECT i FROM ImgCarousel i")
public class ImgCarousel extends DefaultDomain implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="carousel_id")
	private String carouselId;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="img_state")
	private String imgState;

	@Column(name="img_url")
	private String imgUrl;

	@Column(name="link_type")
	private String linkType;

	@Column(name="link_url")
	private String linkUrl;

	private String remark;

	@Column(name="set_top")
	private String setTop;

	private String state;

	public ImgCarousel() {
	}

	public String getCarouselId() {
		return this.carouselId;
	}

	public void setCarouselId(String carouselId) {
		this.carouselId = carouselId;
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

	public String getLinkType() {
		return this.linkType;
	}

	public void setLinkType(String linkType) {
		this.linkType = linkType;
	}

	public String getLinkUrl() {
		return this.linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
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

}