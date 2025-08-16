import java.time.LocalDate;

public class HeartRates {
  private String firstName;
  private String lastName;
  private int dobYear;
  private int dobMonth;
  private int dobDay;

  //CONSTRUCTOR
  public HeartRates(String firstName, String lastName, int dobYear, int dobMonth, int dobDay){
    this.firstName = firstName;
    this.lastName = lastName;
    this.dobYear = year;
    this.dobMonth = month;
    this.dobDay = day;
  }

  //FIRST AND LAST NAME ATTRIBUTES
  public void setName(String firstName, String lastName){
    this.firstName = firstName;
    this.lastName = lastName;
  }
  public String getName(){
    return (firstName + " " + lastName);
  }
  public String getFirstName(){
    return firstName;
  }
  public String getLastName(){
    return lastName;
  }

  //DATE OF BIRTH ATTRIBUTES
  public void setDOB (int year, int month, int day){
    this.dobYear = year;
    this.dobMonth = month;
    this.dobDay = day;
  }
  public int getDOBYear(){
    return dobYear;
  }
  public int getDOBMonth(){
    return dobMonth;
  }
  public int getDOBDay(){
    return dobDay;
  }

  //MISC METHODS
  public int getAge(){
    int age = 0;
    int currentYear = LocalDate.now().getYear();
    int currentMonth = LocalDate.now().getMonthValue();
    int currentDay = LocalDate.now().getDayOfMonth();
    if(dobMonth > currentMonth || (dobMonth == currentMonth && dobDay > currentDay)){
        age--;
    }
    age += (currentYear - dobYear);
    return age;
  }
  public int getMaxHeartRate(){

  }
}
