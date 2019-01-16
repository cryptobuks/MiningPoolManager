package com.sebastianweise.miningpoolmanager.classes.PoolStats;

public class PoolStatsClass {
    Double hashRate;
    Integer miners;
    Integer workers;
    Double blocksPerHour;


    public Double getHashRate() { return hashRate; }

    public void setHashRate(Double hashRate) { this.hashRate = hashRate; }

    public Integer getMiners() { return miners; }

    public void setMiners(Integer miners) { this.miners = miners; }

    public Integer getWorkers() { return workers; }

    public void setWorkers(Integer workers) { this.workers = workers; }

    public Double getBlocksPerHour() { return blocksPerHour; }

    public void setBlocksPerHour(Double blocksPerHour) { this.blocksPerHour = blocksPerHour; }
}
