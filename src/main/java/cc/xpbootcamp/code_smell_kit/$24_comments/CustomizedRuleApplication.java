package cc.xpbootcamp.code_smell_kit.$24_comments;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *  Comments(过多的注释)
 */
@Slf4j
public class CustomizedRuleApplication {
    public JSONObject parseExcelFile(File file, long userId, long bankId) {
        // check merchants nums not greater than 50000
        validateCurrentBank(bankId);

        JSONObject jsonObject = new JSONObject();
        //1 check excel file
        Map<String, Object> resultMap = checkExcelFile(file);

        // 用于记录错误的
        Map<String, MerchantImportErrorDto> merchantImportErrorDtoHashMap = Maps.newTreeMap();


        //2 包装merNumRowMap   key:merchantNo   value : rowNo
        Map<String, List<String>> merNumRowMap = wrapMerNumRowMap(resultMap, merchantImportErrorDtoHashMap);


        // 不重复的商户ID
        List<String> merNosDuplicatesRemoved = new ArrayList<>(merNumRowMap.keySet());

        // 3 获取有效的商户ID   1 存在  2 要在本级银行 3 没有重复（主动去重）4 对存在且商户类型为B、C进行剔除
        List<Long> merIds = getMerIds(merNosDuplicatesRemoved, merchantImportErrorDtoHashMap, merNumRowMap, bankId);


        List<MerchantImportErrorDto> merchantImportErrorDtos = new ArrayList<>();
        // order list merchantImportErrorDtos by line number
        if (MapUtils.isNotEmpty(merchantImportErrorDtoHashMap)) {
            // map 转  list
            merchantImportErrorDtos.addAll(merchantImportErrorDtoHashMap.values().stream().collect(Collectors.toList()));
        }


        int count = (int) resultMap.get("count");

        long insBatchId = 0L;
        // 4 完全正确情况下，入库 if no error, we can save insBatch
        if (merchantImportErrorDtos.isEmpty() && CollectionUtils.isNotEmpty(merIds)) {
            //update count to actual number with no duplicates
            count = merIds.size();
        }

        jsonObject.put("totalNum", count);
        jsonObject.put("errorNum", merchantImportErrorDtos.size());
        jsonObject.put("batchId", insBatchId);
        jsonObject.put("errorRecord", merchantImportErrorDtos);

        // record to redis
        save2Redis(bankId, count);
        return jsonObject;
    }

    private List<Long> getMerIds(List<String> merNosDuplicatesRemoved, Map<String, MerchantImportErrorDto> merchantImportErrorDtoHashMap, Map<String, List<String>> merNumRowMap, long bankId) {
        return null;
    }

    private Map<String, List<String>> wrapMerNumRowMap(Map<String, Object> resultMap, Map<String, MerchantImportErrorDto> merchantImportErrorDtoHashMap) {
        return null;
    }

    private Map<String, Object> checkExcelFile(File file) {
        return null;
    }

    private void validateCurrentBank(long bankId) {

    }

    private void save2Redis(long bankId, int count) {

    }

    private class MerchantImportErrorDto {
    }
}
