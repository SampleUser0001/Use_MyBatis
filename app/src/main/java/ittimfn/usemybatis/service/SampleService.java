package ittimfn.usemybatis.service;

import org.apache.ibatis.javassist.tools.reflect.Sample;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ittimfn.usemybatis.App;
import ittimfn.usemybatis.mapper.SampleMapper;
import ittimfn.usemybatis.model.SampleModel;
import ittimfn.usemybatis.util.MyBatisUtil;

public class SampleService {

    private static final Logger logger = LogManager.getLogger(App.class);

    public SampleModel selectById(int id) {
        logger.info("id : {}", id);
        SqlSessionFactory sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
        try(SqlSession session = sqlSessionFactory.openSession()) {
            SampleMapper mapper = session.getMapper(SampleMapper.class);
            return mapper.selectById(id);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return null;
        }
    }
}
