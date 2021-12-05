package com.zhou.rule_02.prototype.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhoubing
 * @date 2021-11-27 15:20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionBank {

    List<ChoiceQuestion> choiceQuestions;

    List<TextQuestion> textQuestions;
}
