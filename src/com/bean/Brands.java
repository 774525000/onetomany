package com.bean;

import java.util.HashSet;
import java.util.Set;

public class Brands {
    private Long id;
    private String title;

    private Set<Goods> goods = new HashSet<Goods>();

    public Set<Goods> getGoods() {
        return goods;
    }

    public void setGoods(Set<Goods> goods) {
        this.goods = goods;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
