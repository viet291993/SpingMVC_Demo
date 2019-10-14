package com.dft.demo.repository;

import com.dft.demo.entity.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> getAll();
}
