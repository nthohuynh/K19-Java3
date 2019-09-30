package lab4;
	import java.io.Serializable;
	@SuppressWarnings("serial")
	public class Student implements Serializable {
	    private int id;
	    private String name;
	    private double price;
	    private double SaleOff;
	    private double thue;
	 
	    public Student() {
	    }
	 
	    public Student(int id, String name, 
	    		double price, double SaleOff, double thue) {
	        super();
	        this.id = id;
	        this.name = name;
	        this.price = price;
	        this.SaleOff = SaleOff;
	        this.thue = thue;
	    }
	 
	    public int getId() {
	        return id;
	    }
	 
	    public void setId(int id) {
	        this.id = id;
	    }
	 
	    public String getName() {
	        return name;
	    }
	 
	    public void setName(String name) {
	        this.name = name;
	    }
	    public double getprice() {
	        return price;
	    }
	    public void setprice(double price) {
	        this.price = price;
	    }
	    public double getSaleOff() {
	        return SaleOff;
	    }
	    public void setSaleOff(double SaleOff) {
	        this.SaleOff = SaleOff;
	    }
	    public double getthue() {
	        return thue;
	    }
	    public void setthue(double gpa) {
	        this.thue = thue;
	    }
	}
