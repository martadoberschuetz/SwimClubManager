package domainObjects;


public class GalaEntry {

	private Swimmer swimmer;
	private Gala gala;
	private static int numericId = 0;
	private String entryId;

	public GalaEntry(Swimmer swimmer, Gala gala){
		
		this.swimmer = swimmer;
		this.gala = gala;
		
		this.entryId = generateGalaEntryId(
							this.swimmer.getForename(), 
							this.swimmer.getSurname(), 
							this.gala.getCity(),
							numericId);
	}
	
	private String generateGalaEntryId(
			String swimmerForename, 
			String swimmerSurname,
			String galaCity,
			int numericId) {
	
		return 	swimmerForename.substring(0, 3) + 
				swimmerSurname.substring(0, 3) + 
				galaCity.toUpperCase() +
				numericId++;
	}

	public String getEntryId() {
		return entryId;
	}

	public void setEntryId(String entryId) {
		this.entryId = entryId;
	}
}