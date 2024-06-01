package ittimfn.usemybatis.mapper;

import ittimfn.usemybatis.model.SampleModel;

public interface SampleMapper{
    public SampleModel selectById(int id);
    // public List<SampleModel> selectAll();
}
