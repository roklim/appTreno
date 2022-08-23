package com.corso.treno.exceptions;

public abstract class MyException extends Exception{
	  private String message;
	 
	  public MyException(String msg)
	  {
	    this.message = msg;
	  }
	  public String getMessage() {
	    return message;
	  }
}

