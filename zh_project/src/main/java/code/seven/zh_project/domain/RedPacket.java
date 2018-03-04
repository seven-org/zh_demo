package code.seven.zh_project.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the t_red_packet database table.
 * 
 */
@Entity
@Table(name="t_red_packet")
@NamedQuery(name="RedPacket.findAll", query="SELECT r FROM RedPacket r")
public class RedPacket extends DefaultDomain implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Column(name="begin_time")
	private Timestamp beginTime;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="create_id")
	private String createId;

	@Column(name="end_time")
	private Timestamp endTime;

	private String number;

	@Column(name="red_packet_code")
	private String redPacketCode;

	@Column(name="red_packet_name")
	private String redPacketName;

	@Column(name="red_packet_state")
	private String redPacketState;

	@Column(name="reward_amount")
	private BigDecimal rewardAmount;

	private String state;

	@Column(name="trigger_amount")
	private BigDecimal triggerAmount;

	private String type;

	@Column(name="type_code")
	private String typeCode;

	@Column(name="update_date")
	private Timestamp updateDate;

	@Column(name="update_id")
	private String updateId;

	public RedPacket() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Timestamp getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Timestamp beginTime) {
		this.beginTime = beginTime;
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

	public Timestamp getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getRedPacketCode() {
		return this.redPacketCode;
	}

	public void setRedPacketCode(String redPacketCode) {
		this.redPacketCode = redPacketCode;
	}

	public String getRedPacketName() {
		return this.redPacketName;
	}

	public void setRedPacketName(String redPacketName) {
		this.redPacketName = redPacketName;
	}

	public String getRedPacketState() {
		return this.redPacketState;
	}

	public void setRedPacketState(String redPacketState) {
		this.redPacketState = redPacketState;
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
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