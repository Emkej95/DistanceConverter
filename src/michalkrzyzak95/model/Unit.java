package michalkrzyzak95.model;

public enum Unit {


    METER("m", "meter"),
    CENTIMETER("cm", "centimeter"),
    MILIMETER("mm", "milimeter"),
    KILOMETER("km", "kilometer");
    // FullName możesz wykorzystać do drukowania.
    // Najpierw zrób ja ja, bez wprowadzania, tylko na szytwno zobacz czy działa kod.
    // Później sobie zrób obsługę wejśćia.

    private String code;
    private String fullName;

    Unit(String code, String fullName) {
        this.code = code;
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCode() {
        return code;
    }
}
