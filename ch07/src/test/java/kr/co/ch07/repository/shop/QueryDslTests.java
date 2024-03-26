package kr.co.ch07.repository.shop;

import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import kr.co.ch07.entity.shop.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
public class QueryDslTests {

    @Autowired
    private JPAQueryFactory jpaQueryFactory;

    QCustomer qCustomer = QCustomer.customer;
    QProduct qProduct = QProduct.product;
    QOrder qOrder = QOrder.order;

    @Test
    public void test01(){

        List<Product> products = jpaQueryFactory
                                    .select(qProduct)
                                    .from(qProduct)
                                    .fetch();

        log.info("test01 : " + products);

    }

    @Test
    public void test02(){
        // 선택조회 - select custId, name, age from customer;
        List<Customer> customers = jpaQueryFactory
                                        .select(
                                                Projections.fields(
                                                        Customer.class,
                                                        qCustomer.custId,
                                                        qCustomer.name,
                                                        qCustomer.age
                                                )
                                        )
                                        .from(qCustomer)
                                        .fetch();

        log.info("test02 : " + customers);

    }

    @Test
    public void test03(){

        // select * from customer where name='김유신'
        List<Customer> customers1 = jpaQueryFactory.selectFrom(qCustomer).where(qCustomer.name.eq("김유신")).fetch();
        log.info("customers1 : " + customers1);

        // select * from customer where name!='김유신'
        List<Customer> customers2 = jpaQueryFactory.selectFrom(qCustomer).where(qCustomer.name.ne("김유신")).fetch();
        log.info("customers2 : " + customers2);
    }

    @Test
    public void test04(){
        List<Customer> result1 = jpaQueryFactory.selectFrom(qCustomer).where(qCustomer.age.gt(30)).fetch();     // ~ where age > 30
        List<Customer> result2 = jpaQueryFactory.selectFrom(qCustomer).where(qCustomer.age.goe(30)).fetch();    // ~ where age >= 30
        List<Customer> result3 = jpaQueryFactory.selectFrom(qCustomer).where(qCustomer.age.lt(30)).fetch();     // ~ where age < 30
        List<Customer> result4 = jpaQueryFactory.selectFrom(qCustomer).where(qCustomer.age.loe(30)).fetch();    // ~ where age <= 30

        log.info("result1 : " + result1);
        log.info("result2 : " + result2);
        log.info("result3 : " + result3);
        log.info("result4 : " + result4);
    }


    public void test05(){}
    public void test06(){}
    public void test07(){}
    public void test08(){}
    public void test09(){}
    public void test10(){}
    public void test11(){}
    public void test12(){}


}
