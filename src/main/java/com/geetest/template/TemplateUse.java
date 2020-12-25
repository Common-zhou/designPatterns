package com.geetest.template;

/**
 * @author zhoubing
 * @date 2020-12-25 09:57
 */
public class TemplateUse {
    public static void main(String[] args) {
        CoffeeDrinks coffee = new CoffeeDrinks();
        coffee.makeDrinks();

        System.out.println("-----下一杯饮品-----");
        TeaDrinks tea = new TeaDrinks();
        tea.makeDrinks();
    }
}
