package code.seven.zh_project.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the t_customer_search database table.
 * 
 */
@Entity
@Table(name="t_customer_search")
@NamedQuery(name="CustomerSearch.findAll", query="SELECT c FROM CustomerSearch c")
public class CustomerSearch extends DefaultDomain implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="search_id")
	private String searchId;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="customer_id")
	private String customerId;

	private String ip;

	@Column(name="search_content")
	private String searchContent;

	public CustomerSearch() {
	}

	public String getSearchId() {
		return this.searchId;
	}

	public void setSearchId(String searchId) {
		this.searchId = searchId;
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

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getSearchContent() {
		return this.searchContent;
	}

	public void setSearchContent(String searchContent) {
		this.searchContent = searchContent;
	}

}