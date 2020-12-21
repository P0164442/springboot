package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.io.Console;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);


        Integer l = new Integer(130);
        Integer l1 = new Integer(130);

        System.out.println(l == l1 ? "true" : "false");


        Integer l2 = new Integer(11);
        Integer l3 = new Integer(11);

        System.out.println(l2 == l3 ? "true" : "false");
        List<String> test1 = new ArrayList<>();
        test1.add("1");
        test1.add("2");
        for (int i=0;i<test1.size();i++) {
            test1.set(i,"fff");
        }
        System.out.println(test1);
        System.out.println(test1);
        for (String a : test1) {
            a = "fff";
        }

        System.out.println(test1);
      int aa=  l2.hashCode();

        int aaa=  l3.hashCode();

        System.out.println(aa);

        System.out.println(aaa);

        String b="111";
        String bb="111";

        System.out.println(b.hashCode());

        System.out.println(bb.hashCode());
        System.out.println(b==bb);
        System.out.println(b.equals(bb));


        String c="abc";
        String cc="abc";

        System.out.println(c.hashCode());

        System.out.println(cc.hashCode());
        System.out.println(c==cc);
        System.out.println(c.equals(cc));


        BigDecimal dd=new BigDecimal("1");
        BigDecimal ee=new BigDecimal("1");


        System.out.println(dd==ee);
        System.out.println(dd.equals(ee));
        int aaaa=1;
        int bbb=2;

        String a1,a3="abc";
        String a4="abc";
        System.out.println(a3==a4);
        System.out.println(a3.equals(a4));


        String s1,s2,s3 = "abc", s4 ="abc" ;
        s1 = new String("abc");
        s2 = new String("abc");
        System.out.println(s1==s2);

    }

}
