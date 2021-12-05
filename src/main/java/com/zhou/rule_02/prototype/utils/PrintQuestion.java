package com.zhou.rule_02.prototype.utils;

import com.zhou.rule_02.prototype.model.ChoiceQuestion;
import com.zhou.rule_02.prototype.model.QuestionBank;
import com.zhou.rule_02.prototype.model.TextQuestion;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import lombok.experimental.UtilityClass;

/**
 * @author zhoubing
 * @date 2021-11-27 15:20
 */
@UtilityClass
public class PrintQuestion {
    public static void printQuestionBank(QuestionBank questionBank) {
        if (questionBank == null) {
            System.out.println("题库为空，无需打印");
            return;
        }

        List<ChoiceQuestion> choiceQuestions =
            Optional.ofNullable(questionBank.getChoiceQuestions()).orElse(new ArrayList<>());

        List<TextQuestion> textQuestions =
            Optional.ofNullable(questionBank.getTextQuestions()).orElse(new ArrayList<>());


        for (int i = 0; i < choiceQuestions.size(); i++) {
            ChoiceQuestion choiceQuestion = choiceQuestions.get(i);
            StringBuilder stringBuilder =
                new StringBuilder(String.format("第%d题: %s\n", i + 1, choiceQuestion.getKey()));
            Set<Map.Entry<String, String>> entries = choiceQuestion.getOption().entrySet();
            for (Map.Entry<String, String> entry : entries) {
                String key = entry.getKey();
                String value = entry.getValue();
                stringBuilder.append(String.format("%s.%s\n", key, value));
            }
            stringBuilder.append(String.format("答案是:%s", choiceQuestion.getAnswer()));
            System.out.println(stringBuilder.toString());
        }

        int questionSize = choiceQuestions.size();
        for (int i = 0; i < textQuestions.size(); i++) {
            TextQuestion textQuestion = textQuestions.get(i);
            StringBuilder stringBuilder =
                new StringBuilder(String.format("第%d题: %s\n", questionSize + i + 1, textQuestion.getKey()));
            stringBuilder.append(String.format("答案是：%s", textQuestion.getAnswer()));
            System.out.println(stringBuilder.toString());
        }

    }

}
