package code.seven.zh_project.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the t_customer_feedback database table.
 * 
 */
@Entity
@Table(name="t_customer_feedback")
@NamedQuery(name="CustomerFeedback.findAll", query="SELECT c FROM CustomerFeedback c")
public class CustomerFeedback extends DefaultDomain implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="feedback_id")
	private String feedbackId;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="customer_id")
	private String customerId;

	@Column(name="feedback_content")
	private String feedbackContent;

	public CustomerFeedback() {
	}

	public String getFeedbackId() {
		return this.feedbackId;
	}

	public void setFeedbackId(String feedbackId) {
		this.feedbackId = feedbackId;
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

	public String getFeedbackContent() {
		return this.feedbackContent;
	}

	public void setFeedbackContent(String feedbackContent) {
		this.feedbackContent = feedbackContent;
	}

}