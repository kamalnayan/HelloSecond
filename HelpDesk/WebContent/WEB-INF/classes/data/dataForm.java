package data;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class dataForm extends ActionForm {
	private String name;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String method;

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {

		ActionErrors err = new ActionErrors();
System.out.println("........."+method);
		if (method==null||method.equals(""))
			err.add("method", new ActionMessage("error.method"));

		else {
			if (getMethod().equals("delete")) {

				if (id <= 0)
					err.add("id", new ActionMessage("error.id"));
			}

			if (getMethod().equals("update")) {
				if (id <= 0)
					err.add("id", new ActionMessage("error.id"));

				else if (name.equals(""))
					err.add("name", new ActionMessage("error.name"));
			}

			if (getMethod().equals("insert")) {
				if (id <= 0)
					err.add("id", new ActionMessage("error.id"));

				else if (name.equals(""))
					err.add("name", new ActionMessage("error.name"));
			}
		}
		return err;
	}

}