package com.sachin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/C++")
public class CPP_Controller {
	//INTRODUCTION
	
	@GetMapping("/Introduction")
	public String CPPIntroduction()
	{

			return "C++/Introduction/C++Introduction";

	}
	@GetMapping("/VariablesAndLiterals")
	public String theFormOfACProgram()
	{

			return "C++/Introduction/Variables and Literals";

	}
	@GetMapping("/BasicI/O")
	public String BasicIO()
	{

			return "C++/Introduction/Basic IO";

	}
	@GetMapping("/Comment")
	public String Comments()
	{

			return "C++/Introduction/Comments";

	}
	@GetMapping("/DataTypes")
	public String DataTypes()
	{

			return "C++/Introduction/Data Types";

	}
	@GetMapping("/Operator")
	public String Operators()
	{

			return "C++/Introduction/Operators";

	}
	@GetMapping("/TypeConversion")
	public String TypeConversion()
	{

			return "C++/Introduction/Type Conversion";

	}
	/*
	@GetMapping("/Summery")
	public String summery()
	{
		return "C/An Introduction to C/Summery";
	}
	
	@GetMapping("/SomeMorePrograms")
	public String someMorePrograms()
	{
		return "C/An Introduction to C/SomeMorePrograms";
	}
	
	@GetMapping("/Functions")
	public String functions()
	{
		return "C/An Introduction to C/Functions";
	}
	
	@GetMapping("/Exercise1")
	public String excercise()
	{
		return "C/An Introduction to C/Exercise";
	}
	
	@GetMapping("/ADescriptionOfExample")
	public String aDescriptionOfExample()
	{
		return "C/An Introduction to C/ADescriptionOfExample";
	}
	
	@GetMapping("/Terminology")
	public String terminology()
	{
		return "C/An Introduction to C/Terminology";
	}
	
	
	
	//ARRAY AND POINTERS
	
	
	@GetMapping("/Arrays")
	public String arrays()
	{
		return "C/Arrays and Pointers/Arrays";
	}
	
	@GetMapping("/ArraysThe&OperatorAndFunctionalDeclaration")
	public String arraysTheOperatorAndFunctionalDeclaration()
	{
		return "C/Arrays and Pointers/ArraysThe&OperatorAndFunctionalDeclaration";
	}
	
	@GetMapping("/CharacterHandling")
	public String CharacterHandling()
	{
		return "C/Arrays and Pointers/CharacterHandling";
	}
	
	@GetMapping("/ArraysExercises2")
	public String Exercises()
	{
		return "C/Arrays and Pointers/Exercises";
	}
	
	@GetMapping("/ExpressionInvolvingPointers")
	public String ExpressionInvolvingPointers()
	{
		return "C/Arrays and Pointers/ExpressionInvolvingPointers";
	}
	
	@GetMapping("/OpeningShots")
	public String OpeningShots()
	{
		return "C/Arrays and Pointers/OpeningShots";
	}
	
	@GetMapping("/Pointers")
	public String Pointers()
	{
		return "C/Arrays and Pointers/Pointers";
	}
	
	@GetMapping("/PointersToFunction")
	public String PointersToFunction()
	{
		return "C/Arrays and Pointers/PointersToFunction";
	}
	
	@GetMapping("/SizeofAndStorageAllocation")
	public String SizeofAndStorageAllocation()
	{
		return "C/Arrays and Pointers/SizeofAndStorageAllocation";
	}
	
	@GetMapping("/Summary")
	public String Summary()
	{
		return "C/Arrays and Pointers/Summary";
	}
	
	
	*/
}
