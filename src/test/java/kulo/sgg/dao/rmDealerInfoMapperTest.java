package kulo.sgg.dao;

import kulo.sgg.entity.RmDealerInfoEntity;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class rmDealerInfoMapperTest {
    private static Logger logger = Logger.getLogger(rmDealerInfoMapperTest.class);
    @Autowired
    private RmDealerInfoEntityMapper rmDao;

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
}



