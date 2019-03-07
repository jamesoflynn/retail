package bank.entity;

import java.util.List;

public class Statement {

	private Account account;

	private Statement(Account account) {
		this.account = account;
	}

	protected static Statement newStatement(Account account) {
		return new Statement(account);
	}

	public List<Ledger.Entry> getOperations() {
		return account.getEntries();
	}
}