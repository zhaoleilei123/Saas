package com.jd.y.data.domain.areas;

public class BbsRegion {
	private Integer pkRegion;
	private Integer code;
	private String  name;
	private String 	alias;
	private String  nameEnUs;
	private String  aliasEnUs;
	public Integer getPkRegion() {
		return pkRegion;
	}
	public void setPkRegion(Integer pkRegion) {
		this.pkRegion = pkRegion;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getNameEnUs() {
		return nameEnUs;
	}
	public void setNameEnUs(String nameEnUs) {
		this.nameEnUs = nameEnUs;
	}
	public String getAliasEnUs() {
		return aliasEnUs;
	}
	public void setAliasEnUs(String aliasEnUs) {
		this.aliasEnUs = aliasEnUs;
	}
	@Override
	public String toString() {
		return "BbsRegion [pkRegion=" + pkRegion + ", code=" + code + ", name="
				+ name + ", alias=" + alias + ", nameEnUs=" + nameEnUs
				+ ", aliasEnUs=" + aliasEnUs + "]";
	}
	
	
}
