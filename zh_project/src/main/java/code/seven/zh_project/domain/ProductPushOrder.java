package code.seven.zh_project.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the t_product_push_order database table.
 * 
 */
@Entity
@Table(name="t_product_push_order")
@NamedQuery(name="ProductPushOrder.findAll", query="SELECT p FROM ProductPushOrder p")
public class ProductPushOrder extends DefaultDomain implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="order_id")
	private String orderId;

	private String address;

	@Column(name="area_code")
	private String areaCode;

	@Column(name="cancel_date")
	private Timestamp cancelDate;

	@Column(name="cancel_reason")
	private String cancelReason;

	@Column(name="city_code")
	private String cityCode;

	@Column(name="confirm_date")
	private Timestamp confirmDate;

	@Column(name="confirm_state")
	private String confirmState;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="create_id")
	private String createId;

	@Column(name="customer_id")
	private String customerId;

	@Column(name="customer_name")
	private String customerName;

	@Column(name="detail_id")
	private String detailId;

	@Column(name="discount_amount")
	private BigDecimal discountAmount;

	@Column(name="distribution_date")
	private Timestamp distributionDate;

	@Column(name="distribution_state")
	private String distributionState;

	@Column(name="effective_state")
	private String effectiveState;

	private String number;

	@Column(name="original_price")
	private BigDecimal originalPrice;

	private String packing;

	@Column(name="pay_amount")
	private BigDecimal payAmount;

	@Column(name="pay_date")
	private Timestamp payDate;

	@Column(name="pay_state")
	private String payState;

	private String phone;

	private BigDecimal price;

	@Column(name="provice_code")
	private String proviceCode;

	private String remark;

	private String spec;

	@Column(name="total_amount")
	private BigDecimal totalAmount;

	@Column(name="type_id")
	private String typeId;

	private String unit;

	@Column(name="update_date")
	private Timestamp updateDate;

	@Column(name="update_id")
	private String updateId;

	public ProductPushOrder() {
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
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

	public Timestamp getCancelDate() {
		return this.cancelDate;
	}

	public void setCancelDate(Timestamp cancelDate) {
		this.cancelDate = cancelDate;
	}

	public String getCancelReason() {
		return this.cancelReason;
	}

	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	public String getCityCode() {
		return this.cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public Timestamp getConfirmDate() {
		return this.confirmDate;
	}

	public void setConfirmDate(Timestamp confirmDate) {
		this.confirmDate = confirmDate;
	}

	public String getConfirmState() {
		return this.confirmState;
	}

	public void setConfirmState(String confirmState) {
		this.confirmState = confirmState;
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

	public String getDetailId() {
		return this.detailId;
	}

	public void setDetailId(String detailId) {
		this.detailId = detailId;
	}

	public BigDecimal getDiscountAmount() {
		return this.discountAmount;
	}

	public void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;
	}

	public Timestamp getDistributionDate() {
		return this.distributionDate;
	}

	public void setDistributionDate(Timestamp distributionDate) {
		this.distributionDate = distributionDate;
	}

	public String getDistributionState() {
		return this.distributionState;
	}

	public void setDistributionState(String distributionState) {
		this.distributionState = distributionState;
	}

	public String getEffectiveState() {
		return this.effectiveState;
	}

	public void setEffectiveState(String effectiveState) {
		this.effectiveState = effectiveState;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
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

	public BigDecimal getPayAmount() {
		return this.payAmount;
	}

	public void setPayAmount(BigDecimal payAmount) {
		this.payAmount = payAmount;
	}

	public Timestamp getPayDate() {
		return this.payDate;
	}

	public void setPayDate(Timestamp payDate) {
		this.payDate = payDate;
	}

	public String getPayState() {
		return this.payState;
	}

	public void setPayState(String payState) {
		this.payState = payState;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
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

	public String getSpec() {
		return this.spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public BigDecimal getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getTypeId() {
		return this.typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
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