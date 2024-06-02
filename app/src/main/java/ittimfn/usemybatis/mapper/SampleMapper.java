package ittimfn.usemybatis.mapper;

import java.util.List;
import ittimfn.usemybatis.model.SampleModel;

public interface SampleMapper {
    public SampleModel selectById(int id);
    public List<SampleModel> selectAll();
    public List<SampleModel> selectInId(List<Integer> idList);
}
