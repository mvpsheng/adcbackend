package com.example.adcbackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.adcbackend.domain.Tags;
import com.example.adcbackend.service.TagsService;
import com.example.adcbackend.mapper.TagsMapper;
import org.springframework.stereotype.Service;

/**
* @author 27111
* @description 针对表【tags】的数据库操作Service实现
* @createDate 2023-04-21 14:55:09
*/
@Service
public class TagsServiceImpl extends ServiceImpl<TagsMapper, Tags>
    implements TagsService{

}




