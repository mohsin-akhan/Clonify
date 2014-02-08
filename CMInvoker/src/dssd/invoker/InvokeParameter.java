package dssd.invoker;
import java.util.ArrayList;

/**
 * @author Umer & Hafeez
 */

public class InvokeParameter {
	
	private Integer invocation_id; 
	private Integer min_similatiry_SCC_tokens;
	private Integer grouping_choice; 
	private Integer method_analysis;
	private String suppressed_tokens; 
	private String equal_tokens;
	private ArrayList<String> input_files = new ArrayList<String>();
	
	public InvokeParameter(Integer invocation_id, Integer min_similatiry_SCC_tokens,Integer grouping_choice, Integer method_analysis,String suppressed_tokens, String equal_tokens)
	{
		this.invocation_id = invocation_id;
		this.min_similatiry_SCC_tokens = min_similatiry_SCC_tokens;
		this.grouping_choice = grouping_choice;
		this.method_analysis = method_analysis;
		this.suppressed_tokens = suppressed_tokens;
		this.equal_tokens = equal_tokens;
	}
	
	public Integer getInvocation_id() {
		return invocation_id;
	}
	public void setInvocation_id(Integer invocation_id) {
		this.invocation_id = invocation_id;
	}
	public Integer getMin_similatiry_SCC_tokens() {
		return min_similatiry_SCC_tokens;
	}
	public void setMin_similatiry_SCC_tokens(Integer min_similatiry_SCC_tokens) {
		this.min_similatiry_SCC_tokens = min_similatiry_SCC_tokens;
	}
	public Integer getGrouping_choice() {
		return grouping_choice;
	}
	public void setGrouping_choice(Integer grouping_choice) {
		this.grouping_choice = grouping_choice;
	}
	public Integer getMethod_analysis() {
		return method_analysis;
	}
	public void setMethod_analysis(Integer method_analysis) {
		this.method_analysis = method_analysis;
	}
	public String getSuppressed_tokens() {
		return suppressed_tokens;
	}
	public void setSuppressed_tokens(String suppressed_tokens) {
		this.suppressed_tokens = suppressed_tokens;
	}
	public String getEqual_tokens() {
		return equal_tokens;
	}
	public void setEqual_tokens(String equal_tokens) {
		this.equal_tokens = equal_tokens;
	}

	public ArrayList<String> getInput_files() {
		return input_files;
	}

	public void setInput_files(ArrayList<String> input_files) {
		this.input_files = input_files;
	}
	public String generateFileName(String rep, String dir, String File)
	{
		return rep + dir + File;
	}
	
	public String toString(){
		return 
		" invocation_id: " + invocation_id + " "+ 
		" min_similatiry_SCC_tokens: " + min_similatiry_SCC_tokens + " "+
		" grouping_choice: " + grouping_choice + " "+ 
		" method_analysis: " + method_analysis + " "+
		" suppressed_tokens: " + suppressed_tokens + " "+ 
		" equal_tokens: " + equal_tokens + " "+
		" input_files: " + input_files;
	}
	
	
	

}
