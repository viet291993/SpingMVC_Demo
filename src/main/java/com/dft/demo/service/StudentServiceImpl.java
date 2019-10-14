package com.dft.demo.service;

import com.dft.demo.entity.Student;
import com.dft.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Inject
    StudentRepository studentRepository;

    @Override
    public List<Student> getAll() {
        return studentRepository.getAll();
    }
}
