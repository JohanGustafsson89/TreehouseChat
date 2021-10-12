package com.company;

public class ShopKeeper extends Person implements Seller{
    ShopKeeper(String name){
        super(name);
    }

    @Override
    public String chat() {
        return "Hi i'm a ShopKeeper!";
    }

    @Override
    public void sellGoods(){
        //todo: implement sellgoods method
    }
}
