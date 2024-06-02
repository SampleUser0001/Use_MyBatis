package ittimfn.usemybatis.service;

import java.util.List;

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
    private SqlSessionFactory sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();

    public SampleModel selectById(int id) {
        try(SqlSession session = sqlSessionFactory.openSession()) {
            SampleMapper mapper = session.getMapper(SampleMapper.class);
            return mapper.selectById(id);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return null;
        }
    }
    public List<SampleModel> selectAll() {
        try(SqlSession session = sqlSessionFactory.openSession()) {
            SampleMapper mapper = session.getMapper(SampleMapper.class);
            return mapper.selectAll();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return null;
        }
    }

    public List<SampleModel> selectInId(List<Integer> idList) {
        try(SqlSession session = sqlSessionFactory.openSession()) {
            SampleMapper mapper = session.getMapper(SampleMapper.class);
            return mapper.selectInId(idList);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return null;
        }
    }
}
