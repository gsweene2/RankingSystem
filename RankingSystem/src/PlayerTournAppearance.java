
public class PlayerTournAppearance {

	   // ...
	String firstName;
	String lastName;
	Integer[] rounds;
	Integer yardage;
	String ageGroup;
	String classYear;
	String city;
	String state;
	String country;
	String total;
	String place;

	   PlayerTournAppearance(String _firstName, String _lastName, Integer[] _rounds, Integer _yardage,
			   String _ageGroup, String _classYear, String _city, String _state, String _country, 
			   String _total, String _place)
	   {
		  
	      firstName = _firstName;
	      lastName = _lastName;
	      rounds = _rounds;
	      yardage = _yardage;
	      ageGroup = _ageGroup;
	      classYear = _classYear;
	      city = _city;
	      state = _state;
	      country = _country;
	      total = _total;
	      place = _place;
	   }

	   // ...

	   void setFirstName(String _firstName)
	   {
	      firstName = _firstName;
	   }

	   void setLastName(String _lastName)
	   {
	      lastName = _lastName;
	   }
	   
	   void setRounds(Integer[] _rounds)
	   {
	      rounds = _rounds;
	   }

	   void setYardage(Integer _yardage)
	   {
	      yardage = _yardage;
	   }
	   
	   void setAgeGroup(String _ageGroup)
	   {
	      ageGroup = _ageGroup;
	   }
	   
	   void setClassYear(String _classYear)
	   {
	      classYear = _classYear;
	   }
	   
	   void setCity(String _city)
	   {
	      city = _city;
	   }
	   
	   void setState(String _state)
	   {
	      state = _state;
	   }
	   
	   void setCountry(String _country)
	   {
	      lastName = _country;
	   }
	   
	   void setTotal(String _total)
	   {
	      lastName = _total;
	   }
	   
	   void setPlace(String _place)
	   {
	      place = _place;
	   }
	   
	   
	   
	   // ...
}
