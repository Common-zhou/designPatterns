package com.zhou.rule_02.prototype.wrong;

import com.zhou.rule_02.prototype.model.ChoiceQuestion;
import com.zhou.rule_02.prototype.model.QuestionBank;
import com.zhou.rule_02.prototype.model.TextQuestion;
import com.zhou.rule_02.prototype.utils.PrintQuestion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;

/**
 * 一条道写到黑的写法
 *
 * @author zhoubing
 * @date 2021-11-27 15:10
 */
@Slf4j
public class QuestionBankController {

    public static void main(String[] args) {
        QuestionBankController questionBankController = new QuestionBankController();
        questionBankController.createPaper("小明", "1020215");
    }

    public String createPaper(String candidate, String number) {
        log.info("begin create paper, [candidate={}, number={}]", candidate, number);

        Map<String, String> map01 = new HashMap<>();
        map01.put("A", "我不是对的11");
        map01.put("B", "我不是对的12");
        map01.put("C", "我不是对的13");
        map01.put("D", "我是对的14");

        Map<String, String> map02 = new HashMap<>();
        map02.put("A", "我不是对的011");
        map02.put("B", "我是对的012");
        map02.put("C", "我不是对的013");
        map02.put("D", "我不是对的014");

        List<ChoiceQuestion> choiceQuestionList = new ArrayList<>();
        List<TextQuestion> textQuestionList = new ArrayList<>();
        ChoiceQuestion q1 = new ChoiceQuestion("1.以下哪个是对的？", map01, "D");
        ChoiceQuestion q2 = new ChoiceQuestion("2.以下哪个是对的？", map02, "B");
        choiceQuestionList.add(q1);
        choiceQuestionList.add(q2);


        TextQuestion t1 = new TextQuestion("1.文字题1", "文字题1的答案");
        TextQuestion t2 = new TextQuestion("2.文字题2", "文字题2的答案");
        textQuestionList.add(t1);
        textQuestionList.add(t2);
        QuestionBank questionBank = new QuestionBank(choiceQuestionList, textQuestionList);

        System.out.printf("姓名: %s%n", candidate);
        System.out.printf("学号: %s%n", number);
        PrintQuestion.printQuestionBank(questionBank);

        return "OK";


    }
}
