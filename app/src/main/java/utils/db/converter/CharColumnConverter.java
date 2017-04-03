package utils.db.converter;

import android.database.Cursor;

import utils.db.sqlite.ColumnDbType;

/**
 * info:
 * date: 2017/4/3  16 ：50
 * mode:  - -!
 * author: Lvmoy
 */

public class CharColumnConverter implements ColumnConverter<Character> {
    @Override
    public Character getFieldValue(final Cursor cursor, int index) {
        return cursor.isNull(index) ? null : (char) cursor.getInt(index);
    }

    @Override
    public Object fieldValue2DbValue(Character fieldValue) {
        if (fieldValue == null) return null;
        return (int) fieldValue;
    }

    @Override
    public ColumnDbType getColumnDbType() {
        return ColumnDbType.INTEGER;
    }
}
