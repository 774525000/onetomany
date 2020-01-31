package com.company;

import com.bean.Brands;
import com.bean.Goods;
import com.utils.HUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class Main {

    public static void main(String[] args) {
        Session session = HUtils.session();
        Transaction ts = session.beginTransaction();

        Brands brands = session.get(Brands.class, 8L);
        session.delete(brands);

        ts.commit();
        session.close();
    }
}
