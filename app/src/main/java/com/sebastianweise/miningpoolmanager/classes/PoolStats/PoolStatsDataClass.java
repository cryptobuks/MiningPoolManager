package com.sebastianweise.miningpoolmanager.classes.PoolStats;

import com.sebastianweise.miningpoolmanager.classes.MinedBlockClass;
import com.sebastianweise.miningpoolmanager.classes.PriceClass;

import java.util.List;

public class PoolStatsDataClass {
    List<Object> topMiners = null;
    List<MinedBlockClass> minedBlocks = null;
    PoolStatsClass poolStats;
    PriceClass price;


    public List<Object> getTopMiners() { return topMiners; }

    public void setTopMiners(List<Object> topMiners) { this.topMiners = topMiners; }

    public List<MinedBlockClass> getMinedBlocks() { return minedBlocks; }

    public void setMinedBlocks(List<MinedBlockClass> minedBlocks) { this.minedBlocks = minedBlocks; }

    public PoolStatsClass getPoolStats() { return poolStats; }

    public void setPoolStats(PoolStatsClass poolStats) { this.poolStats = poolStats; }

    public PriceClass getPrice() { return price; }

    public void setPrice(PriceClass price) { this.price = price; }
}
