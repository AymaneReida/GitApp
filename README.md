# GitApp

Développement d'une application mobile native Android avec deux activités :

  a. MainActivity : 
  
    Cette activité permet de :
      1- Saisir un mot clé « query » dans un EditText.
      2- En cliquant sur un bouton.
      3- Envoyer une requête vers l’API REST GIT pour chercher les utilisateurs avec le crière « query » saisi.
      4- Récupérer les résultats retournés au format JSON.
      5- Afficher les utilisateurs dans un ListView
      6- En cliquant sur un User de ListView, afficher une deuxième activité « GitRepositoriesActivity » en lui transmettant dans le message Intent le login de l’utilisateur.
    
  b. GitRepositoriesActivity : 
  
    Cette activité permet de :
      1- Récupérer le login de l’utilisateur dans les paramètres de l’Intent.
      2- Envoyer une requête vers l’API RESTful Git pour récupérer la liste des Repositories de cet utilisateur.
      3- Afficher les Repositories dans une ListView.

Cette application a été développée en langage Java en utilisant l'environnement Android studio.
