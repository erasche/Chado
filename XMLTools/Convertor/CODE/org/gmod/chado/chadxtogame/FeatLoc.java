//FeatLoc
package org.gmod.chado.chadxtogame;

import java.util.*;

public class FeatLoc extends FeatSub {

private Span m_Span = null;

//private SMTPTR m_SrcFeatureId = new SMTPTR("feature");
private String m_SrcFeatureId = null;

private String m_strand = null;
private String m_locgroup = null;
private String m_nbegpart = null;
private String m_nendpart = null;
private String m_rank = null;
private String m_min = null;
private String m_max = null;

	public FeatLoc(String the_Id){
		super(the_Id);
	}


//NBEG,NEND SPAN
	public void setSpan(Span the_Span){
		m_Span = the_Span;
	}

	public Span getSpan(){
		return m_Span;
	}


/****************
	public void setSrcFeatureId(String the_SrcFeatureId){
		m_SrcFeatureId.setkey(the_SrcFeatureId);
	}

	public void setSrcFeatureId(Attrib the_gf){
		m_SrcFeatureId.setGF(the_gf);
	}

	public void setSrcFeatureId(SMTPTR the_SMTPTR){
		m_SrcFeatureId = the_SMTPTR;
	}

	public String getSrcFeatureId(){
		System.out.println("FEATURE:getSrcFeatureId()");
		return m_SrcFeatureId.getValue();
	}

	//public Feature getSrcFeature(){
	//	System.out.println("FEATURE:getSrcFeature()");
	//	return (Feature)m_SrcFeatureId.getObjValue();
	//}
****************/

/****************/
//USE DUMMY STRING FOR NOW
	public void setSrcFeatureId(String the_SrcFeatureId){
		m_SrcFeatureId = the_SrcFeatureId;
	}

	public String getSrcFeatureId(){
		return m_SrcFeatureId;
	}
/****************/

	public void setstrand(String the_strand){
		m_strand = the_strand;
	}

	public String getstrand(){
		return m_strand;
	}

	public void setlocgroup(String the_locgroup){
		m_locgroup = the_locgroup;
	}

	public String getlocgroup(){
		return m_locgroup;
	}

	public void setnbegpart(String the_nbegpart){
		m_nbegpart = the_nbegpart;
	}

	public String getnbegpart(){
		return m_nbegpart;
	}

	public void setnendpart(String the_nendpart){
		m_nendpart = the_nendpart;
	}

	public String getnendpart(){
		return m_nendpart;
	}

	public void setrank(String the_rank){
		m_rank = the_rank;
	}

	public String getrank(){
		return m_rank;
	}

	public void setmin(String the_min){
		m_min = the_min;
	}

	public String getmin(){
		return m_min;
	}

	public void setmax(String the_max){
		m_max = the_max;
	}

	public String getmax(){
		return m_max;
	}
}


