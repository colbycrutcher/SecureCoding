 

import java.io.*;

/*
 * Write the code for the stubbed out openOutputFile method at the bottom of this class.
 * 
 * Use the fields provided at the top of the class for the work you perform in the method.
 * 
 * If the fileName passed to the method is null, assign the following string to the errorMsg
 * field: file name passed to openOutputFile was null
 * You can then return from the method.
 * 
 * If the fileName passed to the method is an empty string "", assign the following string
 * to the errorMsg field: file name passed to openOutputFile was an empty string
 * You can then return from the method.
 * 
 * If the file is already open (check the isOpen field), assign the following string to the
 * errorMsg field: "file already open, not opening file named: " + fileName
 * Once again, you can return from the method.
 * 
 * Finally, try and open a PrintStream based on the fileName.
 * If the operation succeeds, assign true to isOpen.
 * If the operation fails, handle the exception and assign the following string to the errorMsg field:
 * 
 * "exception occurred opening file named " + fileName
 */
public class OutputFile {
	public static PrintStream outputFile;
	public static boolean isOpen = false;
	public static String errorMsg;
//startMethod
	public static void openOutputFile(String fileName){

	}
//endMethod
}//end class OutputFile
