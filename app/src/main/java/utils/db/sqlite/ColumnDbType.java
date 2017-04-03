package utils.db.sqlite;

/**
 * info:
 * date: 2017/4/3  16 ：45
 * mode:  - -!
 * author: Lvmoy
 */

public enum ColumnDbType {

    INTEGER("INTEGER"), REAL("REAL"), TEXT("TEXT"), BLOB("BLOB");

    private String value;

    ColumnDbType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
