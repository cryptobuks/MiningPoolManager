package com.sebastianweise.miningpoolmanager.classes;

public class WorkerClass {
    String worker;
    Integer time;
    Integer lastSeen;
    Integer reportedHashrate;
    Double currentHashrate;
    Integer validShares;
    Integer invalidShares;
    Integer staleShares;


    public String getWorker() { return worker; }

    public void setWorker(String worker) { this.worker = worker; }

    public Integer getTime() { return time; }

    public void setTime(Integer time) { this.time = time; }

    public Integer getLastSeen() { return lastSeen; }

    public void setLastSeen(Integer lastSeen) { this.lastSeen = lastSeen; }

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
}
