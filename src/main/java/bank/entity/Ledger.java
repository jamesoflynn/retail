package bank.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Ledger {

	class Entry {
		private LocalDateTime date;
		private double deposit;
		private double withdrawal;

		Entry() {
			this.date = LocalDateTime.now();
		}

		public LocalDateTime getDate() {
			return date;
		}

		public double getDeposit() {
			return deposit;
		}

		public double getWithdrawal() {
			return withdrawal;
		}
	}

	private List<Entry> entries;

	public Ledger() {
		this.entries = new ArrayList<Entry>();
	}

	public double deposit(double amount) {
		Entry entry = null;
		if (amount > 0) {
			entry = new Entry();
			entry.deposit = amount;
			entries.add(entry);
		}
		return entry != null ? entry.deposit : 0.0;
	}

	public double withdraw(double amount) {
		Entry entry = null;
		if (amount > 0) {
			entry = new Entry();
			entry.withdrawal = amount;
			entries.add(entry);
		}
		return entry != null ? entry.withdrawal : 0.0;
	}

	protected List<Entry> getEntries() {
		return entries;
	}
}
