Feature:
@FunctioanTest1
Scenario Outline: Log In Page with valid credential

	Given Naviagte This Page "http://localhost/Adda/register.php"
	When Enter User Name <username>
	And Enter Password <password>
	And Click Submit Button
	Then LogIn Successfull!
	
Examples:
	|username         |password |
	|soyeb88@gmail.com|Dhaka_866|
	
@FunctioanTest2
Scenario Outline: Log In Page with Invalid credential

	Given Naviagte This Page "http://localhost/Adda/register.php"
	When Enter User Name <username>
	And Enter Password <password>
	And Click Submit Button
	Then LogIn should be Unsuccess!
	
Examples:
	|username         |password |
	|soyeb8@gmail.com|Dhaka_866|