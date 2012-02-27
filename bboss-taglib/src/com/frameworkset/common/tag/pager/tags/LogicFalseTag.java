package com.frameworkset.common.tag.pager.tags;


public class LogicFalseTag  extends MatchTag {

	/**
	 *  Description: ���ڵ���
	 * @return boolean
	 * @see com.frameworkset.common.tag.pager.tags.MatchTag#match()
	 */
//	protected boolean match() {
//		if(actualValue == null)
//			return false;
//		if(String.valueOf(actualValue).compareTo(String.valueOf(getValue())) >= 0)
//			return true;
//		else
//			return false;
//	}
	
	protected boolean match() {
		if(actualValue == null )
			return true;
		else
		{
			if(actualValue instanceof Boolean  )
				return !(((Boolean)actualValue).booleanValue());
			else if(actualValue instanceof String && actualValue.equals("false"))
			{
				return true;
			}
			else
				return false;
		}
	}
	
}
