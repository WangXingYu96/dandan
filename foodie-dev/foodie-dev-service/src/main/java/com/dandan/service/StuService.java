package com.dandan.service;

import com.dandan.pojo.Stu;

public interface StuService {
    public Stu getStuInfo(int id);

    public void saveStu();

    public void updateStu(int id);

    public void deleteStu(int id);

}
