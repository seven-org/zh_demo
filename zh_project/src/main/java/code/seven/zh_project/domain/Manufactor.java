package code.seven.zh_project.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the t_manufactor database table.
 * 
 */
@Entity
@Table(name="t_manufactor")
@NamedQuery(name="Manufactor.findAll", query="SELECT m FROM Manufactor m")
public class Manufactor extends DefaultDomain implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String address;

	@Column(name="area_code")
	private String areaCode;

	@Column(name="city_code")
	private String cityCode;

	@Column(name="contacts_name")
	private String contactsName;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="create_id")
	private String createId;

	@Column(name="invoice_remark")
	private String invoiceRemark;

	@Column(name="manufactor_code")
	private String manufactorCode;

	@Column(name="manufactor_name")
	private String manufactorName;

	@Column(name="payment_remark")
	private String paymentRemark;

	private String phone;

	@Column(name="phone_two")
	private String phoneTwo;

	private String pinyin;

	@Column(name="provice_code")
	private String proviceCode;

	private String remark;

	@Column(name="set_top")
	private String setTop;

	private String state;

	@Column(name="type_code")
	private String typeCode;

	@Column(name="update_date")
	private Timestamp updateDate;

	@Column(name="update_id")
	private String updateId;

	public Manufactor() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAreaCode() {
		return this.areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getCityCode() {
		return this.cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getContactsName() {
		return this.contactsName;
	}

	public void setContactsName(String contactsName) {
		this.contactsName = contactsName;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public String getCreateId() {
		return this.createId;
	}

	public void setCreateId(String createId) {
		this.createId = createId;
	}

	public String getInvoiceRemark() {
		return this.invoiceRemark;
	}

	public void setInvoiceRemark(String invoiceRemark) {
		this.invoiceRemark = invoiceRemark;
	}

	public String getManufactorCode() {
		return this.manufactorCode;
	}

	public void setManufactorCode(String manufactorCode) {
		this.manufactorCode = manufactorCode;
	}

	public String getManufactorName() {
		return this.manufactorName;
	}

	public void setManufactorName(String manufactorName) {
		this.manufactorName = manufactorName;
	}

	public String getPaymentRemark() {
		return this.paymentRemark;
	}

	public void setPaymentRemark(String paymentRemark) {
		this.paymentRemark = paymentRemark;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhoneTwo() {
		return this.phoneTwo;
	}

	public void setPhoneTwo(String phoneTwo) {
		this.phoneTwo = phoneTwo;
	}

	public String getPinyin() {
		return this.pinyin;
	}

	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}

	public String getProviceCode() {
		return this.proviceCode;
	}

	public void setProviceCode(String proviceCode) {
		this.proviceCode = proviceCode;
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

	public String getTypeCode() {
		return this.typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public Timestamp getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdateId() {
		return this.updateId;
	}

	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}

}