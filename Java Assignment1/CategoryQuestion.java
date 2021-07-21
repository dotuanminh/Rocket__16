public class CategoryQuestion {
        int categoryID;
        String categoryName;
		public CategoryQuestion(int categoryID, String categoryName) {
			this.categoryID = categoryID;
			this.categoryName = categoryName;
		}
		public CategoryQuestion() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "CategoryQuestion [categoryID=" + categoryID + ", categoryName=" + categoryName + "]";
		}
        
}