class Friendbook{
String besitzer;
FriendbookEntry eintrag1;
FriendbookEntry eintrag2;
FriendbookEntry eintrag3;
FriendbookEntry eintrag4;
FriendbookEntry eintrag5;//oder halt n array
}
class FriendbookEntry{
Author autor;
String freitext;
}
class Author{
String name;
Birthdate datum;
AuthorPreferences prefs;
String gender;
}
class AuthorPreferences{
String buch;
String tier;
String farbe;
String film;
String musik;
}
class Birthdate{
float date;//unix time
}

