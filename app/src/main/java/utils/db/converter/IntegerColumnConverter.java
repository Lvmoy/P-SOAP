package utils.db.converter;

import android.database.Cursor;

import utils.db.sqlite.ColumnDbType;

/**
 * info:
 * date: 2017/4/3  16 ：53
 * mode:  - -!
 * author: Lvmoy
 */

public class IntegerColumnConverter implements ColumnConverter<Integer> {
    @Override
    public Integer getFieldValue(final Cursor cursor, int index) {
        return cursor.isNull(index) ? null : cursor.getInt(index);
    }

    @Override
    public Object fieldValue2DbValue(Integer fieldValue) {
        return fieldValue;
    }

    @Override
    public ColumnDbType getColumnDbType() {
        return ColumnDbType.INTEGER;
    }
}

