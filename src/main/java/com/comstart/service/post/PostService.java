package com.comstart.service.post;

import java.util.List;
import com.comstart.vo.BoardVO;

public interface PostService {
    List<BoardVO> getAllPosts();
}