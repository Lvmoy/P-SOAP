package utils.db.converter;

import android.database.Cursor;

import utils.db.sqlite.ColumnDbType;

/**
 * info:
 * date: 2017/4/3  16 ：53
 * mode:  - -!
 * author: Lvmoy
 */

public class DoubleColumnConverter implements ColumnConverter<Double> {
    @Override
    public Double getFieldValue(final Cursor cursor, int index) {
        return cursor.isNull(index) ? null : cursor.getDouble(index);
    }

    @Override
    public Object fieldValue2DbValue(Double fieldValue) {
        return fieldValue;
    }

    @Override
    public ColumnDbType getColumnDbType() {
        return ColumnDbType.REAL;
    }
}
