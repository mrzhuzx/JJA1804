package com.ssm.teamgys.service.impl;

import com.ssm.teamgys.domain.SmbmRole;
import com.ssm.teamgys.repositorydomain.SmbmRoleRepository;
import com.ssm.teamgys.service.SmbmRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * desc:
 * author:lzp
 * {time}
 * version:1.2.3
 */
@Service
public class SmbmRoleServiceImpl implements SmbmRoleService {
    @Autowired
    SmbmRoleRepository smbmRoleRepository;

    @Override
    public List<SmbmRole> findAll() {
        return smbmRoleRepository.findAll();
    }

    @Override
    public List<SmbmRole> findAll(Sort sort) {
        return smbmRoleRepository.findAll(sort);
    }

    @Override
    public Page<SmbmRole> findAll(Pageable pageable) {
        return smbmRoleRepository.findAll(pageable);
    }

    @Override
    public List<SmbmRole> findAllById(Iterable<String> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String strId) {
        smbmRoleRepository.deleteById(Long.valueOf(strId));

    }

    @Override
    public void delete(SmbmRole smbmRole) {

    }

    @Override
    public void deleteAll(Iterable<? extends SmbmRole> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends SmbmRole> S save(S s) {
        return smbmRoleRepository.save(s);
    }

    @Override
    public <S extends SmbmRole> List<S> saveAll(Iterable<S> iterable) {
        return smbmRoleRepository.saveAll(iterable);
    }

    @Override
    public Optional<SmbmRole> findById(String strId) {
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
    public <S extends SmbmRole> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<SmbmRole> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public SmbmRole getOne(String strId) {
        return smbmRoleRepository.getOne(Long.valueOf(strId));
    }

    @Override
    public <S extends SmbmRole> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends SmbmRole> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends SmbmRole> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends SmbmRole> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends SmbmRole> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends SmbmRole> boolean exists(Example<S> example) {
        return false;
    }


    @Override
    public int update(Long roleId, String roleName, String roleDesc, Integer roleStatus, String roleCode) {
        return smbmRoleRepository.update(roleId,roleName,roleDesc,roleStatus,roleCode);
    }
}
