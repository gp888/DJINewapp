package com.dji.GSDemo.GaodeMap;

/**
 * Created by 111112 on 2017/4/24.
 */

public enum MissionMode {
    VERTICAL_HOVER(0),
    VERTICAL_MOVE(1),
    SURROUND_HOVER(2),
    SURROUND_MOVE(3),
    HORIZONTAL_HOVER(4),
    HORIZONTAL_MOVE(5),
    SINGLEPOINT(6),
    FREEMODE(7),
    SPECIAL_MODE(8);

    private int value;

    private MissionMode(int var3) {
        this.value = var3;
    }
    public int value() {
        return this.value;
    }
    public boolean _equals(int var1) {
        return this.value == var1;
    }

    public static MissionMode find(int var0) {
        MissionMode var1 = FREEMODE;

        for(int var2 = 0; var2 < values().length; ++var2) {
            if(values()[var2]._equals(var0)) {
                var1 = values()[var2];
                break;
            }
        }

        return var1;
    }

}
