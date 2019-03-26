package com.ssm.teamgys.service.impl;

import com.ssm.teamgys.domain.Team;
import com.ssm.teamgys.service.TeamService;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

/**
 * desc:
 * author:czf
 * time:2019\3\25 0025
 * version:
 */
public class TeamServiceImpl implements TeamService{

    @Override
    public List<Team> findAll() {
        return null;
    }

    @Override
    public List<Team> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Team> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Team> findAllById(Iterable<String> iterable) {
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
    public void delete(Team team) {

    }

    @Override
    public void deleteAll(Iterable<? extends Team> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Team> S save(S s) {
        return null;
    }

    @Override
    public <S extends Team> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Team> findById(String strId) {
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
    public <S extends Team> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Team> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Team getOne(String strId) {
        return null;
    }

    @Override
    public <S extends Team> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Team> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Team> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Team> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Team> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Team> boolean exists(Example<S> example) {
        return false;
    }
}
