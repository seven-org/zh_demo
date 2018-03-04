package code.seven.zh_project.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the t_customer_login database table.
 * 
 */
@Entity
@Table(name="t_customer_login")
@NamedQuery(name="CustomerLogin.findAll", query="SELECT c FROM CustomerLogin c")
public class CustomerLogin extends DefaultDomain implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="login_id")
	private String loginId;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="customer_id")
	private String customerId;

	@Column(name="end_date")
	private Timestamp endDate;

	private String ip;

	public CustomerLogin() {
	}

	public String getLoginId() {
		return this.loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
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

	public Timestamp getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

}