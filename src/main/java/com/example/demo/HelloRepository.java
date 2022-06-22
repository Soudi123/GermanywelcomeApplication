package com.example.demo;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloRepository  extends JpaRepository <Hello,Integer>{
}
