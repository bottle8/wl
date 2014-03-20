package action;

import org.apache.struts2.ServletActionContext;

import util.Constants;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport {
	// ȡ�õ�ǰ��¼���û���
	protected String getLoginUsername() {
		return (String) ActionContext.getContext().getSession().get(
				Constants.USERNAME_KEY);
	}
	
	// �жϵ�ǰ�û��Ƿ�ʱ
	protected boolean isTimeout() {
		if (ActionContext.getContext().getSession().get(Constants.USERNAME_KEY) == null) {
			return true;
		} else {
			return false;
		}
	}

	// ���Session�����Ƿ����
	protected boolean isExistSession(String key) {
		if (ActionContext.getContext().getSession()!=null&&ActionContext.getContext().getSession().get(key) != null) {
			return true;
		} else {
			return false;
		}
	}

	// ����Session����
	protected void setSession(String key, Object obj) {
		if(ActionContext.getContext().getSession()!=null)
		ActionContext.getContext().getSession().put(key, obj);
	}

	// ȡ��Session����
	protected Object getSession(String key) {
		return ActionContext.getContext().getSession().get(key);
	}
	
	// ����һ������
	protected void saveActionError(String key) {
		super.addActionError(super.getText(key));
	}
	
	// ����һ����Ϣ
	protected void saveActionMessage(String key) {
		super.addActionMessage(super.getText(key));
	}
	
	// ȡ�ò�ѯ��URL
	protected String getRequestPath() {
		return (String)ServletActionContext.getRequest().getServletPath();
	}
	protected void removeSession(String key){
		ActionContext.getContext().getSession().remove(key);
	}
}
