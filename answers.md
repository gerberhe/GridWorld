Harrison Gerber GridWorld Answers
_________________________________
PART 1
---------------------------------
Set 1

1) Not always, if it cannot move in a particular direction,
the bug will turn until it faces a direction in which it can
move, and then it moves in that direciton.
2) Any open direction that it can move in and that the bug
is currently facing.
3) Turns until it has an open path in which it can move.
4) Flowers that change colors.
5) Once the bug reaches the edge of the grid, it pretty much
just stays on the border and keeps moving around the edge.
6) Turns 45 degrees and moves in that direction.
7) No, but they change colors as if they are wilting.
8) Stated above.
9) No, the rock is a rock and that's all there is to say about that.
10) No, one of the actors will have priority over another, and
the actor with the highest priority will be the one occupying
that particular grid space.

Exercises

1)
Degrees | Compass Direction

0       | North
45      | North-East
90      | East
135     | South-East
180     | South
225     | South-West
270     | West
315     | North-West
360     | North

2) Can move in any direction, can move it any distance, gives an
error if you try to move it outside the grid.
3) void SetColor(java.awt.Color)
4) It disappeared (got squishy squashed)

_________________________________
PART 2
---------------------------------
Set 2

1) It determines how long one side of the "square" that the BoxBug
moves in is, how far it will move in one direction before turning
90 degrees and moving that same distance again and repeating that
process indefinitely.
2) It counts how many "steps" the BoxBug has taken in it's moving
process and uses that information to determine if the BoxBug can
move and continue to move.
3) Because the "turn" method only rotated the bug 45 degrees, and
in order for it to move in a square path, it has to rotate 90
degrees, so the turn method is called twice to make this happen.
4) Because BoxBug is a child of the parent class Bug, which has
the move method, so since BoxBux is a child class, it can use the
parent methods.
5) Yes, because once it is constructed, it's information is set
and the program as it is does not allow the user to change
information that was used to construct the bug once it has been
constructed.
6) Yes, if there is an obstacle in it's path that it cannot pass
through or move through in any way.
7) When the bug is initially constructed/created, after that it 
will always be greater than 0.

Exercises

1) The CircleBug only rotates 45 degrees once it completes it's
given length, making it move diagonally as well as horizontally
and vertically.
2) This exercise completed in the SpiralBug and SpiralBugRunner
code.
3) This exercise completed in the ZBug and ZBugRunner
code.

_________________________________
PART 3
---------------------------------
Set 3

1) loc1.getRow();
2) false
3) loc3 = (4, 4) after this statement is executed.
4) dir = 135 (degrees)
5) It takes in the direction parameter that is passed into it
and finds the adjacent location in that particular direction.

Set 4

1) Number of objects in grid - Every time an object is put in
the grid, add one to a 'numObjects' integer variable.
Number of open spaces in a grid - Take the total number of
grid spaces (width X height), and then subtract 'numObjects'
from that value in order to get the number of open spaces.
2) isValid(Location (10,10));
3) Inside the appendices.
4) No, because a default array can only hold default objects,
such as integers or doubles. an ArrayList can hold any type of
object, such as making an ArrayList of type Location.

Set 5
1) Location, color, movement
2) Direction is North, color is whatever color is passed into
the constructor.
3) Not really sure on this one, I believe it is a class so that
it can have child classes that easily access and modify the base
properties of what it means to be an actor.
4) 

Set 6

_________________________________
Part 4
---------------------------------
Set 7

1) getActors(), processActors(), getMoveLocations(),
selectMoveLocation(), makeMove()
2) Getting locations/info about all other actors, processing them
(IE making them do something or doing something based on them),
finding any and all available move locations based on set
preconditions or the information provided by the other actors, 
choosing one of the locations to mvoe to, and then finally making
that move.
3) You should override the getActors() method in subclasses that
need to look in different ways or look elsewhere for actors in the
grid that the Critter subclasses can process.
4) Change their color, make them turn a certain number of times, or
make them move a certain number of steps in a specified direction.
5) getMoveLocations(), selectMoveLocation(), and makeMove(). The
first method finds available locations that the Critter can move to,
the second method selects one of those locations either randomly or
based on specific preconditions, and the third method actually makes
the movement to that selected location.
6) There is no constructor because the Critter class extends Actor,
so it is constructed using the same information as defined in the
Actor class. It is not necessary, nor relevant to include a constructor
specifically for a Critter in the Critter class if it can be defined
in the parent Actor class.

Set 8

1) Because the Chameleon Critter overrode the processActors() method,
and did different things inside of it (changed color based on 
neighboring actors), and that method is called when act() is called,
so there was no need to change the act() method for the Chameleon
Critter.
2) Beceause it overrides some of the information of the makeMove()
method, but still also needs to call the default move information, so
it is easier to just call the makeMove() method of the parent class
(thus using super) after it has done whatever it needed to do that
wasn't included in the parent makeMove() method instead of re-writting
all of that code inside of the new/overwritten makeMove() method.
3) Inside of ChameleonCritter's makeMove() method, you would need to
write the information that is necessary in order for an actor to drop
a flower after moving, so essentially copying that information from
the default Bug. Since Critter is not a subclass of Bug, the information
to drop a flower cannot just be "supered", or accessed, down the line
of parents and children in this instance.
4) Because it gets actors in the grid the same way that all other
Critters do, so it just uses the parent getActors() method.
5) The Actor class contains the getLocation() method.
6) A Critter can access its own grid through the act() method, thus
through the Actor super class.

Set 9

1) Because it processes actors the same way that the Critter super
class does, so it doesn't need to override that method.
2) It does not always eat all neighboring actors, only ones diagonal
to it, not even in front of it.
3) The method is used so that a CrabCritter can find neighboring
locations that are feasible to have an actor that the CrabCritter
can eat.
4) Locations possible are (3,5), (2,5) and (4,5).
5) CrabCritter moves side to side (left to right), and a standard
Critter moves only forward, but in differnet directions.
6) It turns if it cannot move left OR right. If it can move in
either direction or both, it will do so.
7) Because cannibalism is not an OK thing.

Exercises

1) Completed in ChameleonCritter code.
2) Completed in ChameleonKid and ChamKidRunner code.
3) Completed in RockHound and RockHoundRunner code.