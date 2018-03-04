package code.seven.zh_project.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the t_product_activity database table.
 * 
 */
@Entity
@Table(name="t_product_activity")
@NamedQuery(name="ProductActivity.findAll", query="SELECT p FROM ProductActivity p")
public class ProductActivity extends DefaultDomain implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="activity_id")
	private String activityId;

	@Column(name="activity_code")
	private String activityCode;

	@Column(name="activity_name")
	private String activityName;

	@Column(name="activity_state")
	private String activityState;

	@Column(name="begin_time")
	private Timestamp beginTime;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="create_id")
	private String createId;

	@Column(name="end_time")
	private Timestamp endTime;

	private String number;

	private String period;

	@Column(name="reward_amount")
	private BigDecimal rewardAmount;

	private String state;

	@Column(name="trigger_amount")
	private BigDecimal triggerAmount;

	@Column(name="type_code")
	private String typeCode;

	public ProductActivity() {
	}

	public String getActivityId() {
		return this.activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityCode() {
		return this.activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getActivityName() {
		return this.activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActivityState() {
		return this.activityState;
	}

	public void setActivityState(String activityState) {
		this.activityState = activityState;
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

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
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

	public String getTypeCode() {
		return this.typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

}