/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package database.form;

import java.sql.Date;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.validator.ValidatorForm;

/** 
 * MyEclipse Struts
 * Creation date: 03-13-2013
 * 
 * XDoclet definition:
 * @struts.form name="InsertBookForm"
 */
public class InsertBookForm extends ValidatorForm {
	/*
	 * Generated fields
	 */

	/** author property */
	private String author;

	/** bookTitle property */
	private String bookTitle;

	/** unitprice property */
	private Double unitprice;

	/** publishTime property */
	private String publishTime;

	/** ISBN property */
	private long ISBN;

	/** image property */
	private String image;

	/** stockquantity property */
	private Integer stockquantity;

	/** decription property */
	private String description;

	/*
	 * Generated Methods
	 */

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/** 
	 * Returns the author.
	 * @return String
	 */
	public String getAuthor() {
		return author;
	}

	/** 
	 * Set the author.
	 * @param author The author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/** 
	 * Returns the bookTitle.
	 * @return String
	 */
	public String getBookTitle() {
		return bookTitle;
	}

	/** 
	 * Set the bookTitle.
	 * @param bookTitle The bookTitle to set
	 */
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	/** 
	 * Returns the unitprice.
	 * @return Double
	 */
	public Double getUnitprice() {
		return unitprice;
	}

	/** 
	 * Set the unitprice.
	 * @param unitprice The unitprice to set
	 */
	public void setUnitprice(Double unitprice) {
		this.unitprice = unitprice;
	}
    
	/** 
	 * Returns the publishTime.
	 * @return Date
	 */
	public String getPublishTime() {
		return publishTime;
	}

	/** 
	 * Set the publishTime.
	 * @param publishTime The publishTime to set
	 */
	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}

	/** 
	 * Returns the ISBN.
	 * @return Integer
	 */
	public long getISBN() {
		return ISBN;
	}

	/** 
	 * Set the ISBN.
	 * @param ISBN The ISBN to set
	 */
	public void setISBN(long ISBN) {
		this.ISBN = ISBN;
	}

	/** 
	 * Returns the image.
	 * @return String
	 */
	public String getImage() {
		return image;
	}

	/** 
	 * Set the image.
	 * @param image The image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/** 
	 * Returns the stockquantity.
	 * @return Integer
	 */
	public Integer getStockquantity() {
		return stockquantity;
	}

	/** 
	 * Set the stockquantity.
	 * @param stockquantity The stockquantity to set
	 */
	public void setStockquantity(Integer stockquantity) {
		this.stockquantity = stockquantity;
	}

	/** 
	 * Returns the decription.
	 * @return String
	 */
	public String getDescription() {
		return description;
	}

	/** 
	 * Set the decription.
	 * @param decription The decription to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
}