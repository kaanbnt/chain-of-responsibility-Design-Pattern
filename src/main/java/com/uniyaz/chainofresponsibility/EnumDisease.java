package com.uniyaz.chainofresponsibility;

/**
 * EnumDisease
 *
 * @author Kaan BİNAT
 * @since 5.230.0
 */
public enum EnumDisease {
    CANSER("KANSER"),
    FLU("GRİP"),
    SKIN("CİLT");

    private String level;

    EnumDisease(String level) {
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return level;
    }
}
