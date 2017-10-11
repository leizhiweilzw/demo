package com.example.demo.controller;

import com.example.demo.dao.IScoreDao;
import com.example.demo.entity.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ScoreController {

    @Autowired
    private IScoreDao iScoreDao;

    @GetMapping("/scoreList")
    public List<Score> getScoreList(){
        return  iScoreDao.getList();
    }
}
