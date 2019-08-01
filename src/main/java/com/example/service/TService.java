package com.example.service;


import com.example.mapper.TtMapper;
import com.example.pojo.Tt;
import com.example.pojo.TtExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TService {
    @Autowired
    private TtMapper ttMapper;
    public List<Tt> selectAll(){
        TtExample ttExample = new TtExample();
       return ttMapper.selectByExample(ttExample);
    }
}
