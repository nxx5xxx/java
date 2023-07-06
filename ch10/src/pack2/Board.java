package pack2;

public class Board {
		private int bno;
		private String title;
		private String author;
		private String resdate;
		
		@Override
		public String toString() {
			return "Board [bno=" + bno + ", title=" + title + ", author="
					+ author + ", resdate=" + resdate + "]";
		}
		
		public int getBno() {
			return bno;
		}
		public void setBno(int bno) {
			this.bno = bno;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getResdate() {
			return resdate;
		}
		public void setResdate(String resdate) {
			this.resdate = resdate;
		}
		
}
