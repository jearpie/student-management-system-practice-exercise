package main;

public enum YearLevel {
    FIRST_YEAR,
    SECOND_YEAR,
    THIRD_YEAR,
    FOURTH_YEAR,
    FIFTH_YEAR; // Added 5th year constant

    @Override
    public String toString() {
        switch (this) {
            case FIRST_YEAR: return "1st Year";
            case SECOND_YEAR: return "2nd Year";
            case THIRD_YEAR: return "3rd Year";
            case FOURTH_YEAR: return "4th Year";
            case FIFTH_YEAR: return "5th Year"; // Added formatted text
            default: return "";
        }
    }
}