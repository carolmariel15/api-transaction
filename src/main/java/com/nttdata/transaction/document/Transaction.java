package com.nttdata.transaction.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Unwrapped.Nullable;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "transacctions")
public class Transaction {
	@Id
	private String id;
    private Integer idTypeAccount;
    @Nullable
    private String numberCard;
    private Integer typeCard;
    private String codeClient;
    @Nullable
    private String numberAccount;
    private Currency currency;
    private TypeOperation typeOperation;
    @Nullable
    private Account originAccount;
    @Nullable
    private Account destinationAccount;
    private Double amount;
    @Nullable
    private LocalDateTime dateTransaction;

    
}
