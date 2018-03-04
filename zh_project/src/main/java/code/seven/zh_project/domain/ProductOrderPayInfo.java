package code.seven.zh_project.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the t_product_order_pay_info database table.
 * 
 */
@Entity
@Table(name="t_product_order_pay_info")
@NamedQuery(name="ProductOrderPayInfo.findAll", query="SELECT p FROM ProductOrderPayInfo p")
public class ProductOrderPayInfo extends DefaultDomain implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="pay_info_id")
	private String payInfoId;

	@Column(name="bank_card_no")
	private String bankCardNo;

	@Column(name="bank_name")
	private String bankName;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="create_id")
	private String createId;

	@Column(name="device_info")
	private String deviceInfo;

	@Column(name="open_id")
	private String openId;

	@Column(name="order_id")
	private String orderId;

	@Column(name="pay_amount")
	private BigDecimal payAmount;

	@Column(name="pay_date")
	private Timestamp payDate;

	@Column(name="pay_info_state")
	private String payInfoState;

	@Column(name="pay_ip")
	private String payIp;

	@Column(name="pay_type")
	private String payType;

	@Column(name="refund_create_date")
	private Timestamp refundCreateDate;

	@Column(name="refund_update_date")
	private Timestamp refundUpdateDate;

	@Column(name="sub_is_subscribe")
	private String subIsSubscribe;

	@Column(name="trade_state")
	private String tradeState;

	@Column(name="transaction_id")
	private String transactionId;

	@Column(name="update_date")
	private Timestamp updateDate;

	@Column(name="update_id")
	private String updateId;

	public ProductOrderPayInfo() {
	}

	public String getPayInfoId() {
		return this.payInfoId;
	}

	public void setPayInfoId(String payInfoId) {
		this.payInfoId = payInfoId;
	}

	public String getBankCardNo() {
		return this.bankCardNo;
	}

	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
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

	public String getDeviceInfo() {
		return this.deviceInfo;
	}

	public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public String getOpenId() {
		return this.openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
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

	public String getPayInfoState() {
		return this.payInfoState;
	}

	public void setPayInfoState(String payInfoState) {
		this.payInfoState = payInfoState;
	}

	public String getPayIp() {
		return this.payIp;
	}

	public void setPayIp(String payIp) {
		this.payIp = payIp;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public Timestamp getRefundCreateDate() {
		return this.refundCreateDate;
	}

	public void setRefundCreateDate(Timestamp refundCreateDate) {
		this.refundCreateDate = refundCreateDate;
	}

	public Timestamp getRefundUpdateDate() {
		return this.refundUpdateDate;
	}

	public void setRefundUpdateDate(Timestamp refundUpdateDate) {
		this.refundUpdateDate = refundUpdateDate;
	}

	public String getSubIsSubscribe() {
		return this.subIsSubscribe;
	}

	public void setSubIsSubscribe(String subIsSubscribe) {
		this.subIsSubscribe = subIsSubscribe;
	}

	public String getTradeState() {
		return this.tradeState;
	}

	public void setTradeState(String tradeState) {
		this.tradeState = tradeState;
	}

	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
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