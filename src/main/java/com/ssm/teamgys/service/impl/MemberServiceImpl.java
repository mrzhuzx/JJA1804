package com.ssm.teamgys.service.impl;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.ssm.teamgys.appcomm.BaseJpaRepository;
import com.ssm.teamgys.appcomm.BaseServiceImpl;
import com.ssm.teamgys.domain.Member;
import com.ssm.teamgys.repositorydomain.MemberRepository;
import com.ssm.teamgys.repositorydomain.ProductInfoRepository;
import com.ssm.teamgys.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static javafx.scene.input.KeyCode.J;

/**
 * Desc:
 * author : teacherzhu
 * 2019/3/23 0023
 */
@Service
 public class MemberServiceImpl    implements   MemberService {



 @Autowired
 MemberRepository memberRepository;

 @Override
 public List<Member> findAll() { return memberRepository.findAll(); }

 @Override
 public List<Member> findAll(Sort sort) {
  return memberRepository.findAll(sort);
 }

 @Override
 public Page<Member> findAll(Pageable pageable) {
  return memberRepository.findAll(pageable);
 }

 @Override
 public List<Member> findAllById(Iterable<String> iterable) {
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
 public void delete(Member member) {

 }

 @Override
 public void deleteAll(Iterable<? extends Member> iterable) {

 }

 @Override
 public void deleteAll() {
   memberRepository.deleteAll();
 }

 @Override
 public <S extends Member> S save(S s) {
  return memberRepository.save(s);
 }

 @Override
 public <S extends Member> List<S> saveAll(Iterable<S> iterable) {
  return null;
 }

 @Override
 public Optional<Member> findById(String strId) {
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
 public <S extends Member> S saveAndFlush(S s) {
  return null;
 }

 @Override
 public void deleteInBatch(Iterable<Member> iterable) {

 }

 @Override
 public void deleteAllInBatch() {

 }

 @Override
 public Member getOne(String strId) {
  return null;
 }

 @Override
 public <S extends Member> Optional<S> findOne(Example<S> example) {
  return Optional.empty();
 }

 @Override
 public <S extends Member> List<S> findAll(Example<S> example) {
  return null;
 }

 @Override
 public <S extends Member> List<S> findAll(Example<S> example, Sort sort) {
  return null;
 }

 @Override
 public <S extends Member> Page<S> findAll(Example<S> example, Pageable pageable) {
  return null;
 }

 @Override
 public <S extends Member> long count(Example<S> example) {
  return 0;
 }

 @Override
 public <S extends Member> boolean exists(Example<S> example) {
  return false;
 }
}
