package com.guoyd.interview.lock;

public enum FourSeasonsEnum {

    spring("01", "春"),
    summer("02", "夏"),
    autumn("03", "秋"),
    winter("04", "冬");

    private String str;
    private String season;

    FourSeasonsEnum(String str, String season) {
        this.str = str;
        this.season = season;
    }

    public static FourSeasonsEnum foreach_Season(String str) {
        FourSeasonsEnum[] enums = FourSeasonsEnum.values();
        for (FourSeasonsEnum four : enums) {
            if (str.equals(four.getStr())) {
                return four;
            }
        }
        return null;
    }

    public String getStr() {
        return str;
    }

    public String getSeason() {
        return season;
    }
}
