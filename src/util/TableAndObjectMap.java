package util;

import java.util.HashMap;

import bean.PersonalBirthInsuranceDocument;
import bean.PersonalInjuryInsuranceDocument;
import bean.PersonalMedicalInsuranceDocument;
import bean.PersonalPensionInsuranceDocument;
import bean.PersonalSocialInsuranceAuditDocument;
import bean.PersonalSocialInsuranceCollectionDocument;
import bean.PersonalSocialInsuranceDocument;
import bean.PersonalSocialInsuranceStatisticsDocument;
import bean.PersonalUnemployeeInsuranceDocument;
import bean.UnitSocialInsuranceAuditDocument;
import bean.UnitSocialInsuranceCollectionDocument;
import bean.UnitSocialInsuranceManagerDocument;
import bean.UnitSocialInsuranceStatisticsDocument;
import bean.UnitUnemployeeInsuranceDocument;

public class TableAndObjectMap {
	private static HashMap<String,String>UnideDocumentmodels=new HashMap<String,String>();
	private static HashMap<String,String>PersonalDocumentmodels=new HashMap<String,String>();
	static{
		UnideDocumentmodels.put("�������մ�����","UnitBirthInsuranceDocument");
		
		UnideDocumentmodels.put("���˱��մ�����","UnitInjeryInsuranceDocument");
		
		UnideDocumentmodels.put("ҽ�Ʊ��մ�����","UnitMedicalInsuranceDocument");
		
		UnideDocumentmodels.put("���ϱ��մ�����","UnitPensionInsuranceDocument");
		
		UnideDocumentmodels.put("��ᱣ�ջ�����","UnitSocialInsuranceAuditDocument");
		
		UnideDocumentmodels.put("��ᱣ�չ�����","UnitSocialInsuranceManagerDocument");
		
		UnideDocumentmodels.put("��ᱣ��������","UnitSocialInsuranceCollectionDocument");
		
		UnideDocumentmodels.put("��ᱣ��ҵ��ͳ�Ʊ�����","UnitSocialInsuranceStatisticsDocument");
		
		UnideDocumentmodels.put("ʧҵ���մ�����","UnitUnemployeeInsuranceDocument");
	}
	public static String getUnitDocumentModel(String type){
		return UnideDocumentmodels.get(type);
		
	}
	public static final String U_B_I_D="�������մ�����";
	public static final String U_I_I_D="���˱��մ�����";
	public static final String U_M_I_D="ҽ�Ʊ��մ�����";
	public static final String U_P_I_D="���ϱ��մ�����";
	public static final String U_S_I_A_D="��ᱣ�ջ�����";
	public static final String U_S_I_M_D="��ᱣ�չ�����";
	public static final String U_S_I_C_D="��ᱣ��������";
	public static final String U_S_I_S_D="��ᱣ��ҵ��ͳ�Ʊ�����";
	public static final String U_U_I_D="ʧҵ���մ�����";
	
	public static final String P_B_I_D="�������մ�����";
	public static final String P_I_I_D="���˱��մ�����";
	public static final String P_M_I_D="ҽ�Ʊ��մ�����";
	public static final String P_P_I_D="���ϱ��մ�����";
	public static final String P_S_I_A_D="��ᱣ�ջ�����";
	public static final String P_S_I_M_D="��ᱣ�չ�����";
	public static final String P_S_I_S_D="��ᱣ��ҵ��ͳ�Ʊ�����";
	public static final String P_U_I_D="ʧҵ���մ�����";
	public static final String P_S_I_C_D="��ᱣ��������";
	static{
		PersonalDocumentmodels.put("�������մ�����", "PersonalBirthInsuranceDocument");
		
		PersonalDocumentmodels.put("���˱��մ�����", "PersonalInjuryInsuranceDocument");
		
		PersonalDocumentmodels.put("ҽ�Ʊ��մ�����", "PersonalMedicalInsuranceDocument");
		
		PersonalDocumentmodels.put("���ϱ��մ�����", "PersonalPensionInsuranceDocument");
		
		PersonalDocumentmodels.put("��ᱣ�ջ�����", "PersonalSocialInsuranceAuditDocument");
		
		PersonalDocumentmodels.put("��ᱣ�չ�����", "PersonalSocialInsuranceDocument");
		
		PersonalDocumentmodels.put("��ᱣ��ҵ��ͳ�Ʊ�����", "PersonalSocialInsuranceStatisticsDocument");
		
		PersonalDocumentmodels.put("ʧҵ���մ�����", "PersonalUnemployeeInsuranceDocument");
		
		PersonalDocumentmodels.put("��ᱣ��������", "PersonalSocialInsuranceCollectionDocument");
	}
	public static String getPersonalDocumentModel(String type){
		return PersonalDocumentmodels.get(type);
	}
}
