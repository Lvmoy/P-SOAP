package utils.db;

/**
 * info:
 * date: 2017/4/3  17 ：04
 * mode:  - -!
 * author: Lvmoy
 */

public class DbException extends Exception {
    private static final long serialVersionUID = 1L;

    public DbException() {
    }

    public DbException(String detailMessage) {
        super(detailMessage);
    }

    public DbException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }

    public DbException(Throwable throwable) {
        super(throwable);
    }
}
