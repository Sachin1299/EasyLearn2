package com.sachin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JavaController {

	
	//Introduction
	
	@GetMapping("/Introduction")
	public String introduction()
	{
		return "Java/Introduction/Introduction";
	}
	
	@GetMapping("/Hello World")
	public String helloWorld()
	{
		return "Java/Introduction/Hello World";
	}
	
	@GetMapping("/JVM-JDK-JRE")
	public String JVM_JDK_JRE()
	{
		return "Java/Introduction/JVM, JRE and JDK";
	}
	
	@GetMapping("/Variables")
	public String variables()
	{
		return "Java/Introduction/Variables";
	}
	
	@GetMapping("/DataTypes")
	public String dataTypes()
	{
		return "Java/Introduction/Data Types";
	}
	
	@GetMapping("/Operators")
	public String operators()
	{
		return "Java/Introduction/Operators";
	}
	
	@GetMapping("/InputAndOutput")
	public String inputAndOutput()
	{
		return "Java/Introduction/Input and Output";
	}
	
	@GetMapping("/ExpressionAndBlocks")
	public String ExpressionAndBlocks()
	{
		return "Java/Introduction/Expression & Blocks";
	}
	
	@GetMapping("/Comments")
	public String Comment()
	{
		return "Java/Introduction/Comments";
	}
	
	@GetMapping("/FlowControl")
	public String FlowControl()
	{
		return "Java/Flow Control/If-Else";
	}
	
	@GetMapping("/If-Else")
	public String ifElse()
	{
		return "Java/Flow Control/If-Else";
	}
	
	@GetMapping("/SwitchStatement")
	public String SwitchStatement()
	{
		return "Java/Flow Control/Switch Statement";
	}
	
	@GetMapping("/ForLoop")
	public String ForLoop()
	{
		return "Java/Flow Control/for Loop";
	}
	
	@GetMapping("/ForEachLoop")
	public String ForEachLoop()
	{
		return "Java/Flow Control/for Each Loop";
	}
	
	@GetMapping("/WhileLoop")
	public String WhileLoop()
	{
		return "Java/Flow Control/while Loop";
	}
	
	@GetMapping("/BreakStatements")
	public String BreakStatements()
	{
		return "Java/Flow Control/Break Statements";
	}
	
	@GetMapping("/ContinueStatement")
	public String ContinueStatement()
	{
		return "Java/Flow Control/Continue Statement";
	}
	
	
	
	
	
}
