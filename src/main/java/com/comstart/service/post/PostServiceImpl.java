package com.comstart.service.post;

import java.util.List;
import com.comstart.mapper.PostMapper;
import com.comstart.vo.BoardVO;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private final PostMapper postMapper;

    public PostServiceImpl(PostMapper postMapper) {
        this.postMapper = postMapper;
    }

    @Override
    public List<BoardVO> getAllPosts() {
        return postMapper.getAllPosts();
    }
}