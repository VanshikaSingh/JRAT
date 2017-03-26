import java.util.Date;

public class Bill {
	private int amount;
	private String currency;
	private int serialNumber;
	private boolean isTorn;
	private Date dateIssued;

	public int getAmount() {
		return amount;
	}

	public String getCurrency() {
		return currency;
	}

	public Date getDateIssued() {
		return dateIssued;
	}

	public boolean getIsTorn() {
		return isTorn;
	}

	public int getSerialNumber() {
		return serialNumber;
	}
}