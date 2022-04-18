package com.nttdata.transaction.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.transaction.model.Transaction;

import reactor.core.publisher.Flux;
@Repository
public interface ITransactionDao extends  ReactiveMongoRepository<Transaction,String> {

	Flux<Transaction> findAllByCodeClient(String codeClient);

}