class GoodsStock {
	String goodsCode;
	private int stockNum;

	int getstockNum() {
		return stockNum;
	}

	GoodsStock(String code, int num) {

		if (num < 0) {
			stockNum = 0;
		} else {
			stockNum = num;
		}
		goodsCode = code;

	}

	void addStock(int amount) {
		stockNum += amount;
	}

	int subtracktStock(int amount) {
		if (stockNum < amount)
			return 0;
		stockNum -= amount;
		return amount;
	}
}