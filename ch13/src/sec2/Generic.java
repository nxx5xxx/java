package sec2;

public class Generic<M> {
		private M product;

		public M getProduct() {
			return product;
		}

		public void setProduct(M product) {
			this.product = product;
		}
		
		public void testrun(){
			System.out.println("자동차가 달립니다");
		}
		
}
