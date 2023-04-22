package com.synthia.TestApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChildService{
  @Autowired
  ChildRepository repository;

  public Child addChild(Child child){
      return repository.save(child);
  }

  public Child updateChild(Child child){
      repository.deleteById(child.getId());
      return child;
  }

  public List<Child> searchChildren(String name){
      return repository.findByName(name);
  }
  public List<Child> getAllChildren(){
      return repository.findAll();
  }
}
