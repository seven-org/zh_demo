package code.seven.zh_project.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the t_product_type_menu database table.
 * 
 */
@Entity
@Table(name="t_product_type_menu")
@NamedQuery(name="ProductTypeMenu.findAll", query="SELECT p FROM ProductTypeMenu p")
public class ProductTypeMenu extends DefaultDomain implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="menu_id")
	private String menuId;

	@Column(name="create_date")
	private Timestamp createDate;

	@Column(name="menu_code")
	private String menuCode;

	@Column(name="menu_icon")
	private String menuIcon;

	@Column(name="menu_icon_after")
	private String menuIconAfter;

	@Column(name="menu_level")
	private String menuLevel;

	@Column(name="menu_name")
	private String menuName;

	@Column(name="menu_type")
	private String menuType;

	@Column(name="set_top")
	private String setTop;

	private String state;

	public ProductTypeMenu() {
	}

	public String getMenuId() {
		return this.menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public String getMenuCode() {
		return this.menuCode;
	}

	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}

	public String getMenuIcon() {
		return this.menuIcon;
	}

	public void setMenuIcon(String menuIcon) {
		this.menuIcon = menuIcon;
	}

	public String getMenuIconAfter() {
		return this.menuIconAfter;
	}

	public void setMenuIconAfter(String menuIconAfter) {
		this.menuIconAfter = menuIconAfter;
	}

	public String getMenuLevel() {
		return this.menuLevel;
	}

	public void setMenuLevel(String menuLevel) {
		this.menuLevel = menuLevel;
	}

	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuType() {
		return this.menuType;
	}

	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}

	public String getSetTop() {
		return this.setTop;
	}

	public void setSetTop(String setTop) {
		this.setTop = setTop;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

}