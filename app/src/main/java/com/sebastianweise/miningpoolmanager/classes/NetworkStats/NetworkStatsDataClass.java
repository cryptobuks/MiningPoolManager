package com.sebastianweise.miningpoolmanager.classes.NetworkStats;

public class NetworkStatsDataClass{
    Integer time;
    Double blockTime;
    Integer difficulty;
    Integer hashrate;
    Double usd;
    Double btc;


    public Integer getTime() { return time; }

    public void setTime(Integer time) { this.time = time; }

    public Double getBlockTime() { return blockTime; }

    public void setBlockTime(Double blockTime) { this.blockTime = blockTime; }

    public Integer getDifficulty() { return difficulty; }

    public void setDifficulty(Integer difficulty) { this.difficulty = difficulty; }

    public Integer getHashrate() { return hashrate; }

    public void setHashrate(Integer hashrate) { this.hashrate = hashrate; }

    public Double getUsd() { return usd; }

    public void setUsd(Double usd) { this.usd = usd; }

    public Double getBtc() { return btc; }

    public void setBtc(Double btc) { this.btc = btc; }
}
