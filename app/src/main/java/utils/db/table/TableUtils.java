package utils.db.table;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.LinkedHashMap;

import timber.log.Timber;
import utils.db.annotation.Column;
import utils.db.converter.ColumnConverterFactory;

/**
 * info:
 * date: 2017/4/3  16 ：44
 * mode:  - -!
 * author: Lvmoy
 */

final class TableUtils {

    private TableUtils() {
    }

    /* package */
    static synchronized LinkedHashMap<String, ColumnEntity> findColumnMap(Class<?> entityType) {
        LinkedHashMap<String, ColumnEntity> columnMap = new LinkedHashMap<String, ColumnEntity>();
        addColumns2Map(entityType, columnMap);
        return columnMap;
    }

    private static void addColumns2Map(Class<?> entityType, HashMap<String, ColumnEntity> columnMap) {
        if (Object.class.equals(entityType)) return;

        try {
            Field[] fields = entityType.getDeclaredFields();
            for (Field field : fields) {
                int modify = field.getModifiers();
                if (Modifier.isStatic(modify) || Modifier.isTransient(modify)) {
                    continue;
                }
                Column columnAnn = field.getAnnotation(Column.class);
                if (columnAnn != null) {
                    if (ColumnConverterFactory.isSupportColumnConverter(field.getType())) {
                        ColumnEntity column = new ColumnEntity(entityType, field, columnAnn);
                        if (!columnMap.containsKey(column.getName())) {
                            columnMap.put(column.getName(), column);
                        }
                    }
                }
            }

            addColumns2Map(entityType.getSuperclass(), columnMap);
        } catch (Throwable e) {
            Timber.e(e.getMessage(), e);
        }
    }
}
