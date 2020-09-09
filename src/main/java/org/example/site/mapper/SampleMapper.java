package org.example.site.mapper;

import org.apache.ibatis.annotations.Select;

public interface SampleMapper {
    @Select("SELECT sysdate() FROM dual")
    public String getTime();

    public String getTime2();
}
