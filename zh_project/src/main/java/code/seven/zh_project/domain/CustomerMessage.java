package code.seven.zh_project.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the t_customer_message database table.
 * 
 */
@Entity
@Table(name="t_customer_message")
@NamedQuery(name="CustomerMessage.findAll", query="SELECT c FROM CustomerMessage c")
public class CustomerMessage extends DefaultDomain implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="message_id")
	private String messageId;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="customer_id")
	private String customerId;

	@Column(name="message_content")
	private String messageContent;

	@Column(name="message_link")
	private String messageLink;

	@Column(name="message_state")
	private String messageState;

	@Column(name="message_title")
	private String messageTitle;

	@Column(name="message_type")
	private String messageType;

	private String state;

	@Column(name="update_date")
	private Timestamp updateDate;

	public CustomerMessage() {
	}

	public String getMessageId() {
		return this.messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
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

	public String getMessageContent() {
		return this.messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}

	public String getMessageLink() {
		return this.messageLink;
	}

	public void setMessageLink(String messageLink) {
		this.messageLink = messageLink;
	}

	public String getMessageState() {
		return this.messageState;
	}

	public void setMessageState(String messageState) {
		this.messageState = messageState;
	}

	public String getMessageTitle() {
		return this.messageTitle;
	}

	public void setMessageTitle(String messageTitle) {
		this.messageTitle = messageTitle;
	}

	public String getMessageType() {
		return this.messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Timestamp getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

}