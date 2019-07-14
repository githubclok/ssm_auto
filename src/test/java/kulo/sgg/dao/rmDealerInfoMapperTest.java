package kulo.sgg.dao;

import kulo.sgg.entity.RmDealerInfoEntity;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class rmDealerInfoMapperTest {
    private static Logger logger = Logger.getLogger(rmDealerInfoMapperTest.class);
    @Autowired
    private RmDealerInfoEntityMapper rmDao;
    static final int MAXIMUM_CAPACITY = 1 << 30;

    @Test
    public void test() {
        rmDao.insert(RmDealerInfoEntity.builder().
                dealerName("吉利车行").
                status(1).
                blackFlag(0).
                note("this is the best car dealer!").
                build());
        logger.info("data insert complete");
    }

    @Test
    public void testForArrayList() {
        logger.info("testForArrayList Start!");
        ArrayList<RmDealerInfoEntity> list = new ArrayList<>(50);
        list.add(RmDealerInfoEntity.builder().
                dealerName("吉利车行").
                status(1).
                blackFlag(0).
                note("this is the best car dealer!").
                build());

        ArrayList<RmDealerInfoEntity> list1 = new ArrayList<>(list);
        System.out.println(list1);
        logger.info("testForArrayList Complete!");
    }

    public static void main(String[] args) {
        System.out.println(test(5));
    }

    static final int test(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }
}



