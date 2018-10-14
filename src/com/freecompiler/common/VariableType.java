package com.freecompiler.common;


public class VariableType {
	
	public String name;
	public Object value;
	public VarType type;

	public VariableType(String name,Object value,VarType type)
	{
		this.name=name.toLowerCase();
		this.value=value;
		this.type=type;
	}
}
