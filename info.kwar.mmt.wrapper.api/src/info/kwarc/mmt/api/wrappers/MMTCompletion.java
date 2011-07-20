package info.kwarc.mmt.api.wrappers;
import java.util.ArrayList;
import java.util.List;


public class MMTCompletion {
	String top;
	List<String> children;
	
	public MMTCompletion() {
		children = new ArrayList<String>();
	}
	
	public String getTop() {
		return top;
	}
	public void setTop(String top) {
		this.top = top;
	}
	public List<String> getChildren() {
		return children;
	}
	public void setChildren(List<String> children) {
		this.children = children;
	}
	
	
}
