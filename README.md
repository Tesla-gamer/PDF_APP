# PDF_APP
https://user-images.githubusercontent.com/70539485/143813055-07e035ca-99e9-41da-835c-8e2b0ee025b3.mp4






Dependency that we are using for pdf view:
First add and sync the project 
implementation 'com.github.barteksc:android-pdf-viewer:2.8.2'
We are loading the pdf files from the assets folder that are present in our app .The main con of this is it will increase the size of our app.if you want to decrease the size of your app so load only those pdfs arr in kbs and if you want load pdf files you can also do that by using a webview but it's no stable, I have already tried that thing and sometimes the pdf does'nt load .The best thing that you can perform is create a firebase link of your pdfs and show it in the recycler's view 
