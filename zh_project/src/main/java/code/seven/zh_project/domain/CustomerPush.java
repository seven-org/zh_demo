package code.seven.zh_project.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the t_customer_push database table.
 * 
 */
@Entity
@Table(name="t_customer_push")
@NamedQuery(name="CustomerPush.findAll", query="SELECT c FROM CustomerPush c")
public class CustomerPush extends DefaultDomain implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="push_id")
	private String pushId;

	@Column(name="activity_auth")
	private String activityAuth;

	private String address;

	@Column(name="area_code")
	private String areaCode;

	@Column(name="be_invited_code")
	private String beInvitedCode;

	@Column(name="city_code")
	private String cityCode;

	@Column(name="company_name")
	private String companyName;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="customer_code")
	private String customerCode;

	@Column(name="customer_id")
	private String customerId;

	@Column(name="customer_name")
	private String customerName;

	@Column(name="customer_type")
	private String customerType;

	@Column(name="invited_code")
	private String invitedCode;

	@Column(name="open_id")
	private String openId;

	private String phone;

	@Column(name="phone_two")
	private String phoneTwo;

	@Column(name="provice_code")
	private String proviceCode;

	@Column(name="qq_number")
	private String qqNumber;

	private String remark;

	private String state;

	private String weixin;

	public CustomerPush() {
	}

	public String getPushId() {
		return this.pushId;
	}

	public void setPushId(String pushId) {
		this.pushId = pushId;
	}

	public String getActivityAuth() {
		return this.activityAuth;
	}

	public void setActivityAuth(String activityAuth) {
		this.activityAuth = activityAuth;
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

	public String getBeInvitedCode() {
		return this.beInvitedCode;
	}

	public void setBeInvitedCode(String beInvitedCode) {
		this.beInvitedCode = beInvitedCode;
	}

	public String getCityCode() {
		return this.cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public String getCustomerCode() {
		return this.customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerType() {
		return this.customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getInvitedCode() {
		return this.invitedCode;
	}

	public void setInvitedCode(String invitedCode) {
		this.invitedCode = invitedCode;
	}

	public String getOpenId() {
		return this.openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
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

	public String getProviceCode() {
		return this.proviceCode;
	}

	public void setProviceCode(String proviceCode) {
		this.proviceCode = proviceCode;
	}

	public String getQqNumber() {
		return this.qqNumber;
	}

	public void setQqNumber(String qqNumber) {
		this.qqNumber = qqNumber;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getWeixin() {
		return this.weixin;
	}

	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}

}