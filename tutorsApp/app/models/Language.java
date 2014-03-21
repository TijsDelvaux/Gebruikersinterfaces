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

		@Override
		public String general() {
			return "Algemeen";
		}

		@Override
		public String tutor() {
			return "Bijlesgever";
		}

		@Override
		public String wantToBeTutorText() {
			return "Je bent nog geen lesgever, wil je lesgever worden?";
		}

		@Override
		public String activate() {
			return "Activeer";
		}
		
	}, 
	
	English{

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

		@Override
		public String general() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String tutor() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String wantToBeTutorText() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String activate() {
			// TODO Auto-generated method stub
			return null;
		}
		
	};
	
	public abstract String searchTutor();
	public abstract String myProfile();
	public abstract String myReviews();
	public abstract String calendar();
	public abstract String general();
	public abstract String tutor();
	public abstract String wantToBeTutorText();
	public abstract String activate();
	
}
