package com.sebastianweise.miningpoolmanager.classes;

public class StatsClass {
    Integer time;
    Integer reportedHashrate;
    Double currentHashrate;
    Integer validShares;
    Integer invalidShares;
    Integer staleShares;
    Integer activeWorkers;


    public Integer getTime() { return time; }

    public void setTime(Integer time) { this.time = time; }

    public Integer getReportedHashrate() { return reportedHashrate; }

    public void setReportedHashrate(Integer reportedHashrate) { this.reportedHashrate = reportedHashrate; }

    public Double getCurrentHashrate() { return currentHashrate; }

    public void setCurrentHashrate(Double currentHashrate) { this.currentHashrate = currentHashrate; }

    public Integer getValidShares() { return validShares; }

    public void setValidShares(Integer validShares) { this.validShares = validShares; }

    public Integer getInvalidShares() { return invalidShares; }

    public void setInvalidShares(Integer invalidShares) { this.invalidShares = invalidShares; }

    public Integer getStaleShares() { return staleShares; }

    public void setStaleShares(Integer staleShares) { this.staleShares = staleShares; }

    public Integer getActiveWorkers() { return activeWorkers; }

    public void setActiveWorkers(Integer activeWorkers) { this.activeWorkers = activeWorkers; }
}
