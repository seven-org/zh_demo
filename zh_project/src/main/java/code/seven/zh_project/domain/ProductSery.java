package code.seven.zh_project.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the t_product_series database table.
 * 
 */
@Entity
@Table(name="t_product_series")
@NamedQuery(name="ProductSery.findAll", query="SELECT p FROM ProductSery p")
public class ProductSery extends DefaultDomain implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="series_id")
	private String seriesId;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="kind_code")
	private String kindCode;

	@Column(name="kind_name")
	private String kindName;

	@Column(name="series_code")
	private String seriesCode;

	@Column(name="series_name")
	private String seriesName;

	@Column(name="set_top")
	private String setTop;

	private String state;

	public ProductSery() {
	}

	public String getSeriesId() {
		return this.seriesId;
	}

	public void setSeriesId(String seriesId) {
		this.seriesId = seriesId;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public String getKindCode() {
		return this.kindCode;
	}

	public void setKindCode(String kindCode) {
		this.kindCode = kindCode;
	}

	public String getKindName() {
		return this.kindName;
	}

	public void setKindName(String kindName) {
		this.kindName = kindName;
	}

	public String getSeriesCode() {
		return this.seriesCode;
	}

	public void setSeriesCode(String seriesCode) {
		this.seriesCode = seriesCode;
	}

	public String getSeriesName() {
		return this.seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
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