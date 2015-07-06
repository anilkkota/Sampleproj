package sample.java.project;



	public class SampleJavaProject {
	     
	    public static SampleJavaProject myObj;
	    /**
	     * Create private constructor
	     */
	    private SampleJavaProject(){
	         
	    }
	    /**
	     * Create a static method to get instance.
	     */
	    public static SampleJavaProject getInstance(){
	        if(myObj == null){
	            myObj = new SampleJavaProject();
	        }
	        return myObj;
	    }
	     
	    public void getSomeThing(){
	        // do something here
	        System.out.println("I am here....");
	    }
	     
	    public static void main(String a[]){
	    	SampleJavaProject st=SampleJavaProject.getInstance();
	        st.getSomeThing();
	    }
	}
	