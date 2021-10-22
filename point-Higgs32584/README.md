# 6/10 plateau schedule and test plan



points
 4 PS/TP in README
 2 definitions missing from README

   pdf missing  -- try this again
 2 pdf not 2up
   rebreak
   sane indent
 3 layout of code (presentation matters :) ) -- see general notes!
   globals ... ack!
   interface names
   poor naming
   10 OO structure
    3 excess instance variables

   file headers (see general notes)
 3 method headers (see general notes)
   wildcards in imports
   non-private attributes
 3 less than two interfaces
   use of get/set
   more than one static method
   repo includes derived files (e.g., *.class)
 3 fails to compile  -- file Pollock.java was corrupt :(
 3 fails to execute

 0 sometimes applicable methods
 0 don't comment the obvious
 0 class point should not mention CartesianPoint or PolarPoint








20 / 100 - plesae see me.  there is no source in your repo and the pdfs you push are all mal-formed!!

points
 4 PS/TP in README
 2 definitions missing from README

 1 pdf missing  -- from now on a single files unless ask otherwise
 2 pdf not 2up  -- files are corrupt ... did you preview them?
 3 rebreak
 3 sane indent
 3 layout of code (presentation matters :) ) -- see general notes!
 3 globals ... ack!
 2 interface names
 3 poor naming
10 OO structure
 3 excess instance variables

 3 file headers (see general notes)
 3 method headers (see general notes)
 3 wildcards in imports
 4 non-private attributes
 3 less than two interfaces
 4 use of get/set
 4 more than one static method
 3 repo includes derived files (e.g., *.class)
 3 fails to compile
 3 fails to execute

 0 sometimes applicable methods
 0 don't comment the obvious
 0 class point should not mention CartesianPoint or PolarPoint






# CS 312 Assignment 1
# What's the point?

[Assignment Sheet](http://www.cs.loyola.edu/~binkley/312/asn1.pdf)

## Definitions
x- cartesian point x-coordinate

y- cartesian point y-coordinate

by_x - how much x or theta(converted) is translated by 

by_y- how much y or Radius(converted) is translated by 

RotatedBy- how much the angle is rotated by

Theta- x-coordinate of Polar Point

Radius- y-coordinate of Polar Point

## Plateau Schedule
1. instantiate abstract class for the cartesian point and the polar point, Name Will be Pollock(the Artist)

2. Establish concrete class for Polar Points

3. Establish concrete class for Cartesian Points
4. call abstract class in both classes write code for differing actions for Translating
5. write subclass for translating Cartesian
6. write subclass for rotating Cartesian
7. write subclass for translating Polar
8. write subclass for rotating Polar
9. write the test case

## Test Plan
-- take a look at the test case examples i sent out.
-- each test case include input, output, and rationale.  i don't grok how what you have below maps into those three categories.

(Theta,r)(x,y)
(20,5)-->(2,3)
(39, 22)-->(3,5)
(24, 55)-->(5,10)
(42,65)-->(6,7)

