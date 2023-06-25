package TrialAndError.ReadersAreInnovators.ServiceLayers;

import java.util.ArrayList;

public interface Functions_Interface {
   
   Boolean verifyLoginDetails(String password, String pw);
   Boolean isNumber(String value);
   Boolean phoneNumberVerification(String phoneNum);
   Boolean emailVerification(String email);
   Boolean passwordVerification(String password);
   Boolean wordCountVerification(String message);
   Boolean integerToBoolean(Integer value);
   Integer booleanToInteger(Boolean bool);
   Double getAverage(ArrayList<Integer> ratings);
 
}
