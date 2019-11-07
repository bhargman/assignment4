# CSCI 380-01: Assignment 4 - Due by 11:59 PM, Dec 11th, 2019
* * * 

	 This assignment builds upon the concepts learned from assignment 3, 
	 and will teach you how to make synchronous API calls through an AsyncTask. 

# Part 0 - Github Setup - 5%
+ Setup this assignment the same way you did for your previous assignments (see [https://github.com/bhargman/assignment1#part-1---github-setup---5](https://github.com/bhargman/assignment1#part-1---github-setup---5). Name your repo
`assignment4` this time)
+ Add me as a collaborator (username : `bhargman`) to your private repo (see [https://help.github.com/articles/inviting-collaborators-to-a-personal-repository/](https://help.github.com/articles/inviting-collaborators-to-a-personal-repository/)).
    + **If you don't do this step, I'll have no way of grading your assignment**
+ Once you've used `git push`, make sure to check your GitHub repo to confirm that you submitted your assignment properly. Whatever you see on your repo, is what I'll see.  

# Part 1 - Spotify API_KEY - 10%
+ You will need to create a Spotify account in order to get a developer API_KEY (expires every hour, so repeat these steps if you have an expired API_KEY)
    + Create a Spotify account at [https://www.spotify.com/us/signup/](https://www.spotify.com/us/signup/) (or login with the same account that you created in `assignment3`).
    + Once logged in, go to any Spotify API console, for example [https://developer.spotify.com/console/get-browse-categories/](https://developer.spotify.com/console/get-browse-categories/)
    + Tap on `GET TOKEN`:\
        <img src="/images/get_token_before.png" width="480">
    + Tap on `REQUEST TOKEN` (leave all boxes unchecked):\
        <img src="/images/request_token.png" width="480">
    + Tap on `AGREE`:\
        <img src="/images/agree.png" width="480">
    + You should now have an API_KEY populated on your console. You'll be using this API_KEY in `SpotifyService.java`. Tap `TRY IT` to try a request.:\
        <img src="/images/get_token_after.png" width="480">
    
+ **NOTE: Your API_KEY will expire every hour, so make sure to repeat these steps every hour to
generate and use a new API_KEY! You'll know your API_KEY is expired if you get an unsuccessful Retrofit response,
or if you try it in the API console and you get this:**

<img src="/images/401.png" width="480">

# Part 2 - Android Studio - 5%
+ Import your `assignment4` repo into Android Studio
    + In the main Android Studio window, tap on "Open an existing Android Studio project"
    + Browse to your `assignment4` folder and select to open it
    + Android Studio will now load the project and you should be able to do the rest of this assignment
        + Note: This may take a few minutes, wait until the processes/indexing spinner in the lower right hand corner is complete
        + Make sure to let Android Studio have access to the internet while it loads the project, so it can fetch dependencies
        + If you get any pop up asking you to update the `Android Gradle Plugin`, please select `Don't remind me again for this project`
    + Browse the code to see what sort of classes are available for you. Specifically, compare the `Categories` models
    to the JSON output from the Spotify API console [https://developer.spotify.com/console/get-browse-categories/](https://developer.spotify.com/console/get-browse-categories/)
    + Use [https://jsonlint.com/](https://jsonlint.com/) if you need to view the JSON output in a cleaner view.

# Part 3 - MainActivity - 5%
+ Update the `updateUI()` method as described in its comment. This should just be a one-liner.

# Part 4 - GetCategoriesTask - 35%
+ Open up `GetCategoriesTask`
+ Update `doInBackground()` and `onPostExecute()` as described in their comments.

# Part 5 - PresentationCategoryViewHolder - 5%
+ Open up `PresentationCategoryViewHolder`
+ Update the constructor to instantiate `imageView` and `textView`.
on how to instantiate views.

# Part 6 - PresentationCategoryAdapter - 35%
+ Open up `PresentationCategoryAdapter`
+ Update `onCreateViewHolder()`, `onBindViewHolder()`, and `getItemCount()` as described in the class' comment. 
