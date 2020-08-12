package com.crb.ocms.canal.client.factory;


import com.crb.ocms.canal.client.util.EntryUtil;
import com.crb.ocms.canal.client.util.FieldUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;


/**
 * @author jiwei
 * @date 2020-08-12
 */
public class MapColumnModelFactory extends AbstractModelFactory<Map<String, String>> {

    @Override
    <R> R newInstance(Class<R> c, Map<String, String> valueMap) throws Exception {
        R object = c.newInstance();
        Map<String, String> columnNames = EntryUtil.getFieldName(object.getClass());
        for (Map.Entry<String, String> entry : valueMap.entrySet()) {
            String fieldName = columnNames.get(entry.getKey());
            if (StringUtils.isNotEmpty(fieldName)) {
                FieldUtil.setFieldValue(object, fieldName, entry.getValue());
            }
        }
        return object;
    }
}
