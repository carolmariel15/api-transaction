package com.nttdata.transaction.service;

import com.nttdata.transaction.model.Transaction;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ITransactionService {
	
	public Flux<Transaction> findAll();
	
	public Mono<Transaction> findById(String id);
	
	public Mono<Transaction> save(Transaction transaction);
	
	public  Mono<Void> delete(Transaction transaction);
	
	public Flux<Transaction> findAllByCodeClient(String codeClient,String codeTransaction);
	

}
