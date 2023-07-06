package sec3;

public final class Child extends Parent{ //class앞에 final을 붙이면 더이상 상속이 불가능하다
		private String job;

		public String getJob() {
			return job;
		}

		public void setJob(String job) {
			this.job = job;
		}

		@Override
		public void getPrint() {
			System.out.println("자식");
		}
		
}
