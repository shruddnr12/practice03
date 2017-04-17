package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];

		// 상품 입력
		for (int i = 0; i < COUNT_GOODS; i++) {
			String name = scanner.next();
			int price = scanner.nextInt();
			int countStock = scanner.nextInt();
			Goods g= new Goods(name, price,countStock );
			goods[i] = g;
		
		}
		
		for (int i = 0; i < COUNT_GOODS; i++) {
			 System.out.println(goods[i].getName() +"(가격:"+ goods[i].getPrice() +")이" + goods[i].getCountStock() + "개 입고 되었습니다." );
		}
		
		// 자원정리
		scanner.close();
	}
}
