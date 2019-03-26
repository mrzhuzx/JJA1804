package com.ssm.teamgys.service.impl;
/*
 *desc:
 *author:wjs
 *time:2019/3/25 0025
 *version:1.2.3
 */


import com.ssm.teamgys.domain.SmbmUser;
import com.ssm.teamgys.repositorydomain.SmbmUserRepository;
import com.ssm.teamgys.service.SmbmUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SmbmUserServiceImpl implements SmbmUserService {

    @Autowired
    SmbmUserRepository smbmUserRepository;

    @Override
    public List<SmbmUser> findAll() {
        return smbmUserRepository.findAll();
    }

    @Override
    public List<SmbmUser> findAll(Sort sort) {
        return smbmUserRepository.findAll(sort);
    }

    @Override
    public Page<SmbmUser> findAll(Pageable pageable) {
        return smbmUserRepository.findAll(pageable);
    }

    @Override
    public List<SmbmUser> findAllById(Iterable<String> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String strId) {smbmUserRepository.deleteById(Long.valueOf(strId));
    }

    @Override
    public void delete(SmbmUser smbmUser) {

    }

    @Override
    public void deleteAll(Iterable<? extends SmbmUser> iterable) {

    }

    @Override
    public void deleteAll() { smbmUserRepository.deleteAll();

    }

    @Override
    public <S extends SmbmUser> S save(S s) {
        return smbmUserRepository.save(s);
    }

    @Override
    public <S extends SmbmUser> List<S> saveAll(Iterable<S> iterable) {
        return smbmUserRepository.saveAll(iterable);
    }

    @Override
    public Optional<SmbmUser> findById(String strId) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String strId) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends SmbmUser> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<SmbmUser> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public SmbmUser getOne(String strId) {
        return null;
    }

    @Override
    public <S extends SmbmUser> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends SmbmUser> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends SmbmUser> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends SmbmUser> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends SmbmUser> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends SmbmUser> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public int update(String userCode, String userName, String userPassword, String userPhone, Long roleId) {
        return smbmUserRepository.update(userCode,userName,userPassword,userPhone,roleId);
    }
}
