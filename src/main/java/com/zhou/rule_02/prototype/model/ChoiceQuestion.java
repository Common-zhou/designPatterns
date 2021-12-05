package com.zhou.rule_02.prototype.model;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 选择题
 *
 * @author zhoubing
 * @date 2021-11-27 15:13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChoiceQuestion {
    // key map value
    private String key;

    private Map<String, String> option;

    private String answer;
}
