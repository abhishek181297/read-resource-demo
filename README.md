# Read Resource Demo
A Simple Demo Project to show how to read files from resource directory
And Map them to a class

# ResourceUtil Class
This class read files from resource directory , the path of the file
passed should be in such a way that src/main/resource is your root directory, Note we are using classLoader so that in jar packaging also the file can be read
Else 
If you will read from any other way like Paths.of way , then in a jar it would cause NoSuchFileFoundException

# JsonMapper class
It has a generic method which needs the path of the file to be passed and the POJO to which it needs to be mapped


# POJOS
User and Address are pojos defined for example

# data/user.json
file which needs to be read
