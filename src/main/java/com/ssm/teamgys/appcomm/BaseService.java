package com.ssm.teamgys.appcomm;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

/**
 * Desc: jpa业务接口父类设计中
 * author : teacherzhu
 * 2019/3/23 0023
 */
public interface BaseService<T> {


    
     List<T> findAll();
    
     List<T> findAll(Sort sort);

    
     Page<T> findAll(Pageable pageable);

    
     List<T> findAllById(Iterable<String> iterable);

    
     long count();

    
     void deleteById(String strId);

    
     void delete(T t);

    
     void deleteAll(Iterable<? extends T> iterable);

    
     void deleteAll() ;

    
     <S extends T> S save(S s);

    
     <S extends T> List<S> saveAll(Iterable<S> iterable) ;

    
     Optional<T> findById(String strId);

    
     boolean existsById(String strId) ;

    
     void flush();

    
     <S extends T> S saveAndFlush(S s) ;

    
     void deleteInBatch(Iterable<T> iterable);

    
     void deleteAllInBatch();

    
     T getOne(String strId) ;

    
     <S extends T> Optional<S> findOne(Example<S> example);

    
     <S extends T> List<S> findAll(Example<S> example);

    
     <S extends T> List<S> findAll(Example<S> example, Sort sort);


    
     <S extends T> Page<S> findAll(Example<S> example, Pageable pageable);

    
     <S extends T> long count(Example<S> example) ;

    
     <S extends T> boolean exists(Example<S> example) ;
}



