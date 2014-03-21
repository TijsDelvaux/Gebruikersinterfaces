package models;

public enum Language {
	
	Nederlands{
		
		@Override
		public String searchTutor() {
			return "Bijles zoeken";
		}

		@Override
		public String myProfile() {
			return "Mijn profiel";
		}

		@Override
		public String myReviews() {
			return "Mijn revieuws";
		}

		@Override
		public String calendar() {
			return "Kalender";
		}
		
	}, 
	
	Engels{

		@Override
		public String searchTutor() {
			return "Search tutor";
		}

		@Override
		public String myProfile() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String myReviews() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String calendar() {
			// TODO Auto-generated method stub
			return null;
		}
		
	};
	
	public abstract String searchTutor();
	
	public abstract String myProfile();
	
	public abstract String myReviews();
	
	public abstract String calendar();
	
}
