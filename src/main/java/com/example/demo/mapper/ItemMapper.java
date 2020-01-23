package com.example.demo.mapper;

import com.example.demo.domain.Item;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemMapper {
    List<Item> findAll();

    Item findOne(Long id);

    void save(Item item);

    void update(Item item);

    void delete(Long id);
}
