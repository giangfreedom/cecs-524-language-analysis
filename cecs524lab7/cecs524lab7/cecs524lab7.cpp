// cecs524lab7.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <stdlib.h>
#include <time.h>
#include <iostream>
#include <string>
#include "line.h"
#include "point.h"
using namespace std;
int main()
{
	point point1(1.0,2.0);
	point point2(2.0,1.0);
	point point3(3.0,2.0);
	point point4(4.0,1.0);

	cout << point1.getXcord() << "," << point1.getYcord() << endl;
	cout << point2.getXcord() << "," << point2.getYcord() << endl;
	cout << point3.getXcord() << "," << point3.getYcord() << endl;
	cout << point4.getXcord() << "," << point4.getYcord() << endl;

	line l1 (point1,point2);
	line l2 (point3,point4);
	
	double length = 0.0;
	double s1 = 0.0;
	double s2 = 0.0;

	int stop;

	if (l1 == l2) {
		cout << "line 1 equal line 2" << endl;
		cout << l1 << endl;
		cout << l2 << endl;
		length = l1.distance(l2);
		s1 = l1.slope();
		s2 = l2.slope();
		cout << "distance of l1 and l2 is : " << length << endl;
		cout << "l1 slope is : " << s1 << endl;
		cout << "l2 slope is : " << s2 << endl;
	}
	else if (l1 != l2) {
		cout << "line 1 not equal line 2" << endl;
		cout << l1 << endl;
		cout << l2 << endl;
		length = l1.distance(l2);
		s1 = l1.slope();
		s2 = l2.slope();
		cout << "distance of l1 and l2 is : " << length << endl;
		cout << "l1 slope is : " << s1 << endl;
		cout << "l2 slope is : " << s2 << endl;
	}
	else {
		cout << "something went wrong with the calculation" << endl;
		cout << l1 << endl;
		cout << l2 << endl;
		length = l1.distance(l2);
		s1 = l1.slope();
		s2 = l2.slope();
		cout << "distance of l1 and l2 is : " << length << endl;
		cout << "l1 slope is : " << s1 << endl;
		cout << "l2 slope is : " << s2 << endl;
	}
	cin >> stop;
    return 0;
}

