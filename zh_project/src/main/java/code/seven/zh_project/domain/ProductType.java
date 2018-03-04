package code.seven.zh_project.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the t_product_type database table.
 * 
 */
@Entity
@Table(name="t_product_type")
@NamedQuery(name="ProductType.findAll", query="SELECT p FROM ProductType p")
public class ProductType extends DefaultDomain implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="type_id")
	private String typeId;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="menu_code")
	private String menuCode;

	private String pinyin;

	@Column(name="product_name")
	private String productName;

	private String prompt;

	@Column(name="release_state")
	private String releaseState;

	private String remark;

	@Column(name="series_code")
	private String seriesCode;

	@Column(name="set_top")
	private String setTop;

	private String state;

	private String unit;

	@Column(name="use_range")
	private String useRange;

	public ProductType() {
	}

	public String getTypeId() {
		return this.typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public String getMenuCode() {
		return this.menuCode;
	}

	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}

	public String getPinyin() {
		return this.pinyin;
	}

	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getPrompt() {
		return this.prompt;
	}

	public void setPrompt(String prompt) {
		this.prompt = prompt;
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

	public String getSeriesCode() {
		return this.seriesCode;
	}

	public void setSeriesCode(String seriesCode) {
		this.seriesCode = seriesCode;
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

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getUseRange() {
		return this.useRange;
	}

	public void setUseRange(String useRange) {
		this.useRange = useRange;
	}

}