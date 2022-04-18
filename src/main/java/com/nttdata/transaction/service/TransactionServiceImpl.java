package com.nttdata.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.transaction.dao.ITransactionDao;
import com.nttdata.transaction.model.Transaction;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TransactionServiceImpl implements ITransactionService {

	@Autowired
	ITransactionDao transactionDao;

	@Override
	public Flux<Transaction> findAll() {
		// TODO Auto-generated method stub
		return transactionDao.findAll();
	}

	@Override
	public Mono<Transaction> findById(String id) {
		// TODO Auto-generated method stub
		return transactionDao.findById(id);
	}

	@Override
	public Mono<Transaction> save(Transaction transaction) {
		// TODO Auto-generated method stub
		return transactionDao.save(transaction);
	}

	@Override
	public  Mono<Void> delete(Transaction transaction) {
		// TODO Auto-generated method stub
		return transactionDao.delete(transaction);
	}
    
	// se filtra solo las transacciones por tipo (prestamos,tarjetas de cretidos, cuentas)
	@Override
	public Flux<Transaction> findAllByCodeClient(String codeClient,String codeTransaction) {
		// TODO Auto-generated method stub
		return transactionDao.findAllByCodeClient(codeClient)
				.filter(t->t.getTransaction().getCodeTransaction().equals(codeTransaction))
				;
	}
	
}
