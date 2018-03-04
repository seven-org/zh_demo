package code.seven.zh_project.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_base_pinyin database table.
 * 
 */
@Entity
@Table(name="t_base_pinyin")
@NamedQuery(name="BasePinyin.findAll", query="SELECT b FROM BasePinyin b")
public class BasePinyin extends DefaultDomain implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="code_")
	private int code;

	@Column(name="pin_yin_")
	private String pinYin;

	public BasePinyin() {
	}

	public int getCode() {
		return this.code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getPinYin() {
		return this.pinYin;
	}

	public void setPinYin(String pinYin) {
		this.pinYin = pinYin;
	}

}