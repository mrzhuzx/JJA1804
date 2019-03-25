package com.ssm.teamgys.service.impl;

import com.ssm.teamgys.domain.SmbmsBill;
import com.ssm.teamgys.service.SmbmsBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class SmbmsBillServiceImpl implements SmbmsBillService {
    @Autowired
    SmbmsBillService smbmsBillService;
    @Override
    public List<SmbmsBill> findAll() {
        return smbmsBillService.findAll();
    }

    @Override
    public List<SmbmsBill> findAll(Sort sort) {
        return smbmsBillService.findAll(sort);
    }

    @Override
    public Page<SmbmsBill> findAll(Pageable pageable) {
        return smbmsBillService.findAll(pageable);
    }

    @Override
    public List<SmbmsBill> findAllById(Iterable<String> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String strId) {

    }

    @Override
    public void delete(SmbmsBill smbmsBill) {

    }

    @Override
    public void deleteAll(Iterable<? extends SmbmsBill> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends SmbmsBill> S save(S s) {
        return smbmsBillService.save(s);
    }

    @Override
    public <S extends SmbmsBill> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<SmbmsBill> findById(String strId) {
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
    public <S extends SmbmsBill> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<SmbmsBill> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public SmbmsBill getOne(String strId) {
        return null;
    }

    @Override
    public <S extends SmbmsBill> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends SmbmsBill> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends SmbmsBill> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends SmbmsBill> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends SmbmsBill> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends SmbmsBill> boolean exists(Example<S> example) {
        return false;
    }
}
