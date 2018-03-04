package code.seven.zh_project.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the t_red_packet_customer database table.
 * 
 */
@Entity
@Table(name="t_red_packet_customer")
@NamedQuery(name="RedPacketCustomer.findAll", query="SELECT r FROM RedPacketCustomer r")
public class RedPacketCustomer extends DefaultDomain implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="create_id")
	private String createId;

	@Column(name="customer_id")
	private String customerId;

	@Column(name="red_packet_id")
	private String redPacketId;

	@Column(name="reward_amount")
	private BigDecimal rewardAmount;

	private String state;

	@Column(name="trigger_amount")
	private BigDecimal triggerAmount;

	@Column(name="use_date")
	private Timestamp useDate;

	@Column(name="use_state")
	private String useState;

	public RedPacketCustomer() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getRedPacketId() {
		return this.redPacketId;
	}

	public void setRedPacketId(String redPacketId) {
		this.redPacketId = redPacketId;
	}

	public BigDecimal getRewardAmount() {
		return this.rewardAmount;
	}

	public void setRewardAmount(BigDecimal rewardAmount) {
		this.rewardAmount = rewardAmount;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public BigDecimal getTriggerAmount() {
		return this.triggerAmount;
	}

	public void setTriggerAmount(BigDecimal triggerAmount) {
		this.triggerAmount = triggerAmount;
	}

	public Timestamp getUseDate() {
		return this.useDate;
	}

	public void setUseDate(Timestamp useDate) {
		this.useDate = useDate;
	}

	public String getUseState() {
		return this.useState;
	}

	public void setUseState(String useState) {
		this.useState = useState;
	}

}