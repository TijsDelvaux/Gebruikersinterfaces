package models;

public enum Language {

	
	
	Nederlands{
		
		@Override
		public String searchTutor() {
			return "Bijles zoeken";
		}
		
	}, 
	
	Engels{

		@Override
		public String searchTutor() {
			return "Search tutor";
		}
		
	};
	
	public abstract String searchTutor();
	
}
