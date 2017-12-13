package com.jd.y.data.domain.inventory;

public class BbsInventoryNetWorkPath {
    private Long pkInventoryNetworkPath;

    private Long fromNode;

    private Long fromTenant;

    private Long toNode;

    private Long toTenant;

    private Double leadtime;

    private Double distance;

    private Double transportCapacity;

    public Long getPkInventoryNetworkPath() {
        return pkInventoryNetworkPath;
    }

    public void setPkInventoryNetworkPath(Long pkInventoryNetworkPath) {
        this.pkInventoryNetworkPath = pkInventoryNetworkPath;
    }

    public Long getFromNode() {
        return fromNode;
    }

    public void setFromNode(Long fromNode) {
        this.fromNode = fromNode;
    }

    public Long getFromTenant() {
        return fromTenant;
    }

    public void setFromTenant(Long fromTenant) {
        this.fromTenant = fromTenant;
    }

    public Long getToNode() {
        return toNode;
    }

    public void setToNode(Long toNode) {
        this.toNode = toNode;
    }

    public Long getToTenant() {
        return toTenant;
    }

    public void setToTenant(Long toTenant) {
        this.toTenant = toTenant;
    }

    public Double getLeadtime() {
        return leadtime;
    }

    public void setLeadtime(Double leadtime) {
        this.leadtime = leadtime;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getTransportCapacity() {
        return transportCapacity;
    }

    public void setTransportCapacity(Double transportCapacity) {
        this.transportCapacity = transportCapacity;
    }
}