package com.nttdata.transaction.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "transacctions")
public class Transaction {
	@Id
	private String id;
    private TypeTransaction transaction;
    private String numberCard;
    private Integer typeCard;
    private String codeClient;
    private String numberAccount;
    private TypeOperation operation;
    private DestinationAccount destinationAccount;
    private Double amount;
    private LocalDateTime dateTransaction= LocalDateTime.of(LocalDate.now(), LocalTime.now());;

    @PostConstruct
    public void transactionInit(){
    	
    	this.dateTransaction= LocalDateTime.of(LocalDate.now(), LocalTime.now());
    }

    
}
