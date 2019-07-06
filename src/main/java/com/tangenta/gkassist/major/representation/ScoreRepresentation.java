package com.tangenta.gkassist.major.representation;

import com.tangenta.gkassist.common.ddd.Representation;

public class ScoreRepresentation implements Representation {
    private final String name;
    private final String school_name;
    private final String level1;
    private final String level2;
    private final String level3;
    private final String local_batch;
    private final String province;
    private final String type;
    private final int year;
    private final double max;
    private final double min;
    private final double avg;

    public ScoreRepresentation(String name, String school_name, String level1, String level2, String level3, String local_batch, String province, String type, int year, double max, double min, double avg) {
        this.name = name;
        this.school_name = school_name;
        this.level1 = level1;
        this.level2 = level2;
        this.level3 = level3;
        this.local_batch = local_batch;
        this.province = province;
        this.type = type;
        this.year = year;
        this.max = max;
        this.min = min;
        this.avg = avg;
    }

    public String getName() {
        return name;
    }

    public String getSchool_name() {
        return school_name;
    }

    public String getLevel1() {
        return level1;
    }

    public String getLevel2() {
        return level2;
    }

    public String getLevel3() {
        return level3;
    }

    public String getLocal_batch() {
        return local_batch;
    }

    public String getProvince() {
        return province;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }

    public double getAvg() {
        return avg;
    }
}
