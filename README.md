# Email and Password Generator Final Project Java 
# Project Description

  This application is designed to ask a new employee at a company for their name
and their department number. Given these items, the program will give the new
employee an email generated based off of these elements. As well as a randomly
generated password and a mailbox capacity for their email based off of their
department.

# Project Usefulness

  In terms of usefulness, any moderately to large sized company that frequently
has new hires and requires a company email address for new employees, would benefit
from this project as a decent baseline. Additional features can easily be added in
because of the separation of all the elements by various classes and methods.
Currently, the random password generator is of great benefit, and can be customized
for further security by changing the length of the password, or adding additional
characters.

# Project Goal

  The initial goal of this project was to create a randomly generated password and
fake email address. Which it has done, plus quite a bit more.The other goal of this
application was to combine and use multiple programming concepts together and form
a coherent project.

# Project Result

T he final results of the project are a customized email address, a password, and
a mailbox capacity based off of the first choice. For example,
“john.smith@accounting.company.com” is what an email address would look like after
generation. While a password will be ten characters long, randomized from all capital
letters in the alphabet, and all numbers from 0-9. The project also includes set and get
methods, which are brought together with the method ShowInfo, which acts as a sort of
menu and a place to concatenate the final information instead of all over the code.

# User’s Guide

  Starting at the beginning, scanner is imported for the various user inputs used in
later methods. The primary class Email is given a number of variables which can be
shared with the rest of the methods below it, but not with other classes - since they are
set to private and not public.

  The constructor Email is called so since it is defining it is coming from the class.
It prompts the user for their first and last name separately. The reason “this” is used
before the various variables is because it refers to the class level variables. It is
unnecessary here, as in the code will still function, but is good practice. Several more
methods are called under the constructor Email defining which methods they are called
upon. The actual email is generated here as well, with the lower case method being
used for proper email address syntax when it comes to first and last names.

  The setDepartment method uses if, else if, and else to create a choice tree for
the fake employee, with numbers 1-4 corresponding to a specific department, and any
other option simply returning “employee” instead of a department name.

  The random password generator creates a method named randompassword
which puts int length as a parameter. The string passwordset defines all of the possible
characters to use for each character in the password. The character array password is
an array equal to a new sequence of characters of the size length. After that, you iterate
through the value of the length, so for each value inside length, a value inside the array
will be grabbed and it is iterated through i in the for loop. The int rand is defining where
the value is stored, so you cast int for math.random, which is a number between 0-1,
and multiply it by the length of the password set. What that means is if there is a 30
characters inside that password set, then it will give a random number between 0-30.
Then, using the array password at the position i, it is set equal to a character in
passwordset at a random number, that’s what .charAt(rand) means. After that, you
return the array password which is the set of characters so it will be set as a new string.

  The mailbox capacity tree is similar to the department choice tree, it simply asks
for the class level string department, and depending on what it is set to, gives out a
corresponding amount for the mailbox capacity, and returns it.

  The get methods are going to access the properties instead of defining them
directly, and ShowInfo is created to bring together the rest of the information and can
also be used for set methods.

# Future Work

  This project could benefit from using filewriter to write the important elements,
such as the password and the email address, to a text file for actual practical use. Such
as sending the new email to the company’s server and email system, which would be
quite a bit more complicated. This program could also use additional elements such as
asking the user if they wish to enter a recovery or alternate email address or doing the
same with a password. Then displaying this to the user and writing the new user
entered objects to the file as well.

  Another benefit could be the introduction of error code in the project. Currently a
user could enter numbers for their name, or letters when asked for the department code
if they wanted. Currently, the department code defaults to “employee” when a
non-department code number is entered. However, a while loop checking for errors
could be introduced alongside an error code message to prevent this situation. I will add
that if an email was being created for a new employee, it’s highly possible it would be
entered by an administrator, not the new employee themselves, so there is less of a
worry here.

