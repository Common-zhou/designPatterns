package com.zhou.proxy_static;

/**
 * @author Common-zhou
 * @since 2023-08-28 14:36
 */
public class RentHouseProxy implements IRentHouse {
    private IRentHouse iRentHouse;

    public RentHouseProxy(IRentHouse iRentHouse) {
        this.iRentHouse = iRentHouse;
    }

    @Override
    public boolean rent(Integer money) {
        System.out.println("前置的房源寻找ing......");
        System.out.println("沟通中......");

        boolean rent = iRentHouse.rent(money);

        System.out.println("后置的合同草拟，沟通......");
        return rent;
    }
}
