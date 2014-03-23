package models;

public enum Language {
	
	Nederlands{

		public String toString() {return "Nederlands";}
		public String searchTutor() {return "Bijles zoeken";}
		public String myProfile() {return "Mijn profiel";}
		public String myReviews() {return "Mijn reviews";}
		public String calendar() {return "Kalender";}
		public String general() {return "Algemeen";}
		public String tutor() {return "Bijlesgever";}
		public String wantToBeTutorText() {return "Je bent nog geen lesgever, wil je lesgever worden?";}
		public String activate() {return "Activeer";}
		public String myCourses() {return "Mijn vakken";}
		public String availableTutors(){return "Beschikbare lesgevers voor";}
		public String tutorCourses() {return "Bijlesvakken";}
		public String myPrice() {return "Mijn prijs";}
		public String priceUnit() {return "Euro/uur";}
		public String myDescription() {return "Mijn beschrijving";}
		public String myAvailableData() {return "Mijn beschikbare data";}
		public String myPlacesForTutoring() {return "Mijn bijlesplaatsen";}
		public String email() {return "E-mail";}
		public String address() {return "Adres";}
		public String studies() {return "Richting";}
		public String myLanguage() {return "Mijn taal";}
		public String given() {return "Gegeven";}
		public String received() {return "Gekregen";}
		
	}, 
	
	English{

		public String toString() {return "English";}
		public String searchTutor() {return "Search tutor";}
		public String myProfile() {return "My profile";}
		public String myReviews() {return "My reviews";}
		public String calendar() {return "Calendar";}
		public String general() {return "General";}
		public String tutor() {return "Tutor";}
		public String wantToBeTutorText() {return "You're not a tutor yet, want to become one?";}
		public String activate() {return "Activate";}
		public String myCourses(){return "My courses";}
		public String availableTutors(){return "Available tutors for";}
		public String tutorCourses() {return "Courses for tutoring";}
		public String myPrice() {return "My price";}
		public String priceUnit() {return "Euro/hour";}
		public String myDescription() {return "My description";}
		public String myAvailableData() {return "My available Data";}
		public String myPlacesForTutoring() {return "My places for tutoring";}
		public String email() {return "Email";}
		public String address() {return "Address";}
		public String studies() {return "Studies";}
		public String myLanguage() {return "My language";}
		public String given() {return "Given";}
		public String received() {return "Received";}
		
	};
	
	public abstract String toString();
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
	public abstract String tutorCourses();
	public abstract String myPrice();
	public abstract String priceUnit();
	public abstract String myDescription();
	public abstract String myAvailableData();
	public abstract String myPlacesForTutoring();
	public abstract String email();
	public abstract String address();
	public abstract String studies();
	public abstract String myLanguage();
	public abstract String given();
	public abstract String received();
	
	
}
