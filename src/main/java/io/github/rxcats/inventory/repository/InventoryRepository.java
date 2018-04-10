package io.github.rxcats.inventory.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.github.rxcats.inventory.entity.UserItem;

public interface InventoryRepository extends MongoRepository<UserItem, String> {

}
