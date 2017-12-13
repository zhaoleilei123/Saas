package com.jd.y.data.domain.areas;

import java.io.Serializable;

public class BbsAreas implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3489133369335436590L;
	private Integer  		pkArea;
	private Integer 	code;
	private String      name;
	private String   	alias;
	private String      nameEnUs;
	private String      postalCode;
	private Integer 		parentId;
	private Integer 	layer;
	private Integer			pkRegion;
	private Integer 		pkAreaType;
	
	public Integer getPkArea() {
		return pkArea;
	}

	public void setPkArea(Integer pkArea) {
		this.pkArea = pkArea;
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

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getLayer() {
		return layer;
	}

	public void setLayer(Integer layer) {
		this.layer = layer;
	}

	public Integer getPkRegion() {
		return pkRegion;
	}

	public void setPkRegion(Integer pkRegion) {
		this.pkRegion = pkRegion;
	}

	public Integer getPkAreaType() {
		return pkAreaType;
	}

	public void setPkAreaType(Integer pkAreaType) {
		this.pkAreaType = pkAreaType;
	}

	@Override
	public String toString() {
		return "BbsAreas [pkArea=" + pkArea + ", code=" + code + ", name="
				+ name + ", alias=" + alias + ", nameEnUs=" + nameEnUs
				+ ", postalCode=" + postalCode + ", parentId=" + parentId
				+ ", layer=" + layer + ", pkRegion=" + pkRegion
				+ ", pkAreaType=" + pkAreaType + "]";
	}
	
}
