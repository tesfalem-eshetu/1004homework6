For my Nim Game, I have tried to use one of the ways of approaching such 
problems- doing from the bottom up.I have tried to imagine the game being
 played in real life and projected that into programming.Structurally, the Nim 
 class calls the game class, and the game class calls both the computer and 
 human class.for the human class, the player would be able to choose its input
by using the scanner object.for the computer class, the major method call is 
move in which, as I have tried to state in the comment, it checks if marbles
 are in the smart pool and generate a random choice or will go with smart 
 moves as per the conditions.in the game class, I have tried to come up 
 with methods to generate randomly in the given boundaries.I have used
boolean values of True representing a computer, and false representing a
human, as Boolean makes things easier. this also helps to determine easily 
the winner, where if a turn is true human will win the game and else if false 
the computer will win

for the zipcode problem, my code mainly has three things the getzipcode method 
,the get barcode method, and the digit checker. I have used the Array lists to 
store the corresponding weight of the individual numbers. I have used while
loops to create the bar formatting of the zip code. for the getzipcode method, I
have implemented nested loops treating the string as 6 separate 5-character
 small strings in which  5 of the small strings give the actual zip code and
  the last small string gives the checkdigit .which is This is O(n), where n 
  is the length of the barcode.
    