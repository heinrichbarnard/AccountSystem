package za.ac.nwu.ac.domain.persistence;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "Demo_Account_Type", schema = "sdhb")
public class AccountType implements Serializable {

    private static final long serialVersionUID = -2282337104058330818L;

    private Long accountTypeID;
    private String mnemonic;
    private String accountTypeName;
    private LocalDate creationDate;

    private Set<AccountTransaction> accountTransactions;


public AccountType(Long accountTypeID, String mnemonic, String accountTypeName, LocalDate creationDate){
    this.accountTypeID = accountTypeID;
    this.mnemonic = mnemonic;
    this.accountTypeName = accountTypeName;
    this.creationDate = creationDate;

}
}