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
			return "Mijn reviews";
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
		
		@Override
		public String myCourses() {
			return "Mijn vakken";
		}
		
		@Override
		public String availableTutors(){
			return "Beschikbare lesgevers voor";
		}
		
	}, 
	
	English{

		@Override
		public String searchTutor() {
			return "Search tutor";
		}

		@Override
		public String myProfile() {
			return "My profile";
		}

		@Override
		public String myReviews() {
			return "My reviews";
		}

		@Override
		public String calendar() {
			return "Calendar";
		}

		@Override
		public String general() {
			return "General";
		}

		@Override
		public String tutor() {
			return "Tutor";
		}

		@Override
		public String wantToBeTutorText() {
			return "You're not a tutor yet, want to become one?";
		}

		@Override
		public String activate() {
			return "Activate";
		}
		
		@Override
		public String myCourses(){
			return "My courses";
		}
		
		@Override
		public String availableTutors(){
			return "Available tutors for";
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
	public abstract String myCourses();
	public abstract String availableTutors();
	
}
