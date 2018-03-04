package code.seven.zh_project.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the t_activity_type database table.
 * 
 */
@Entity
@Table(name="t_activity_type")
@NamedQuery(name="ActivityType.findAll", query="SELECT a FROM ActivityType a")
public class ActivityType extends DefaultDomain implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="type_id")
	private String typeId;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="type_code")
	private String typeCode;

	@Column(name="type_name")
	private String typeName;

	public ActivityType() {
	}

	public String getTypeId() {
		return this.typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public String getTypeCode() {
		return this.typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

}