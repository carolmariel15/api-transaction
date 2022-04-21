package com.nttdata.transaction.document;

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
    private TypeTransaction typeTransaction;
    private String numberCard;
    private Integer typeCard;
    private String codeClient;
    private String numberAccount;
    private TypeOperation typeOperation;
    private DestinationAccount destinationAccount;
    private Double amount;
    private LocalDateTime dateTransaction;

    
}
