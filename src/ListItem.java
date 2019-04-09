
public class ListItem {
	private String description;
	private String date;
	private String status;
	private int priority;
	
	public ListItem(String description, String date, String status, int priority) {
		setDescription(description);
		setDate(date);
		setStatus(status);
		setPriority(priority);
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public String getDate() {
		return this.date;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public int getPriority() {
		return this.priority;
	}
}