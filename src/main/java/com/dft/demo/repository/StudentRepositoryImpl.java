package com.dft.demo.repository;

import com.dft.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class StudentRepositoryImpl implements StudentRepository {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Student> getAll() {
        Session session = sessionFactory.openSession();
        List<Student> list = null;
        try {
            list = session.createQuery("from Student").list();

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            session.close();
        }
        return list;
    }
}
