# InstagramFG



## Synopsis

InstagramFG is a mobile application which allows authenticating a user with Instagram on an Android mobile application  

## Code Example

How to Sig In 

- username: username from Instagram
- password: password from Instagram

## Backend code -Tested using Postman

- CLIENT- ID    = 4577119038ca40e4b15bfacf1bbd68a2
- REDIRECT-URI = http://showoff.ie/
- ACCESS-TOKEN = 3946548211.4577119.26d9f0f9d7c14317977b5a4526edd1e5

http://showoff.ie/#access_token=3946548211.4577119.26d9f0f9d7c14317977b5a4526edd1e5
https://api.instagram.com/oauth/authorize/?client_id=4577119038ca40e4b15bfacf1bbd68a2&redirect_uri=http://showoff.ie/&response_type=token


## Motivation

The idea behind this project is introducing an Instagram Session on a Android mobile application.

The following project is structured as following 
* /Activities  	    Applications components 
* /Adapters     		Bridge between the RecyclerView and the underlying data
* /EndPoints	  		Retrofit2 
* /Fragments   	    Feed list
* /Model        		InstagramSession 
* /Network         	Instagram Connection
* /Rest>/Model>/Stats Pojo Class 
* /Util				Settings as CLIENT_ID, REDIRECT URL AND CLIEND SECRET ID.
* /View               Instagram interface


## Installation

Download the app, go to setting and turn on "unknown resources" then install it.

## Reference


The first, a login screen, is a login screen with an Instagram button. When this is clicked, the user will be asked to login to Instagram, so that you can gain access to their access token.
 
The second screen will be a mockup of a user’s profile. It will display their stats and the most recent posts by them.
 
Link to Instagram’s API: https://www.instagram.com/developer/endpoints/users
 
To create the users profile you will need to make use of two endpoints:
1. /users/self
2. /users/self/media/recent

The app should save the users Instagram login state using SharedPreferences, so if the user is logged in to Instagram, then the app will stay logged in.
 
A logout function would also be needed which would bring the user back to the login screen.

## Author

- @version 1.0
- @autor **Franco Gutierrez** 
- @since 19/09/2016

## Contributors

- To:  Codelab         - https://codelabs.developers.google.com/ - for its navigation view resources.
- To:  jsonschema2pojo - www.jsonschema2pojo.org/ - Pojo generator
- To:  http://www.theappguruz.com/blog/instagram-integration-android-application-tutorial 
## License

The MIT License

Copyright (c) 2016 Franco Gutierrez

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
