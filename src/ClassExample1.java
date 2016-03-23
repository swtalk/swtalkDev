class ClassExample1 {
	public static void main(String arg[]) {
		GoodsStock obj; // 변수선언
		obj = new GoodsStock("250000000", 50); // 객체생성
		// obj.goodsCode = "25000";//필드값 대입
		// obj.stockNum = 10; //필드값 대입

		System.out.println("상품코드 : " + obj.goodsCode);
		System.out.println("재고수량 : " + obj.getstockNum());

		obj.addStock(1000); // 메소드 호출
		System.out.println("상품코드 : " + obj.goodsCode);
		System.out.println("재고수량 : " + obj.getstockNum());
	}
}
