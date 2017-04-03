package utils.db.converter;

import android.database.Cursor;

import utils.db.sqlite.ColumnDbType;

/**
 * info:
 * date: 2017/4/3  16 ：54
 * mode:  - -!
 * author: Lvmoy
 */

public class ShortColumnConverter implements ColumnConverter<Short> {
    @Override
    public Short getFieldValue(final Cursor cursor, int index) {
        return cursor.isNull(index) ? null : cursor.getShort(index);
    }

    @Override
    public Object fieldValue2DbValue(Short fieldValue) {
        return fieldValue;
    }

    @Override
    public ColumnDbType getColumnDbType() {
        return ColumnDbType.INTEGER;
    }
}
