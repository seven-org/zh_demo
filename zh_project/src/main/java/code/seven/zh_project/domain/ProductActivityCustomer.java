package code.seven.zh_project.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the t_product_activity_customer database table.
 * 
 */
@Entity
@Table(name="t_product_activity_customer")
@NamedQuery(name="ProductActivityCustomer.findAll", query="SELECT p FROM ProductActivityCustomer p")
public class ProductActivityCustomer extends DefaultDomain implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="activity_id")
	private String activityId;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="create_id")
	private String createId;

	@Column(name="customer_id")
	private String customerId;

	private String id;

	private String state;

	@Column(name="use_date")
	private Timestamp useDate;

	@Column(name="use_state")
	private String useState;

	public ProductActivityCustomer() {
	}

	public String getActivityId() {
		return this.activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
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

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
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