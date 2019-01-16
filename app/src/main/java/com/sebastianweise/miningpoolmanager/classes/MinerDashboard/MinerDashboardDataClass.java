package com.sebastianweise.miningpoolmanager.classes.MinerDashboard;

import com.sebastianweise.miningpoolmanager.classes.CurrentStatsClass;
import com.sebastianweise.miningpoolmanager.classes.SettingsClass;
import com.sebastianweise.miningpoolmanager.classes.StatsClass;
import com.sebastianweise.miningpoolmanager.classes.WorkerClass;

import java.util.List;

public class MinerDashboardDataClass{
    List<StatsClass> statistics = null;
    List<WorkerClass> workers = null;
    CurrentStatsClass currentStatistics;
    SettingsClass settings;


    public List<StatsClass> getStatistics() { return statistics; }

    public void setStatistics(List<StatsClass> statistics) { this.statistics = statistics; }

    public List<WorkerClass> getWorkers() { return workers; }

    public void setWorkers(List<WorkerClass> workers) { this.workers = workers; }

    public CurrentStatsClass getCurrentStatistics() { return currentStatistics; }

    public void setCurrentStatistics(CurrentStatsClass currentStatistics) { this.currentStatistics = currentStatistics; }

    public SettingsClass getSettings() { return settings; }

    public void setSettings(SettingsClass settings) { this.settings = settings; }
}
