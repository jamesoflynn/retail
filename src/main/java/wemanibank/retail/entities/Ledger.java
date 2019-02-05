package wemanibank.retail.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="LEDGERS")
public class Ledger {
	@Id
	private Integer entryId;
	@Column(name="ACCOUNT_ID")
	private Integer accountId;
	@Column(name="ENTRY_DATE")
	private Calendar entryDate;
	@Column(name="DEPOSIT")
	private Double deposit;
	@Column(name="WITHDRAWAL")
	private Double withdrawal;
}
