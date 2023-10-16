package entities;

public final class ImportedProduct extends Product{
	
	private Double customsFee;

	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFree() {
		return customsFee;
	}

	public void setCustomsFree(Double customsFree) {
		this.customsFee = customsFree;
	}
	
	@Override
	public final String priceTag() {
		return getName() +
				" $ " + String.format("%.2f", getPrice()) +
				" (Customs fee: $ " + String.format("%.2f", customsFee) +
				")";
	}

}
