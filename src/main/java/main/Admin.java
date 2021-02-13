package main;

public class Admin {
private String username;
private String passowrd;
private Boolean log_in;

public Admin()
{
	this.username="username";
	this.passowrd="passowrd";
}
public String getUsername()
{
	return username;
}
public void setUsername(String username)
{
	username=this.username;
}
public String getPassowrd()
{
	return passowrd;
}
public void setPassowrd(String Passowrd)
{
	passowrd=this.passowrd;
}
public Boolean getLog_in()
{
	return log_in;
}
public void setLog_in(Boolean log_in)
{
	log_in=this.log_in;
}
}
