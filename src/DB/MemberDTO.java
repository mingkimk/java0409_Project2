package DB;

import java.io.Serializable;

public class MemberDTO implements Serializable{
	
//	private static final long serialVersionUID = 6384368128937761766L;
	private String id;
	private String name;
	private String pwd;
	private String adr;
	private String cell;
	private int lv; 
	
//	public MemberDTO(String id, String name,String pwd,String adr,String cell) {
//		this.id=id;
//		this.name=name;
//		this.pwd=pwd;
//		this.adr=adr;
//		this.cell=cell;
//		
//	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getAdr() {
		return adr;
	}
	public void setAdr(String adr) {
		this.adr = adr;
	}
	public String getCell() {
		return cell;
	}
	public void setCell(String cell) {
		this.cell = cell;
	}
	public int getLv() {
		return lv;
	}
	public void setLv(int lv) {
		this.lv = lv;
	}
	
}
