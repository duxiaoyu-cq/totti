package com.dxy.totti.service;

import com.dxy.totti.dao.mapper.JobMapper;
import com.dxy.totti.dao.pojo.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {

    @Autowired
    JobMapper jobMapper;

    public Job findById(Long id) {
        return jobMapper.selectByPrimaryKey(id);
    }
}
