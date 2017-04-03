package utils.db.converter;

import android.database.Cursor;

import java.util.Date;

import utils.db.sqlite.ColumnDbType;

/**
 * info:
 * date: 2017/4/3  16 ：52
 * mode:  - -!
 * author: Lvmoy
 */

public class DateColumnConverter implements ColumnConverter<Date> {
    @Override
    public Date getFieldValue(final Cursor cursor, int index) {
        return cursor.isNull(index) ? null : new Date(cursor.getLong(index));
    }

    @Override
    public Object fieldValue2DbValue(Date fieldValue) {
        if (fieldValue == null) return null;
        return fieldValue.getTime();
    }

    @Override
    public ColumnDbType getColumnDbType() {
        return ColumnDbType.INTEGER;
    }
}
