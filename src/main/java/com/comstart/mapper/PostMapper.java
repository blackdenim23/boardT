package com.comstart.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.comstart.vo.BoardVO;

@Mapper
public interface PostMapper {
    List<BoardVO> getAllPosts();
}