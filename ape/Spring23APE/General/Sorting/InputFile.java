 

import java.util.Scanner;
import java.io.*;

/*
 * Write the code for the stubbed out openInputFile method at the bottom
 * of this class.  Be sure and utilize the fields declared at the
 * beginning of the class to perform the operations below.
 * 
 * If the passed in inputFileName is null, throw an IllegalArgumentException
 * that says: file name passed to openInputFile was null
 * 
 * If the passed in inputFileName is an empty string "", throw an IllegalArgumentException
 * that says: file name passed to openInputFile was empty
 * 
 * If the file is already open (check the isOpen field), assign the following to the errorMsg
 * field of the class: "Scanner already open and attached to: " + file.getName()
 * After assigning the message, return false from the method.
 * 
 * Next, create a File object based on the passed in inputFileName.  If the file does not
 * exist, assign the following to the errorMsg field:
 * 
 * "file name passed to openInputFile:  " + inputFileName + ", does not exist"
 * 
 * Return false from the method after assigning the message.
 * 
 * Finally, try and create a Scanner object based on the File object you
 * just created.  If creation succeeds, set the isOpen field to true.  If creation
 * fails, handle the exception that occurred and assign the following to errorMsg:
 * 
 * "an exception occurred in openInputFile: " + e.getMessage()
 * 
 * The e in the above statement represents the exception object that was caught.
 * If you name your exception object something other than e, substitute your name.
 * 
 * If the Scanner was successfully created, return true from the method, otherwise
 * return false.
 * 
 */
public class InputFile {
	
	//NOTE: public fields for testing purposes only -- VERY BAD FORM
	public static Scanner inputFile;
	public static File file;
	public static boolean isOpen = false;
	public static String errorMsg;
//startMethod
	public static boolean openInputFile(String inputFileName){

		return false;//You may have to change this statement.
	}
//endMethod
}
