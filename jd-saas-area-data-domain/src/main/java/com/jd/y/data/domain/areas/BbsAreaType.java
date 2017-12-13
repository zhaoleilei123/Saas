package com.jd.y.data.domain.areas;

public class BbsAreaType {
	private Integer pkAreaType;
	private Integer  pkRegion;
	private Integer  layer;
	private String   name;
	private String  nameEnUs;
	public Integer getPkAreaType() {
		return pkAreaType;
	}
	public void setPkAreaType(Integer pkAreaType) {
		this.pkAreaType = pkAreaType;
	}
	public Integer getPkRegion() {
		return pkRegion;
	}
	public void setPkRegion(Integer pkRegion) {
		this.pkRegion = pkRegion;
	}
	public Integer getLayer() {
		return layer;
	}
	public void setLayer(Integer layer) {
		this.layer = layer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNameEnUs() {
		return nameEnUs;
	}
	public void setNameEnUs(String nameEnUs) {
		this.nameEnUs = nameEnUs;
	}
	@Override
	public String toString() {
		return "BbsAreaType [pkAreaType=" + pkAreaType + ", pkRegion="
				+ pkRegion + ", layer=" + layer + ", name=" + name
				+ ", nameEnUs=" + nameEnUs + "]";
	}
	

}
