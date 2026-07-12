package ru.Homework13;

import java.util.List;
import java.util.Objects;

public class MissionReport {
    public String missionName;
    public List<Alien> capturedAliens;
    public int squadSize;


    public MissionReport(String missionName, List<Alien> capturedAliens, int squadSize) {
        this.missionName = missionName;
        this.capturedAliens = capturedAliens;
        this.squadSize = squadSize;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MissionReport that = (MissionReport) obj;
        return squadSize == that.squadSize &&
                Objects.equals(missionName, that.missionName) &&
                Objects.equals(capturedAliens, that.capturedAliens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(missionName, capturedAliens, squadSize);
    }

    @Override
    public String toString() {
        return String.format(
                "Миссия: %s%nПоймано пришельцев: %d%nРазмер отряда: %d%nПойманные пришельцы: %s",
                missionName,
                capturedAliens != null ? capturedAliens.size() : 0,
                squadSize,
                capturedAliens != null ? capturedAliens : "[]"
        );
    }
}
