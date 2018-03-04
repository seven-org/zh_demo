package code.seven.zh_project.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the t_product_detail database table.
 * 
 */
@Entity
@Table(name="t_product_detail")
@NamedQuery(name="ProductDetail.findAll", query="SELECT p FROM ProductDetail p")
public class ProductDetail extends DefaultDomain implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="detail_id")
	private String detailId;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="original_price")
	private BigDecimal originalPrice;

	private String packing;

	@Column(name="packing_num")
	private String packingNum;

	@Column(name="packing_unit")
	private String packingUnit;

	private BigDecimal price;

	@Column(name="release_state")
	private String releaseState;

	private String remark;

	private String spec;

	private String state;

	@Column(name="type_id")
	private String typeId;

	public ProductDetail() {
	}

	public String getDetailId() {
		return this.detailId;
	}

	public void setDetailId(String detailId) {
		this.detailId = detailId;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public BigDecimal getOriginalPrice() {
		return this.originalPrice;
	}

	public void setOriginalPrice(BigDecimal originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getPacking() {
		return this.packing;
	}

	public void setPacking(String packing) {
		this.packing = packing;
	}

	public String getPackingNum() {
		return this.packingNum;
	}

	public void setPackingNum(String packingNum) {
		this.packingNum = packingNum;
	}

	public String getPackingUnit() {
		return this.packingUnit;
	}

	public void setPackingUnit(String packingUnit) {
		this.packingUnit = packingUnit;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getReleaseState() {
		return this.releaseState;
	}

	public void setReleaseState(String releaseState) {
		this.releaseState = releaseState;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSpec() {
		return this.spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTypeId() {
		return this.typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

}