Project Title: Lunch Locater

Overview:
This project looks to create an android application to allow the user to find places to have lunch.
Using the phones gps module the coordinates of the user are obtained.
There coordinates are used with a google locations api call to obtain the a list of "revelant" locations.
The users location and the possible locations will be displayed on a map.
If a location is selected, additional information on the location will be displayed (google locations)
and the route to the location will be determined (google route)
The navigation module will then be used to 'guide' the user to the location.



Advanced Features:
	1) "Revelant" locations are determined by additional information supplied by the user, distance, price, food type etc.
	This information is bounded by the limitations of the google locations api.
	
	2) Recommendations can be made over time as to where the user should go based on previous visits and personal ratings.