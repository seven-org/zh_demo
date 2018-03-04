package code.seven.zh_project.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the t_plastic_order database table.
 * 
 */
@Entity
@Table(name="t_plastic_order")
@NamedQuery(name="PlasticOrder.findAll", query="SELECT p FROM PlasticOrder p")
public class PlasticOrder extends DefaultDomain implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String address;

	@Column(name="cancel_reason")
	private String cancelReason;

	@Column(name="confirm_date")
	private Timestamp confirmDate;

	@Column(name="confirm_state")
	private String confirmState;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="customer_id")
	private String customerId;

	@Column(name="customer_name")
	private String customerName;

	@Column(name="customer_require_date")
	private Timestamp customerRequireDate;

	@Column(name="distribution_date")
	private Timestamp distributionDate;

	@Column(name="distribution_state")
	private String distributionState;

	@Column(name="logistics_cost")
	private BigDecimal logisticsCost;

	private String num;

	@Column(name="order_state")
	private String orderState;

	@Column(name="other_cost")
	private BigDecimal otherCost;

	private String phone;

	@Column(name="plastic_collection_id")
	private String plasticCollectionId;

	@Column(name="printing_cost")
	private BigDecimal printingCost;

	@Column(name="product_cost")
	private String productCost;

	private String remark;

	@Column(name="total_cost")
	private BigDecimal totalCost;

	@Column(name="update_date")
	private Timestamp updateDate;

	public PlasticOrder() {
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

	public String getCancelReason() {
		return this.cancelReason;
	}

	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
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

	public Timestamp getCustomerRequireDate() {
		return this.customerRequireDate;
	}

	public void setCustomerRequireDate(Timestamp customerRequireDate) {
		this.customerRequireDate = customerRequireDate;
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

	public BigDecimal getLogisticsCost() {
		return this.logisticsCost;
	}

	public void setLogisticsCost(BigDecimal logisticsCost) {
		this.logisticsCost = logisticsCost;
	}

	public String getNum() {
		return this.num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getOrderState() {
		return this.orderState;
	}

	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}

	public BigDecimal getOtherCost() {
		return this.otherCost;
	}

	public void setOtherCost(BigDecimal otherCost) {
		this.otherCost = otherCost;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPlasticCollectionId() {
		return this.plasticCollectionId;
	}

	public void setPlasticCollectionId(String plasticCollectionId) {
		this.plasticCollectionId = plasticCollectionId;
	}

	public BigDecimal getPrintingCost() {
		return this.printingCost;
	}

	public void setPrintingCost(BigDecimal printingCost) {
		this.printingCost = printingCost;
	}

	public String getProductCost() {
		return this.productCost;
	}

	public void setProductCost(String productCost) {
		this.productCost = productCost;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public BigDecimal getTotalCost() {
		return this.totalCost;
	}

	public void setTotalCost(BigDecimal totalCost) {
		this.totalCost = totalCost;
	}

	public Timestamp getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

}