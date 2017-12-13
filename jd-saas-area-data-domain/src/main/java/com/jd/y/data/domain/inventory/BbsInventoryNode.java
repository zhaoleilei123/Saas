package com.jd.y.data.domain.inventory;

public class BbsInventoryNode {
    private Long pkInventoryNode;

    private String name;

    private Integer pkOrg;

    private Boolean replenishmentType;

    private Long pkOrgDept;

    private Double capacity;

    private Boolean isonline;

    private Long ownsubject;

    private Long codeLevel1;

    private Long codeLevel2;

    private Long codeLevel3;

    private Long codeLevel4;

    private Long codeLevel5;

    private String fullAddress;

    private String detailAddress;

    private Double lat;

    private Double lng;

    public Long getPkInventoryNode() {
        return pkInventoryNode;
    }

    public void setPkInventoryNode(Long pkInventoryNode) {
        this.pkInventoryNode = pkInventoryNode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPkOrg() {
        return pkOrg;
    }

    public void setPkOrg(Integer pkOrg) {
        this.pkOrg = pkOrg;
    }

    public Boolean getReplenishmentType() {
        return replenishmentType;
    }

    public void setReplenishmentType(Boolean replenishmentType) {
        this.replenishmentType = replenishmentType;
    }

    public Long getPkOrgDept() {
        return pkOrgDept;
    }

    public void setPkOrgDept(Long pkOrgDept) {
        this.pkOrgDept = pkOrgDept;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public Boolean getIsonline() {
        return isonline;
    }

    public void setIsonline(Boolean isonline) {
        this.isonline = isonline;
    }

    public Long getOwnsubject() {
        return ownsubject;
    }

    public void setOwnsubject(Long ownsubject) {
        this.ownsubject = ownsubject;
    }

    public Long getCodeLevel1() {
        return codeLevel1;
    }

    public void setCodeLevel1(Long codeLevel1) {
        this.codeLevel1 = codeLevel1;
    }

    public Long getCodeLevel2() {
        return codeLevel2;
    }

    public void setCodeLevel2(Long codeLevel2) {
        this.codeLevel2 = codeLevel2;
    }

    public Long getCodeLevel3() {
        return codeLevel3;
    }

    public void setCodeLevel3(Long codeLevel3) {
        this.codeLevel3 = codeLevel3;
    }

    public Long getCodeLevel4() {
        return codeLevel4;
    }

    public void setCodeLevel4(Long codeLevel4) {
        this.codeLevel4 = codeLevel4;
    }

    public Long getCodeLevel5() {
        return codeLevel5;
    }

    public void setCodeLevel5(Long codeLevel5) {
        this.codeLevel5 = codeLevel5;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress == null ? null : fullAddress.trim();
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress == null ? null : detailAddress.trim();
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

	@Override
	public String toString() {
		return "BbsInventoryNode [pkInventoryNode=" + pkInventoryNode
				+ ", name=" + name + ", pkOrg=" + pkOrg
				+ ", replenishmentType=" + replenishmentType + ", pkOrgDept="
				+ pkOrgDept + ", capacity=" + capacity + ", isonline="
				+ isonline + ", ownsubject=" + ownsubject + ", codeLevel1="
				+ codeLevel1 + ", codeLevel2=" + codeLevel2 + ", codeLevel3="
				+ codeLevel3 + ", codeLevel4=" + codeLevel4 + ", codeLevel5="
				+ codeLevel5 + ", fullAddress=" + fullAddress
				+ ", detailAddress=" + detailAddress + ", lat=" + lat
				+ ", lng=" + lng + "]";
	}
    
}