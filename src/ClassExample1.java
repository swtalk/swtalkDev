class ClassExample1 {
	public static void main(String arg[]) {
		GoodsStock obj; // ��������
		obj = new GoodsStock("250000000", 50); // ��ü����
		// obj.goodsCode = "25000";//�ʵ尪 ����
		// obj.stockNum = 10; //�ʵ尪 ����

		System.out.println("��ǰ�ڵ� : " + obj.goodsCode);
		System.out.println("������ : " + obj.getstockNum());

		obj.addStock(1000); // �޼ҵ� ȣ��
		System.out.println("��ǰ�ڵ� : " + obj.goodsCode);
		System.out.println("������ : " + obj.getstockNum());
	}
}
