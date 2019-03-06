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
		return 0.0;
	}
}
