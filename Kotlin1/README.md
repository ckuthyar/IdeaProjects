# kotlin1
## Assignment 1 - Simple Calculator
1a) Create a simple calculator to take two integer numbers and print the following in one single line sum1 - n1+n2 dif1 - n1-n2 prd1 - n1*n2 div1 - n1/n2 div2 - n1//n2 rem1 - n1%n2 exp1 - n1**n2 print(sum1, dif1, prd1, div1, div2, rem1, exp1)

1b) Create a function calc1(n1, n2) to take the 2 input values and print the output Assignment 1 - Create Mathematical Tables from 3 to 20

1c) Create a function calc2(n1, n2) to take the 2 input values, create a list list1, append all results to this list and return this list to the main program list1.append(sum1) list1.append(dif1) list1.append(prd1) list1.append(div1) list1.append(div2) list1.append(rem1) list1.append(exp1) return list1

In the main program, create a variable to catch the returned value and process it to print the required values result = calc1(8,4) print(result)

Assignment 2 - Simple Mathematical Tables
2a) Create Mathematical Tables from 3 to 20 through hard-coding

3 * 1 = 3
3 * 2 = 6
3 * 3 = 9
3 * 4 = 12
3 * 5 = 15
3 * 6 = 18
3 * 7 = 21
3 * 8 = 24
3 * 9 = 27
3 * 10 = 30

4 * 1 = 4
4 * 2 = 8
.........
4 * 10 = 40

20 * 1 = 20
20 * 2 = 40
...........
20 * 10 = 200.

2b) Take input from the keyboard and generate the same result start = input ("Enter first number")
end = input ("Enter second number")

2c) Take input from a file in1.txt containing 3 in first line and 8 in second line and generate the mathematical tables 3
8

2d) Take input from a file in2.txt containing 3,8 in the first line and generate the mathematical tables
3,8

2e) Send the results to an output file out1.txt. Use "\n" wherever required to generate a new line. The file content should look same as the console output

2f) Send the results to 6 different output files 3.txt, 4.txt, 5.txt, 6.txt, 7.txt, 8.txt depending on the start and end values given as input. ie. The output filename should be dynamically created for each and every mathematical table generated

2g) Using Python-Django, show the above Mathematical Tables from 3 to 8 as a dynamic HTML page like http://127.0.0.1:5000/tables. The Python logic should be in a function inside views.py

2h) Using Python-Django, take the inputs "start" and "end" as HTML Form inputs and generate the dynamic HTML page showing Mathematical Tables

Assignment 3 - School Clock Angle
School Clock is showing 9 am. Compute the angle between the Hour hand and the Minute hand. It should show Time: Angle in Degrees from 9:00 am to 8:55 pm with a spacing of 5 minutes.
Clock at 9:00 am Clues

What is the exact angle between Hour Hand and Minute Hand at 9 am ?
What is the exact angle between Hour Hand and Minute Hand at 9:05 pm ?
What is the exact angle between Hour Hand and Minute Hand at 9:10 pm ?
What is the exact angle between Hour Hand and Minute Hand at 9:15 pm ?
What is the speed of the hour hand ? ie
In one hour, how many degrees doe it move ?
In one minute, how many degrees does it move ?
In 5 minutes, how many degrees does it move ?
Output should be

09:00 - 90 degrees
09:05 - ... degrees
09:10 - .... degrees
.........
9:55 -

10:00 -
10:05 -
.........
10:55 -

11:00 -
11:05 -
........
11:55 -

20:00 -
20:05 -
.....
20:55 -

Assignment 4 - Andaman Prisoner Problem
4a) There are 100 prison cells in a row. All cells are locked. Jailer is given permission by the Prime Minister of India to release any number of prisoners.
In Round 1, Jailer opens all the doors.
In Round 2, he closes every alternate door (2, 4, 6...).
In Round 3, every third door (3, 6, 9,....) if Door is Open,, he closes it. If Door is Closed, he opens it.
In Round 4, every fourth door (4, 8, 12..), if Door is open,, he closes it. If Door is Closed, he opens it.
He does this for 100 Rounds. At the end, who are the lucky prisoners ?

Andaman Prisoner
4b) Prepare 2 letters. Letter1 to PM giving list of lucky prisoners and release date as today. Letter2 to Jailer giving list of unlucky prisoners who will be released after 4 weeks.

Assignment 5 - Gold Medal Problem
Find the topper in each subject.
Find the highest total marks scorer (gold medalist)

