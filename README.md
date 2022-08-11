# RestAPI CRUD Operation

Service Urls :
---------------------------------------------------------

1. Add User

Service Url : http://localhost:8080/userOperation/adduser

Post Body :
{

    "userName": "Alok Negi",
    "userEmail": "alok@gmail.com"
}
---------------------------------------------------------

2. Get User

Service Url : http://localhost:8080/userOperation/getuser?userEmail=alok@gmail.com

---------------------------------------------------------

3. Update User

Update user name of user (useremail)

Service Url : http://localhost:8080/userOperation/updateuser

Post Body :
{

    "userName": "Alok Negi",
    "userEmail": "alok@gmail.com"
}
---------------------------------------------------------

4. Delete user

Service Url : http://localhost:8080/userOperation/deleteuser?userEmail=alok@gmail.com
