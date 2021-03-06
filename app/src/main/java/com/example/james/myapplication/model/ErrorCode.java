package com.example.james.myapplication.model;

/**
 * Created by James on 6/15/2017.
 *
 * Enum class for ErrorCodes
 *
 * Model methods that can fail will return ErrorCodes
 */

public enum ErrorCode {
    SUCCESS ("Succes" , 0), //The method completed successfully
    NULLUSER ("Null User", 1), //The user passed in was NULL
    ILLEGALUSERNAME ("Null Username" , 2), //The user was not given a legal username
    ILLEGALPASSWORD ("Null Password" , 3), //The user was not given a legal password
    USERNAMENOTFOUND ("Username not found" , 4), //The username was not found in the database
    INCORRECTPASSWORD ("Incorrect Password" , 5), //A user was found, but the password does not match
    DUPLICATEUSERNAME ("Duplicate Username" , 6), //The username is already in use by anotehr user
    PASSWORDMISMATCH ("Passwords do not match" , 7), //The passwords do match when registering
    ;
    //the string representation of the code
    private String _representation;
    //the error's numerical code
    private int _errorCode;

    ErrorCode(String representation, int errorCode){
        _representation = representation;
        _errorCode = errorCode;
    }

    public int getErrorCode() {
        return _errorCode;
    }
    public String getRepresentation(){
        return _representation;
    }
    public String toString(){
        return   _representation + " ErrorCode: " + Integer.toString(_errorCode);
    }
}
