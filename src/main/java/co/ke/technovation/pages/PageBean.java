package co.ke.technovation.pages;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class PageBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2238228609115250365L;
	
	private String page = "home";

	public void home() {
		page = "home";
	}
	
	public void portfolio() {
		page = "portfolio";
	}

	public void contactus() {
		page = "contactus";
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

}