Amar,M,E80BD46CS0001,English:74,Maths:90,Physics:86,Chemistry:78,Biology:60,PASS
Babu,M,E80BD46CS0002,English:76,Maths:91,Physics:87,Chemistry:70,Biology:70,PASS
Charles,M,E80BD46CS0003,English:78,Maths:92,Physics:88,Chemistry:73,Biology:80,PASS
David,M,E80BD46CS0004,English:80,Maths:93,Physics:89,Chemistry:76,Biology:90,PASS
Ekalavya,M,E80BD46CS0005,English:82,Maths:94,Physics:90,Chemistry:79,Biology:100,PASS
Fabin,M,E80BD46CS0006,English:84,Maths:95,Physics:91,Chemistry:82,Biology:90,PASS
Govind,M,E80BD46CS0007,English:48,Maths:96,Physics:92,Chemistry:85,Biology:80,PASS
Harnish,M,E80BD46CS0008,English:56,Maths:97,Physics:93,Chemistry:88,Biology:70,PASS
Irene,F,E80BD46CS0009,English:64,Maths:98,Physics:95,Chemistry:91,Biology:60,PASS
James,M,E80BD46CS0010,English:72,Maths:99,Physics:96,Chemistry:92,Biology:70,PASS
Kamaraj,M,E80BD46CS0011,English:80,Maths:100,Physics:97,Chemistry:93,Biology:80,PASS
Latha,F,E80BD46CS00012,English:88,Maths:99,Physics:98,Chemistry:94,Biology:90,PASS
Manish,M,E80BD46CS0013,English:70,Maths:98,Physics:99,Chemistry:49,Biology:100,PASS
Nagesh,M,E80BD46CS0014,English:76,Maths:97,Physics:87,Chemistry:59,Biology:90,PASS
Omar,M,E80BD46CS0015,English:82,Maths:96,Physics:89,Chemistry:69,Biology:80,PASS
Padma,F,E80BD46CS0016,English:88,Maths:95,Physics:91,Chemistry:79,Biology:70,PASS
Queenie,F,E80BD46CS0017,English:60,Maths:94,Physics:93,Chemistry:89,Biology:75,PASS
Roopa,F,E80BD46CS0018,English:68,Maths:93,Physics:95,Chemistry:79,Biology:80,PASS
Sundar,M,E80BD46CS0019,English:77,Maths:92,Physics:97,Chemistry:80,Biology:85,PASS
Tara,F,E80BD46CS0020,English:79,Maths:93,Physics:99,Chemistry:81,Biology:90,PASS
Ullas,M,E80BD46CS0021,English:75,Maths:94,Physics:87,Chemistry:82,Biology:95,PASS
Vasu,M,E80BD46CS0022,English:85,Maths:95,Physics:89,Chemistry:83,Biology:90,PASS
Wendy,F,E80BD46CS0023,English:65,Maths:96,Physics:91,Chemistry:84,Biology:85,PASS
Xero,M,E80BD46CS0024,English:25,Maths:98,Physics:93,Chemistry:85,Biology:80,PASS
Yasmin,F,E80BD46CS0025,English:75,Maths:100,Physics:95,Chemistry:86,Biology:85,PASS
Zafar,M,E80BD46CS0026,English:75,Maths:98,Physics:87,Chemistry:79,Biology:89,PASS

Assignment 5 - Display Time in 9 Cities of the World - San Francisco, New York, London, Dubai, Bangalore, Singapore, Tokyo, Sydney, Wellington
The time in these cities is offset from UTC by these hours

San Francisco, -7
New York, -4
UTC, 0
London, +1
Dubai, +4
Bangalore, +5.30n
Singapore, +8
Tokyo, +9
Sydney, +10
Wellington, +12
Assignment 6 - Build a Right Diamond, Left Diamond and a Full Diamond by arranging the letters of a given word as below
F
Fu
Fun
Funw
Funwi
Funwit
Funwith
Funwit
Funwi
Funw
Fun
Fun
F
The above is a Right Diamond

F
       Fu
      Fun
     Funw
    Funwi
   Funwit
  Funwith

Assignment 7 - Build a Quiz Application based on the input text file GK1.txt
7a) File GK1.txt contains list of countries along with their respective capitals.
Create a Quiz module to display the first 10 questions in a random order
The question can be printed as "What is the capital of " + countries[0]
The responses can be stored in a separate list.
Correct response gets 10 marks, Wrong response gets 0 marks
At the end of the quiz, the marks are tabulated and total marks shown
For all the wrong answers, the actual correct answer is displayed along with the corresponding question

India,New Delhi
USA,WashingtonDC
UK,London
France,Paris
Italy,Rome
Russia,Moscow
Japan,Tokyo
China,Beijing
SriLanka,Colombo
Philippines,Manila

Ref: 

7b) File GK2.text contains a list of 9 Quiz questions along with answers separated by "$$" on either side. Prepare a Quiz Application similar to the above
Ref: 